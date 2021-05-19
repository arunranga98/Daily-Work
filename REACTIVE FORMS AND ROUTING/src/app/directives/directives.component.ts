import { Component } from '@angular/core';

@Component({
  selector: 'app-directives',
  //templateUrl: './directives.component.html',
  template: `      
	<div [ngSwitch]="inpvalue">      
	<p style='color:blue'  *ngSwitchCase="1">You have selected M S Dhoni</p>      
	<p style='color:blue'  *ngSwitchCase="2">You have selected Sachin Tendulkar</p>      
	<p style='color:blue'  *ngSwitchCase="3">You have selected ARUN JAMES</p>     
	<p style='color:red'  *ngSwitchDefault>Sorry! Invalid selection....</p>      
	</div>`      
	}) 
    
// <h2>{{title}}</h2>      
//	 <p *ngIf="showElement">Show Element</p>
   
	export class DirectivesComponent{    
    
		inpvalue: number = 3;    
	}


// **** DEFAULT **** //
// export class DirectivesComponent implements OnInit {

//   constructor() { }

//   ngOnInit(): void {
//   }

// }

// mystyle 

// template:`<button style='color:green' [ngStyle]="MyStyle()">ARUN JAMES</button>`, 
// styleUrls: ['./directives.component.css']
// export class DirectivesComponent{    
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

// *** MYCLASS **** //
// template: `<button class='colorClass' [ngClass]='applyClasses()'>Bharath</button>`,    
// styles: [`.boldClass{    
//             font-weight:bold;    
//               font-size : 30px;    
//         }    

//         .italicsClass{    
//             font-style:italic;    
//         }    

//         .colorClass{    
//             color:Red;               
// }`]    
// 

// export class DirectivesComponent {    
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