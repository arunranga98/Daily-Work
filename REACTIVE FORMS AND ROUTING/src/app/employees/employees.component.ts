import { Component} from '@angular/core';

@Component({
    selector:'app-employees',
    templateUrl: './employees.component.html',
    styleUrls: ['./employees.component.css']
})

 export class EmployeesComponent {
     emp  =  [{name: 'Arun', salary: 25000, address:'Tiruppur'},
  {name: 'AJ', salary: 65000, address:'Chennai'},
    {name: 'DJ', salary: 85000, address:'Erode'} ]
 };
