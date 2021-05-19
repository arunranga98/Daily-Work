 import { Component } from '@angular/core';

 @Component({
   selector: 'app-root',
   templateUrl: './app.component.html',
   styleUrls: ['./app.component.css']
 })
 export class AppComponent {
   title = 'Employee Management';
   count=10;

  getCount(counter: number): void{
    this.count=counter;
  }

  getFromChild(event: number): void{
    this.count = event;
}

 }
​​​​​​​​

 


