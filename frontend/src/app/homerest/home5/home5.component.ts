import { Component, OnInit } from '@angular/core';
import { HttpErrorResponse } from '@angular/common/http';
import { HomeserviceService } from '../../homeservice.service';

@Component({
  selector: 'home5',
  templateUrl: './home5.component.html',
  styleUrls: ['./home5.component.css']
})
export class Home5Component implements OnInit {
private elements;
  constructor(private _service:HomeserviceService){}
  ngOnInit(){
      this._service.getReviews().subscribe(

        (res)=>{ 
            console.log(JSON.stringify(res)+"Success get Depet all ");
            this.elements=res;
            
    //return res;
        },
        (error:HttpErrorResponse)=>{
            this.elements=error;
           // console.log(error+"failure ");
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