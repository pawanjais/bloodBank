import { Component, OnInit } from '@angular/core';
import { AdminServiceService } from 'src/app/services/admin-service.service';
import { HttpErrorResponse } from '@angular/common/http';
import { ActivatedRoute, ParamMap } from '@angular/router';

@Component({
  selector: 'app-donor',
  templateUrl: './donor.component.html',
  styleUrls: ['./donor.component.css']
})
export class DonorComponent implements OnInit {
  active:any
  
  constructor(private admin:AdminServiceService,private aroute:ActivatedRoute) { }
  data:String
  ngOnInit() {
    
    this.aroute.paramMap.subscribe(
      (res:ParamMap)=>{
        this.data=res.get('id')
      }
    )
    this.admin.getdonordata().subscribe(
      
      (res)=>{ 
          console.log(JSON.stringify(res)+"donor ");
          this.active=res;
          
          
      },
      (error:HttpErrorResponse)=>{
          this.active=error;
          if(error instanceof Error){
          
          console.log("Client side error"+error);
          }
          else
          {
          console.log("server side error"+error);
          }
          console.log("get by id "+this.active.json);
      }
          
    );
    console.log(this.active);
  }

}
