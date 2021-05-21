import { AuthService } from './auth.service';
import { Injectable } from '@angular/core';
import { CanActivate, Router } from '@angular/router';


@Injectable({
  providedIn: 'root'
})
export class AuthGuardService implements CanActivate {

  status: boolean | undefined;

  constructor(private auth: AuthService, private route: Router) { }

  canActivate(): boolean {
    this.status = this.auth.isAuthenticated();
    if (this.status === false) {
      this.route.navigate(['login']);
      return true;
    }
    else
      return this.status;
  }

}
// communicate to angular framework from here...