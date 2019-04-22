import { Component, OnInit } from '@angular/core';
import { HttpErrorResponse } from '@angular/common/http';
import { Router } from '@angular/router';
import { AdminServiceService } from '../services/admin-service.service';

@Component({
  selector: 'app-intro',
  templateUrl: './intro.component.html',
  styleUrls: ['./intro.component.css']
})
export class IntroComponent implements OnInit {

  model:any = {}
  private elements
  constructor(private admin:AdminServiceService,private route:Router) { }

  ngOnInit() {
  }

  navbarOpen = false;

  toggleNavbar() {
    this.navbarOpen = !this.navbarOpen;
  }

  onSubmit(){
    console.log(this.model+"model")
    this.admin.userlogin(this.model).subscribe(
  
      (res)=>{ 
          console.log(JSON.stringify(res)+"Success get Depet all ");
          this.elements=res;
          if(this.elements){
            localStorage.setItem('user',this.elements.donorId);
            this.route.navigate(['user'])
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
