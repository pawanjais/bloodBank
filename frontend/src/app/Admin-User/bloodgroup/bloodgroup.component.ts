import { Component, OnInit } from '@angular/core';
import { AdminServiceService } from '../../services/admin-service.service';
import { HttpErrorResponse } from '@angular/common/http';

@Component({
  selector: 'app-bloodgroup',
  templateUrl: './bloodgroup.component.html',
  styleUrls: ['./bloodgroup.component.css']
})
export class BloodgroupComponent implements OnInit {
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
