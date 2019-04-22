import { Component, OnInit } from '@angular/core';
import { AdminServiceService } from '../../services/admin-service.service';
import { ActivatedRoute, ParamMap } from '@angular/router';
import { HttpErrorResponse } from '@angular/common/http';

@Component({
  selector: 'app-review',
  templateUrl: './review.component.html',
  styleUrls: ['./review.component.css']
})
export class ReviewComponent implements OnInit {

  data:String
  active:any
  constructor(private admin:AdminServiceService,private aroute:ActivatedRoute) { }

  ngOnInit() {
    this.aroute.paramMap.subscribe(
      (res:ParamMap)=>{
        this.data=res.get('id')
      }
    )
    this.admin.getreviewdata().subscribe(
      
      (res)=>{ 
          console.log(JSON.stringify(res)+"review ");
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
