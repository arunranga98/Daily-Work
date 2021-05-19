import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-data-binding',
  templateUrl: './data-binding.component.html',   
  styleUrls: ['./data-binding.component.css']
})
export class DataBindingComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

}


//at template first line <h2>{{title}}</h2> 
//at p tag ngif is *ngIf="showElement"
  
// export class DataBindingComponent {    
    
//   inpvalue: number = 10;    
// }

  
  
  
  
  // (comment for class)` <button class='colorClass' [ngClass]='applyClasses()'>Arun James1</button>`,      (comment for mystyle) ./data-binding.component.html fot that mystyle <button style='color:green' [ngStyle]="MyStyle()">Arun James</button>
 // styleUrls: ['./data-binding.component.css']

//  styles: [`.boldClass{    
//   font-weight:bold;    
//     font-size : 30px;    
// }    

// .italicsClass{    
//   font-style:italic;    
// }    

// .colorClass{    
//   color:Red;               
// }`] 



//***** default ******//



// **** ATTRIBUTE DIRECTIVES 1 **** //


// export class DataBindingComponent {    
//   isBold: boolean = true;    
//   fontSize: number = 30;    
//   isItalic: boolean = true;    
  
//   MyStyle() {    
//       let mystyles = {    
//           'font-weight': this.isBold ? 'bold' : 'normal',    
//           'font-style': this.isItalic ? 'italic' : 'normal',    
//           'font-size.px': this.fontSize    
//       };    
  
//       return mystyles;    
//   }    
// }  




// **** ATTRIBUTE DIRECTIVES 2 **** //


// export class DataBindingComponent  {    
//   applyBoldClass: boolean = true;    
//   applyItalicsClass: boolean = true;    
  
//   applyClasses() {    
//       let classes = {    
//           boldClass: this.applyBoldClass,    
//           italicsClass: this.applyItalicsClass    
//       };    
  
//       return classes;    
//   }    
// }  







