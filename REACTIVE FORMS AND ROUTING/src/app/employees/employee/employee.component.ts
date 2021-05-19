import { Component, OnInit } from '@angular/core';
import { EMPLOYEE } from 'src/app/employee-mock';
import { EmployeeService } from 'src/app/services/employee.service';

@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css']
})
export class EmployeeComponent {


  employee=EMPLOYEE;
constructor(private employeeService: EmployeeService){}
  ngOnInit(): void{
 this.employeeService.getAllEmployee().subscribe(data => {
this.employee = data;

 });

  }
};
