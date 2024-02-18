import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ChefProjetComponent } from './layout/chef-projet/chef-projet.component';

const routes: Routes = [
  { path: '', component: ChefProjetComponent, children:[
    

    
  ] }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class ChefProjetRoutingModule { }
