import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { ChefProjetRoutingModule } from './chef-projet-routing.module';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { ChefProjetComponent } from './layout/chef-projet/chef-projet.component';


@NgModule({
  declarations: [
    ChefProjetComponent
  ],
  imports: [
    CommonModule,
    ChefProjetRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule
  ]
})
export class ChefProjetModule { }
