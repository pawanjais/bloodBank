import { Component, OnInit, Input } from '@angular/core';
import { AdminLoginComponent } from '../admin-login/admin-login.component';
import { HttpErrorResponse } from '@angular/common/http';
import { AdminServiceService } from 'src/app/services/admin-service.service';
import { Router, ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-admin',
  templateUrl: './admin.component.html',
  styleUrls: ['./admin.component.css']
})
export class AdminComponent implements OnInit {

  ele:any
  constructor(private admin:AdminServiceService,private route:Router,private rou:ActivatedRoute) { }

  ngOnInit() {
    this.admin.getadminlistdata().subscribe(
  
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
