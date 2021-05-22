import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
oddNums: number[]=[];
evenNums: number[]=[];

OnincreamentOnEachInterval(increamentedNum:number){
//console.log(increamentedNum);

if(increamentedNum%2==0){
  this.evenNums.push(increamentedNum);
}
else{
this.oddNums.push(increamentedNum);
}
  }

}
