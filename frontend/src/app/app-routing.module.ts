import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { IntroComponent } from './intro/intro.component';
import { AdminLoginComponent } from './Admin-User/admin-login/admin-login.component';
import { PostComponent } from './Admin-User/post/post.component';
import { AdminloginComponent } from './adminlogin/adminlogin.component';
import { EventComponent } from './Admin-User/event/event.component';
import { BlootypeComponent } from './Admin-User/blootype/blootype.component';
import { BloodgroupComponent } from './Admin-User/bloodgroup/bloodgroup.component';
import { DonorComponent } from './Admin-User/donor/donor.component';
import { ReciverComponent } from './Admin-User/reciver/reciver.component';
import { ReviewComponent } from './Admin-User/review/review.component';
import { UserdashComponent } from './user/userdash/userdash.component';
import { UserbloodtypeComponent } from './user/userbloodtype/userbloodtype.component';
import { UserbloodbankComponent } from './user/userbloodbank/userbloodbank.component';
import { UserpostComponent } from './user/userpost/userpost.component';
import { UsereventComponent } from './user/userevent/userevent.component';
import { UserreciverComponent } from './user/userreciver/userreciver.component';
import { ProfileComponent } from './Admin-User/profile/profile.component';
import { HomebaseComponent } from './homebase/homebase.component';
import { HomenavComponent } from './homenav/homenav.component';
import { SearchComponent } from './search/search.component';


const routes: Routes = [
  { path: '', redirectTo:'/home' ,pathMatch:'full'},
  { path: 'home', component: IntroComponent,children:[
    { path: '', redirectTo:'blood' ,pathMatch:'full'},
    { path: 'blood', component: HomebaseComponent},
    {path:"emergency",component:HomenavComponent},
    {path:"search",component:SearchComponent},
  ]},
  
  { path: 'user', component: UserdashComponent,children:[
    { path: '', redirectTo:'Userdashboard' ,pathMatch:'full'},
    { path: 'Userdashboard', component: UserpostComponent },
    { path: 'bloodbanks', component: UserbloodbankComponent  },
    { path: 'bloodgroups', component: UserbloodtypeComponent  },
    { path: 'events', component: UsereventComponent  },
    { path: 'recivers', component: UserreciverComponent  }
  ] },
  { path: 'adminlogin', component: AdminloginComponent  },
  { path: 'admin', component: AdminLoginComponent,children:[
    { path: '', redirectTo:'dashboard' ,pathMatch:'full'},
    { path: 'dashboard', component: PostComponent },
    { path: 'dashboard/:id', component: ProfileComponent },
    { path: 'event/:id', component: EventComponent  },
    { path: 'bloodbank', component: BlootypeComponent  },
    { path: 'bloodgroup', component: BloodgroupComponent  },
    { path: 'donor/:id', component: DonorComponent },
    { path: 'reciver', component: ReciverComponent },
    { path: 'review/:id', component: ReviewComponent  }
  ] }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
