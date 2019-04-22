import { Component, OnInit } from '@angular/core';
import { AdminServiceService } from '../../services/admin-service.service';
import { ActivatedRoute, ParamMap } from '@angular/router';
import { HttpErrorResponse } from '@angular/common/http';

@Component({
  selector: 'app-event',
  templateUrl: './event.component.html',
  styleUrls: ['./event.component.css']
})
export class EventComponent implements OnInit {
  id:String="#mycard-collapse"
  data:String
  active:any
  count=1;
  constructor(private admin:AdminServiceService,private aroute:ActivatedRoute) { }

  ngOnInit() {
    this.aroute.paramMap.subscribe(
      (res:ParamMap)=>{
        this.data=res.get('id')
      }
    )
    this.admin.geteventdata().subscribe(
      
      (res)=>{ 
          console.log(JSON.stringify(res)+"event ");
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
