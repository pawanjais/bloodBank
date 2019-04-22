import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class HomeserviceService {

  data:any;
constructor(private _http:HttpClient){}

getReviews():any{
    
    return this._http.get("http://localhost:3030/onload");
    }
    getBanks():any{
        return this._http.get("http://localhost:3030/banks");
    }

    setDonor(data):any{
        console.log(JSON.stringify(data));
        return this._http.post("http://localhost:3030/RegistrationController2",data);
    }

    setreciver(data):any{
        console.log(JSON.stringify(data));
        return this._http.post("http://localhost:3030/RegistrationControllerReciever",data);
    }

}
