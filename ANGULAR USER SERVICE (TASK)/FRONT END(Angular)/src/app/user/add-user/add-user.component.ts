// import { Component, OnInit } from '@angular/core';

// @Component({
//   selector: 'app-add-user',
//   templateUrl: './add-user.component.html',
//   styleUrls: ['./add-user.component.css']
// })
// export class AddUserComponent implements OnInit {

//   constructor() { }

//   ngOnInit(): void {
//   }

// }
import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { UserService } from 'src/app/services/user.service';

@Component({
  selector: 'app-add-user',
  templateUrl: './add-user.component.html',
  styleUrls: ['./add-user.component.css']
})
export class AddUserComponent implements OnInit {
  signupForm: any;

  constructor(private router: Router, private userService: UserService) { }


  ngOnInit(): void {
    this.signupForm=new FormGroup({
      id: new FormControl(null, Validators.required), 
      username: new FormControl(null, Validators.required), //Note we can add more than one validator, if we have email we can add validator for the email.
      password: new FormControl(null, Validators.required), 
      address: new FormControl(null, Validators.required),
      phone: new FormControl(null, Validators.required)
      // company: new FormControl(null, Validators.required)
    });
  }

  onSubmit(): void {
 
    this.userService.createUser(this.signupForm.value).subscribe(data =>{
      console.log("Data added Successfully");      
      this.router.navigate(['']);  
    });
    console.log(this.signupForm);
  }

}

