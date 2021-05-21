import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AuthGuardService } from './service/auth-guard.service';

const routes: Routes = [
  { path: '', redirectTo: '/login', pathMatch: 'full' },
  { path: 'login', loadChildren: () => import('./auth/login/login.module').then(m => m.LoginModule) },
  { path: 'home', loadChildren: () => import('./home/home/home.module').then(m => m.HomeModule), canActivate: [AuthGuardService] },
  {
    path: 'home/:stockdetail',
    loadChildren: () => import('./stockhist/stockhist/stockhist.module').then(m => m.StockhistModule),
    canActivate: [AuthGuardService]
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
