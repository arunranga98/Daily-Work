import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { EmployeeComponent } from './employee/employee.component';
import { Employee1Component } from './employee/employee1/employee1.component';

@NgModule({
  declarations: [
    AppComponent,
    EmployeeComponent,
    Employee1Component
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
