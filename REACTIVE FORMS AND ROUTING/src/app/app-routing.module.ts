import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule, Routes } from '@angular/router';
import { EmployeesComponent } from './employees/employees.component';
import { AddEmployeeComponent } from './employees/add-employee/add-employee.component';
import { EmployeeComponent } from './employees/employee/employee.component';


const routes: Routes = [
  {path: '',component: EmployeesComponent},
  {path: 'add-employee',component:AddEmployeeComponent},
  {path: 'employee/:id',component:EmployeeComponent},
];

@NgModule({
  declarations: [],
  imports: [
    CommonModule,
    RouterModule.forRoot(routes)
  ],
  exports: [RouterModule]
})
export class AppRoutingModule { }
