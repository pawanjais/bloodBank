import { Injectable } from '@angular/core';
import { HttpClient, HttpErrorResponse,HttpClientModule } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AdminServiceService {

  data:String;
  data1:String;
  data4:String;
  constructor(private _http:HttpClient) { }

  login(user:any):any{
    console.log(user+"admin authentication")
    return this._http.post("http://localhost:3030/adminController", user);
    }

  userlogin(user:any):any{
    console.log(user+"user authentication")
    return this._http.post("http://localhost:3030/userController", user);
    }

  addAdmin(user:any):any{
    console.log(user+"Add/Update admin")
    return this._http.post("http://localhost:3030/addAdmin", user);
    }

  getdata():any{
    this.data=localStorage.getItem("user")
    console.log(this.data+"Get the admin dashboard list")
    return this._http.post("http://localhost:3030/admindata", this.data);
  }

  getcurrdata():any{
    this.data=localStorage.getItem("user")
    console.log(this.data+"Get the admin dashboard list")
    return this._http.post("http://localhost:3030/curradmindata", this.data);
  }

  getuserdata():any{
    this.data=localStorage.getItem("user")
    console.log(this.data+"Get the admin dashboard list")
    return this._http.post("http://localhost:3030/userdata", this.data);
  }

  addbloodbank(user:any):any{
    console.log(this.data+"Get the admin dashboard list")
    return this._http.post("http://localhost:3030/addbloodbank", user);
  }

  getadminlistdata():any{
    console.log(this.data+"Get the blood group list")
    return this._http.get("http://localhost:3030/adminlistdata");
  }


  getblooddata():any{
    console.log(this.data+"Get the blood group list")
    return this._http.get("http://localhost:3030/adminblooddata");
  }

  getdonordata():any{
    this.data="True"
    console.log(this.data+"Get the donor list")
    return this._http.post("http://localhost:3030/admindonordata",this.data);
  }
        
  geteventdata():any{
    console.log(this.data+"Get the event list")
    return this._http.get("http://localhost:3030/admineventdata");
  }
  geteventsdata():any{
    console.log(this.data+"Get the event list")
    return this._http.get("http://localhost:3030/userevent");
  }

  getreviewdata():any{
    console.log(this.data+"Get the event list")
    return this._http.get("http://localhost:3030/adminreviewdata");
  }

  getbloodbankdata():any{
    console.log(this.data+"Get the event list")
    return this._http.get("http://localhost:3030/adminbloodbankdata");
  }


  setDonor(data):any{
    console.log(JSON.stringify(data));
    return this._http.post("http://localhost:3030/RegistrationController2",data);
}

searchrec():any{
  this.data4=localStorage.getItem("rev")
 
  return this._http.post("http://localhost:3030/Search",this.data4);
}


setrec(data):any{
  console.log(JSON.stringify(data));
  return this._http.post("http://localhost:3030/saverev",data);
}
          
          
}
