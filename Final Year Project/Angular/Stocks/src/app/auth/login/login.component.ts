import { LogregapiService } from './../../service/logregapi.service';
import { CustomvalService } from './../../service/customval.service';

import { Router } from '@angular/router';
import { Component, OnInit } from '@angular/core';
import { FormControl, FormBuilder, FormGroup, Validators } from '@angular/forms';
import { MatSnackBar, MatSnackBarHorizontalPosition, MatSnackBarVerticalPosition } from '@angular/material/snack-bar';
import { AuthService } from 'src/app/service/auth.service';
import { User } from 'src/app/classes/user';




@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  constructor(private route: Router, private auth: AuthService, private _snackBar: MatSnackBar,
    private customvalService: CustomvalService, private logregapiService: LogregapiService,
    private fb: FormBuilder) { }

  ngOnInit(): void {
  }

  login = {
    logEmail: '',
    logPassword: ''
  }

  register = {
    rFName: '',
    rLName: '',
    rEmail: '',
    rPass: '',
    rCPass: ''
  }
  idpass: string[];

  //user = new User();

  hide = true;

  horizontalPosition: MatSnackBarHorizontalPosition = 'center';
  verticalPosition: MatSnackBarVerticalPosition = 'top';

  loginForm = new FormGroup({
    logEmail: new FormControl('', [Validators.email, Validators.required]),
    logPassword: new FormControl('', [Validators.required])
  });

  regForm = this.fb.group({
    rFName: new FormControl('', [Validators.minLength(3), Validators.maxLength(15), Validators.required]),
    rLName: new FormControl('', [Validators.minLength(3), Validators.maxLength(15), Validators.required]),
    rEmail: new FormControl('', [Validators.email, Validators.required]),
    rPass: new FormControl('', [Validators.required, Validators.minLength(6), Validators.maxLength(15)]),
    rCPass: new FormControl('', [Validators.required])
  },
    {
      validator: this.customvalService.passwordMatchValidator("rPass", "rCPass")
    },
  );


  onRegSubmit() {
    var user = new User();
    this.register = this.regForm.value;
    user.fname = this.register.rFName;
    user.lname = this.register.rLName;
    user.email = this.register.rEmail;
    user.pass = this.register.rCPass;

    this.logregapiService.existEmail(user.email).subscribe(
      data => {
        if (data) {
          this._snackBar.open('Email exists already !', 'Close', {
            duration: 5000,
            horizontalPosition: this.horizontalPosition,
            verticalPosition: this.verticalPosition,
          });
        }
        else {
          this.logregapiService.registerUser(user).subscribe();

          this._snackBar.open('Registered !', 'Close', {
            duration: 5000,
            horizontalPosition: this.horizontalPosition,
            verticalPosition: this.verticalPosition,
          });
          this.route.navigate(['login']);
          if (this.regForm.valid) {
            this.regForm.reset();//check this later
          }
        }
      }
    );
    /*     this.logregapiService.registerUser(user).subscribe();
    
        this._snackBar.open('Registered !', 'Close', {
          duration: 5000,
          horizontalPosition: this.horizontalPosition,
          verticalPosition: this.verticalPosition,
        });
        this.route.navigate(['login']);
        if(this.regForm.valid){
          this.regForm.reset();//check this later
        } */
    //console.log(user);
  }
  onLoginSubmit() {
    this.login = this.loginForm.value;
    this.idpass = [this.login.logEmail, this.login.logPassword];
    this.logregapiService.loginUser(this.idpass).subscribe(
      data => {
        //console.log(this.idpass);
        //console.log(data);
        if (data) {
          this.auth.loginStatus.next(true);
          this.logregapiService.extFname(this.login.logEmail).subscribe(
            data => {
              //console.log(data);
              this.auth.username$.next(data);
            }
          )
          this.route.navigate(['home']);
          this._snackBar.open('Logged in !', 'Close', {
            duration: 5000,
            horizontalPosition: this.horizontalPosition,
            verticalPosition: this.verticalPosition,
          });
        }
        else {
          this._snackBar.open('Invalid Credentials !', 'Close', {
            duration: 5000,
            horizontalPosition: this.horizontalPosition,
            verticalPosition: this.verticalPosition,
          });
        }
      }
    );
  }
}