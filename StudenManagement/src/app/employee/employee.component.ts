import{ Component} from '@angular/core';

@Component({
    selector:'app-employee',
    templateUrl: './employee.component.html',
    styleUrls: ['./employee.component.css']
})

export class EmployeeComponent {
    emp  =  [{name: 'Arun', salary: 25000, address:'Tiruppur'},
   {name: 'AJ', salary: 65000, address:'Chennai'},
   {name: 'DJ', salary: 85000, address:'Erode'} ]
};