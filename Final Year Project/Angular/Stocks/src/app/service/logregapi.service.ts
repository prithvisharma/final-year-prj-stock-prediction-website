import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { User } from '../classes/user';


@Injectable({
  providedIn: 'root'
})
export class LogregapiService {

  constructor(private httpClient: HttpClient) { }

  registerUser(user: User): Observable<any> {

    return this.httpClient.post("http://localhost:8080/save", user);
  }

  loginUser(idpass: string[]): Observable<any> {

    return this.httpClient.post("http://localhost:8080/auth", idpass);
  }

  extFname(email: string): Observable<any> {

    return this.httpClient.post("http://localhost:8080/getusername", email, { responseType: 'text' });
  }

  existEmail(email: string): Observable<any> {

    return this.httpClient.post("http://localhost:8080/checkemail", email);
  }

}
