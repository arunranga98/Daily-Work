import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { EmployeesComponent } from './employees/employees.component';
import { EmployeeComponent } from './employees/employee/employee.component';
import { DataBindingComponent } from './data-binding/data-binding.component';
import { DirectivesComponent } from './directives/directives.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { UserFormComponent } from './user-form/user-form.component';
import { AddEmployeeComponent } from './employees/add-employee/add-employee.component';
//import { EmployeeService } from './services/employee.service';
import { HttpClientModule } from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { UpdateEmployeeComponent } from './employees/update-employee/update-employee.component';
import { SkillsComponent } from './skills/skills.component';
import { UserComponent } from './user/user.component';
import { AddUserComponent } from './user/add-user/add-user.component';
import { UserUpdateComponent } from './user/update-user/update-user.component';


@NgModule({
  declarations: [
    AppComponent,
    EmployeesComponent,
    EmployeeComponent,
    DataBindingComponent,
    DirectivesComponent,
    UserFormComponent,
    AddEmployeeComponent,
    UpdateEmployeeComponent,
    SkillsComponent,
    UserComponent,
    AddUserComponent,
    UserUpdateComponent,
    
  ],
  imports: [
    BrowserModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
