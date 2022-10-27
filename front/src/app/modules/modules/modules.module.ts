import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

//forms
import {  ReactiveFormsModule,FormsModule } from '@angular/forms';
//client module
import { HttpClientModule } from '@angular/common/http';
const MODULES = [
  ReactiveFormsModule,
  FormsModule,
  HttpClientModule
]

@NgModule({
  declarations: [],
  imports: [
    CommonModule,
    MODULES
  ],
  exports: [
    MODULES
  ]
})
export class ModulesModule { }
