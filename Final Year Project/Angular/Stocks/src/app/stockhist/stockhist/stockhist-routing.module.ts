import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { StockhistComponent } from './stockhist.component';

const routes: Routes = [{ path: '', component: StockhistComponent }];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class StockhistRoutingModule { }
