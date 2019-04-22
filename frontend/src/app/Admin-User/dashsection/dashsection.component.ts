import { Component, OnInit } from '@angular/core';
import { HttpErrorResponse } from '@angular/common/http';
import { AdminServiceService } from 'src/app/services/admin-service.service';
import { Router, ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-dashsection',
  templateUrl: './dashsection.component.html',
  styleUrls: ['./dashsection.component.css']
})
export class DashsectionComponent implements OnInit {

  ele:any
  constructor(private admin:AdminServiceService,private route:Router,private rou:ActivatedRoute) { }

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


  change(){
    this.route.navigate(['../bloodbank'], {relativeTo: this.rou})
  }
}
