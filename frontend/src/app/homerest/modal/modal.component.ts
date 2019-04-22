import { Component, OnInit } from '@angular/core';
import { HttpErrorResponse } from '@angular/common/http';
import { FormControl } from '@angular/forms';
import { NgbModal, ModalDismissReasons } from '@ng-bootstrap/ng-bootstrap';

import { HomeserviceService } from '../../homeservice.service';
import { Router } from '@angular/router';
import { AdminServiceService } from '../../services/admin-service.service';

@Component({
  selector: 'modal',
  templateUrl: './modal.component.html',
  styleUrls: ['./modal.component.css']
})
export class ModalComponent implements OnInit {
  model:any = {}
  private elements
  constructor(private admin:AdminServiceService,private route:Router) { }

  ngOnInit() {
  }

  onSubmit1(value:any){
    console.log(value)
    //console.log(this.model+"model")
    this.admin.setDonor(value).subscribe(
  
      (res)=>{ 
          console.log(JSON.stringify(res)+"Success get Depet all ");
          this.elements=res;
          if(this.elements){
           
            this.route.navigate(['home/blood'])
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




onClick(value:any){
  console.log(value)
  //console.log(this.model+"model")
  this.admin.setrec(value).subscribe(

    (res)=>{ 
        console.log(JSON.stringify(res)+"Success get Depet all ");
        this.elements=res;
        if(this.elements){
         localStorage.setItem("rev",this.elements.reciverId)
          this.route.navigate(['home/search'])
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
 