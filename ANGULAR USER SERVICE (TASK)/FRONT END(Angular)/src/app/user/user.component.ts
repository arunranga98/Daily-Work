// import { Component, OnInit } from '@angular/core';

// @Component({
//   selector: 'app-user',
//   templateUrl: './user.component.html',
//   styleUrls: ['./user.component.css']
// })
// export class UserComponent implements OnInit {

//   constructor() { }

//   ngOnInit(): void {
//   }

// }
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
// import { log } from 'console';
import { User } from '../model/user';
import { UserService } from '../services/user.service';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent implements OnInit {

  user!: User[];
  constructor(private userService: UserService, private router: Router) { }

  ngOnInit(): void {
    this.userService.getAllUsers().subscribe(data=> {
      this.user=data;
      console.log(this.user.forEach(e=>e));
    });
  }

  deleteUser(user: User): void {
    console.log(user);
    this.userService.deleteUserById(user["id"]).subscribe();
    this.user=this.user.filter(e=>e !==user);
  }
  updateUser(user: User): void {
    localStorage.removeItem('id');
    localStorage.setItem('id', user.id.toString());
    this.router.navigate(['update-user']);
  }

}
