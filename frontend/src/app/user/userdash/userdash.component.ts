import { Component, OnInit } from '@angular/core';
import { HttpErrorResponse } from '@angular/common/http';
import { AdminServiceService } from '../../services/admin-service.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-userdash',
  templateUrl: './userdash.component.html',
  styleUrls: ['./userdash.component.css']
})
export class UserdashComponent implements OnInit {

  model:any = {}
  private elements



  constructor(private admin:AdminServiceService,private route:Router) { }
  
  ngOnInit() {
    this.admin.getuserdata().subscribe(
  
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

  logout(){
    //this.elements=null
    localStorage.removeItem("user")
    this.route.navigate(['home/blood'])
  }

}
