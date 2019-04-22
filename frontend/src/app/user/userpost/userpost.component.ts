import { Component, OnInit } from '@angular/core';
import { HttpErrorResponse } from '@angular/common/http';
import { AdminServiceService } from '../../services/admin-service.service';
import { ParamMap, ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-userpost',
  templateUrl: './userpost.component.html',
  styleUrls: ['./userpost.component.css']
})
export class UserpostComponent implements OnInit {

  ele:any
  data:String
  active:any
  model:any = {}
  private elements
  constructor(private admin:AdminServiceService,private aroute:ActivatedRoute,private route:Router) { }


  
  ngOnInit() {
    this.aroute.paramMap.subscribe(
      (res:ParamMap)=>{
        this.data=res.get('id')
        this.admin.getuserdata().subscribe(
  
          (res)=>{ 
              console.log(JSON.stringify(res)+"bloodtype ");
              this.ele=res;
              console.log(this.ele)
              
              
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
    )
    
  
  }


  onSubmit(){
    console.log(this.model+"model")
    this.admin.addAdmin(this.model).subscribe(
  
      (res)=>{ 
          console.log(JSON.stringify(res)+"Success get Depet all ");
          this.elements=res;
          if(this.elements){
            localStorage.setItem('user',this.elements.adminName);
            //this.route.navigate([''])
          }
          
          
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

}
