import { Component, OnInit } from '@angular/core';
import { HttpErrorResponse } from '@angular/common/http';
import { AdminServiceService } from '../../services/admin-service.service';

@Component({
  selector: 'app-userbloodbank',
  templateUrl: './userbloodbank.component.html',
  styleUrls: ['./userbloodbank.component.css']
})
export class UserbloodbankComponent implements OnInit {

  ele:any
  constructor(private admin:AdminServiceService) { }

  ngOnInit() {
    this.admin.getbloodbankdata().subscribe(
  
      (res)=>{ 
          console.log(JSON.stringify(res)+"bloodtype ");
          this.ele=res;
          
          
      },
      (error:HttpErrorResponse)=>{
          this.ele=error;
          if(error instanceof Error){
          
          console.log("Client side error"+error);
          }
          else
          {
          console.log("server side error"+error);
          }
          console.log("get by id "+this.ele.json);
      }
          
    );
    console.log(this.ele);
  }

}
