import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { IntroComponent } from './intro/intro.component';
import * as $ from 'jquery'
import { AdminLoginComponent } from './Admin-User/admin-login/admin-login.component';
import { AdminComponent } from './Admin-User/admin/admin.component';
import { DashnavComponent } from './Admin-User/dashnav/dashnav.component';
import { DashsectionComponent } from './Admin-User/dashsection/dashsection.component';
import { EventComponent } from './Admin-User/event/event.component';
import { ReviewComponent } from './Admin-User/review/review.component';
import { ReciverComponent } from './Admin-User/reciver/reciver.component';
import { BloodgroupComponent } from './Admin-User/bloodgroup/bloodgroup.component';
import { BlootypeComponent } from './Admin-User/blootype/blootype.component';
import { PostComponent } from './Admin-User/post/post.component';
import { AdminloginComponent } from './adminlogin/adminlogin.component';
import { DonorComponent } from './Admin-User/donor/donor.component';
import { UserComponent } from './user/user.component';
import { UserdashnavComponent } from './user/userdashnav/userdashnav.component';
import { UsereventComponent } from './user/userevent/userevent.component';
import { UserdashComponent } from './user/userdash/userdash.component';
import { UserbloodbankComponent } from './user/userbloodbank/userbloodbank.component';
import { UserbloodtypeComponent } from './user/userbloodtype/userbloodtype.component';
import { UserreciverComponent } from './user/userreciver/userreciver.component';
import { UserpostComponent } from './user/userpost/userpost.component';
import { ProfileComponent } from './Admin-User/profile/profile.component';
import { HomenavComponent } from './homenav/homenav.component';
import { HomebaseComponent } from './homebase/homebase.component';
import { HomeImageComponent } from './homerest/home-image/home-image.component';
import { HomeComponent2Component } from './homerest/home-component2/home-component2.component';
import { Home3ImageComponent } from './homerest/home3-image/home3-image.component';
import { Home4Component } from './homerest/home4/home4.component';
import { Home5Component } from './homerest/home5/home5.component';
import { ModalComponent } from './homerest/modal/modal.component';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { SearchComponent } from './search/search.component';

@NgModule({
  declarations: [
    AppComponent,
    AdminLoginComponent,
    AdminComponent,
    DashnavComponent,
    HomeComponent,
    IntroComponent,
    DashsectionComponent,
    EventComponent,
    ReviewComponent,
    ReciverComponent,
    BloodgroupComponent,
    BlootypeComponent,
    PostComponent,
    AdminloginComponent,
    DonorComponent,
    UserComponent,
    UserdashnavComponent,
    UsereventComponent,
    UserdashComponent,
    UserbloodbankComponent,
    UserbloodtypeComponent,
    UserreciverComponent,
    UserpostComponent,
    ProfileComponent,
    HomenavComponent,
    HomebaseComponent,
    HomeImageComponent,
    HomeComponent2Component,
    Home3ImageComponent,
    Home4Component,
    Home5Component,
    ModalComponent,
    SearchComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule,
    NgbModule
  ],
  providers: [],
  bootstrap: [HomeComponent]
})
export class AppModule { }
