// import { Injectable } from '@angular/core';

// @Injectable({
//   providedIn: 'root'
// })
// export class UserService {

//   constructor() { }
// }
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { User } from '../model/user';
import { Observable } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class UserService {
  baseUrl='http://localhost:8000/api/users';
  constructor(private httpClient: HttpClient) { }
  getAllUsers(): Observable<User[]>  {
    return this.httpClient.get<User[]>(this.baseUrl);
  }
  createUser(user: User): Observable<User> {
    return this.httpClient.post<User>(this.baseUrl, user);    
  }
  getUserById(id: number) : Observable<User> {
    return this.httpClient.get<User>(this.baseUrl+ '/' +id);

  }
  deleteUserById(id: number): Observable<User> {
    return this.httpClient.delete<User>(this.baseUrl + '/' + id);
  }
  updateUser(user: User): Observable<User> {
    return this.httpClient.put<User>(this.baseUrl+ '/'+ user.id, user);
  }

}
