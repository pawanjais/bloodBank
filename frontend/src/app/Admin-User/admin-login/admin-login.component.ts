import { Component, OnInit, Input, ViewChild, AfterViewInit } from '@angular/core';

import { HttpErrorResponse } from '@angular/common/http';
import { AdminComponent } from '../admin/admin.component';
import { AdminServiceService } from '../../services/admin-service.service';
import { Router } from '@angular/router';

//import * as $ from 'jquery';

declare var $: any;
declare var jQuery: any;

@Component({
  selector: 'app-admin-login',
  templateUrl: './admin-login.component.html',
  styleUrls: ['./admin-login.component.css']
})
export class AdminLoginComponent implements OnInit {
  model:any = {}
  private elements
  profile:String="profile"
  addAdmin:String="addAdmin"


  constructor(private admin:AdminServiceService,private route:Router) { }
  
  ngOnInit() {
    this.admin.getdata().subscribe(
  
      (res)=>{ 
          console.log(JSON.stringify(res)+"adminnnnn ");
          this.elements=res;
          
          
      },
      (error:HttpErrorResponse)=>{
          this.elements=error;
          if(error instanceof Error){
          
          console.log("Client side error"+error);
          }
          else
          {
          console.log("server side error"+error);
          }
          console.log("get by id "+this.elements.json);
      }
          
    );
    console.log(this.elements);
  }

  
  
  
/*   onSubmit(){
    console.log(this.model+"model")
    this.admin.login(this.model).subscribe(
  
      (res)=>{ 
          console.log(JSON.stringify(res)+"Success get Depet all ");
          this.elements=res;
          
      },
      (error:HttpErrorResponse)=>{
          this.elements=error;
          if(error instanceof Error){
          
          console.log("Client side error"+error);
          }
          else
          {
          console.log("server side error"+error);
          }
          console.log("get by id "+this.elements.json);
      }
          
    );
    
    console.log(this.elements);
}
 */

logout(){
  //this.elements=null
  localStorage.removeItem("user")
  this.route.navigate(['adminlogin'])
}




}
