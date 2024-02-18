import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { DeveloppeurRoutingModule } from './developpeur-routing.module';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { DeveloppeurComponent } from './layout/developpeur/developpeur.component';



@NgModule({
  declarations: [
    DeveloppeurComponent
  ],
  imports: [
    CommonModule,
    DeveloppeurRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule
  ]
})
export class DeveloppeurModule { }
