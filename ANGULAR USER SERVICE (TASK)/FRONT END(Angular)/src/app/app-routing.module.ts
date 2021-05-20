import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule, Routes } from '@angular/router';
// import { EmployeesComponent } from './employees/employees.component';
// import { AddEmployeeComponent } from './employees/add-employee/add-employee.component';
// import { EmployeeComponent } from './employees/employee/employee.component';
// import { UpdateEmployeeComponent } from './employees/update-employee/update-employee.component';
import { AddUserComponent } from './user/add-user/add-user.component';
import { UserComponent } from './user/user.component';
import { UserUpdateComponent } from './user/update-user/update-user.component';



const routes: Routes = [
  // {path: '',component: EmployeesComponent},
  //  {path: 'add-employee',component:AddEmployeeComponent},
  //  {path: 'employee/:id',component:EmployeeComponent},
  // {path:'update-employee',component:UpdateEmployeeComponent}
  {path: '', component: UserComponent}, 
  {path:'add-user', component: AddUserComponent}, 
  // {path:'employee/:id', component:  SingleemployeeComponent},
  {path:'update-user', component: UserUpdateComponent}
  
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
