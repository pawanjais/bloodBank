import { Component, OnInit } from '@angular/core';
import { HttpErrorResponse } from '@angular/common/http';
import { AdminServiceService } from '../../services/admin-service.service';

@Component({
  selector: 'app-userbloodtype',
  templateUrl: './userbloodtype.component.html',
  styleUrls: ['./userbloodtype.component.css']
})
export class UserbloodtypeComponent implements OnInit {

  ele:any
  constructor(private admin:AdminServiceService) { }

  ngOnInit() {

    this.admin.getblooddata().subscribe(
  
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
