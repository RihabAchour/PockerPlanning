import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { DeveloppeurComponent } from './layout/developpeur/developpeur.component';

const routes: Routes = [
  { path: '', component: DeveloppeurComponent, children:[
    

    
  ] }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class DeveloppeurRoutingModule { }
