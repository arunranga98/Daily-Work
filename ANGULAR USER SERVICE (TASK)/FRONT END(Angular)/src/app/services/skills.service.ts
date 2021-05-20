import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Skills } from '../model/skills';
import { Observable } from 'rxjs';


@Injectable({
  providedIn: 'root'
})
export class SkillsService {

  baseUrl = "http://localhost:7000/skills";
  constructor(private httpClient: HttpClient) { }
  
  getAllSkills(): Observable<Skills[]>{

    return this.httpClient.get<Skills[]>(this.baseUrl);

  }
}
