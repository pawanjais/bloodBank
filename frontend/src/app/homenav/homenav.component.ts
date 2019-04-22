import { Component, OnInit } from '@angular/core';
import { HttpErrorResponse } from '@angular/common/http';
import { AdminServiceService } from '../services/admin-service.service';
import { HomeserviceService } from '../homeservice.service';

@Component({
  selector: 'app-homenav',
  templateUrl: './homenav.component.html',
  styleUrls: ['./homenav.component.css']
})
export class HomenavComponent implements OnInit {

  constructor(private _service:HomeserviceService) { }
  private bloodBanks;
  ngOnInit() {
    this._service.getBanks().subscribe(

      (res)=>{ 
          console.log(JSON.stringify(res)+"Success get Depet all ");
          this.bloodBanks=res;
          
  //return res;
      },
      (error:HttpErrorResponse)=>{
          this.bloodBanks=error;
         // console.log(error+"failure ");
  if(error instanceof Error){
  
  console.log("Client side error"+error);
  }
  else
  {
  console.log("server side error"+error);
  }
  console.log("get by id "+this.bloodBanks.json);
  }
  
  );
    console.log(this.bloodBanks);
}

}
