import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {AllTemplateFrontComponent} from "./FrontOffice/all-template-front/all-template-front.component";
import {AllTemplateBackComponent} from "./BackOffice/all-template-back/all-template-back.component";  
import { HomeFrontComponent } from './FrontOffice/home-front/home-front.component';
import { AboutFrontComponent } from './FrontOffice/about-front/about-front.component';
import { ServiceFrontComponent } from './FrontOffice/service-front/service-front.component';
import { PortfolioComponent } from './FrontOffice/portfolio/portfolio.component';
import { ContactComponent } from './FrontOffice/contact/contact.component';
import { AllTemplateUserComponent } from './User/all-template-user/all-template-user.component';
import { RegisterComponent } from './User/register/register.component';
import { LoginComponent } from './User/login/login.component';
import { PasswordComponent } from './User/password/password.component';

const routes: Routes = [
  {
    path: '', 
    component: AllTemplateFrontComponent,
    children: [
      { path: '', component: HomeFrontComponent },   // Home visible par défaut
      { path: 'about', component: AboutFrontComponent }, // About visible quand on va sur /about
      {path: 'service', component:ServiceFrontComponent},
      {path: 'portfolio', component:PortfolioComponent},
      {path: 'contact', component:ContactComponent},

    ]
  },

  {
    path: 'admin', 
    component: AllTemplateBackComponent
  },
  {
    path: 'register', 
    component: RegisterComponent // Route indépendante pour RegisterComponent
  },
  { path: 'login', component: LoginComponent },
  { path: 'password', component: PasswordComponent },

  {
    path: 'user', 
    component: AllTemplateUserComponent,
    children: [
      { path: 'register', component: RegisterComponent } 
    ]
  }
];



@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
