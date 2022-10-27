import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { HomeRoutingModule } from './home-routing.module';
import { HomeComponent } from './home.component';
import { ModulesModule } from 'src/app/modules/modules/modules.module';


@NgModule({
  declarations: [
    HomeComponent
  ],
  imports: [
    CommonModule,
    HomeRoutingModule,
    ModulesModule
  ],
  exports: [
    HomeComponent
  ]
})
export class HomeModule { }
