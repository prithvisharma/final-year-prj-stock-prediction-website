import { Component } from '@angular/core';
import { AuthService } from './service/auth.service';
import { Router } from '@angular/router';
import { MatSnackBar, MatSnackBarHorizontalPosition, MatSnackBarVerticalPosition } from '@angular/material/snack-bar';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Ez Stonks';
  username: string;
  userStatus: boolean;
  horizontalPosition: MatSnackBarHorizontalPosition = 'center';
  verticalPosition: MatSnackBarVerticalPosition = 'top';

  constructor(private auth: AuthService, private route: Router, private _snackBar: MatSnackBar) {

  }
  ngOnInit(): void {
    this.auth.loginStatus.subscribe(
      data => {
        this.userStatus = data;
      }
    );
    this.auth.getUsername().subscribe(
      data => {
        this.username = data;
      }
    );
  }
  onLogout() {
    this.auth.loginStatus.next(false);
    this.route.navigate(['login']);
    this._snackBar.open('Logged Out !', 'Close', {
      duration: 5000,
      horizontalPosition: this.horizontalPosition,
      verticalPosition: this.verticalPosition,
    });
  }

  toHome() {
    this.route.navigate(['home']);
  }
}
