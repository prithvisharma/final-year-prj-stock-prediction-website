import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { StockhistRoutingModule } from './stockhist-routing.module';
import { StockhistComponent } from './stockhist.component';
import { MaterialModule } from 'src/app/material/material/material.module';
import {
  CandleSeriesService,
  ChartAllModule, ChartModule, CrosshairService, DataLabelService, DateTimeService, HiloOpenCloseSeriesService,
  LegendService,
  RangeNavigatorAllModule,
  RangeNavigatorModule, RangeTooltipService, StockChartAllModule, StockChartModule, TooltipService, TrendlinesService
}
  from '@syncfusion/ej2-angular-charts';
import { ButtonAllModule, ButtonModule } from '@syncfusion/ej2-angular-buttons';
import { DropDownButtonModule } from '@syncfusion/ej2-angular-splitbuttons';
import { ToolbarModule } from '@syncfusion/ej2-angular-navigations';
import { CalendarModule } from '@syncfusion/ej2-angular-calendars';
import { FlexLayoutModule } from '@angular/flex-layout';


@NgModule({
  declarations: [StockhistComponent],
  imports: [
    CommonModule,
    StockhistRoutingModule,
    MaterialModule,
    StockChartModule,
    ChartModule,
    StockChartAllModule,
    ChartAllModule,
    RangeNavigatorModule,
    RangeNavigatorAllModule,
    ButtonModule,
    ButtonAllModule,
    DropDownButtonModule,
    ToolbarModule,
    CalendarModule,
    FlexLayoutModule
  ],
  providers: [HiloOpenCloseSeriesService, DateTimeService,
    TooltipService, CrosshairService, RangeTooltipService,
    LegendService, DataLabelService, CandleSeriesService, TrendlinesService]
})
export class StockhistModule { }
