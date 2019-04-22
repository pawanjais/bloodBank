import { Component, OnInit } from '@angular/core';
import { HttpErrorResponse } from '@angular/common/http';
import { ParamMap, ActivatedRoute } from '@angular/router';
import { AdminServiceService } from '../../services/admin-service.service';

@Component({
  selector: 'app-userevent',
  templateUrl: './userevent.component.html',
  styleUrls: ['./userevent.component.css']
})
export class UsereventComponent implements OnInit {

  id:String="#mycard-collapse"
  data:String
  active:any
  constructor(private admin:AdminServiceService,private aroute:ActivatedRoute) { }

  ngOnInit() {
    
    this.admin.geteventsdata().subscribe(
      
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
