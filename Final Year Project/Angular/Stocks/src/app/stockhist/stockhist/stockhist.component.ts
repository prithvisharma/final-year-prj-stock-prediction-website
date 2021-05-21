import { StockserviceService } from './../../service/stockservice.service';
import { Component, OnInit, ViewChild, ViewEncapsulation } from '@angular/core';
import { MatTableDataSource } from '@angular/material/table';
import { Stock } from 'src/app/classes/stock';
import { MatPaginator } from '@angular/material/paginator';
import { MatSort } from '@angular/material/sort';
import {
  AnimationModel, ITooltipRenderEventArgs, IStockChartEventArgs, ChartTheme, LegendSettingsModel, ChartComponent, ILoadedEventArgs
} from '@syncfusion/ej2-angular-charts';


@Component({
  selector: 'app-stockhist',
  templateUrl: './stockhist.component.html',
  styleUrls: ['./stockhist.component.css'],
  encapsulation: ViewEncapsulation.None
})
export class StockhistComponent implements OnInit {

  stockdetail: string;
  stockhist: Stock[];
  predata: number[] = [];

  displayedColumns: string[] = ['date', 'open', 'high', 'low', 'close', 'adjClose', 'volume'];
  dataSource: MatTableDataSource<Stock>;

  @ViewChild(MatPaginator) paginator: MatPaginator;
  @ViewChild(MatSort) sort: MatSort;

  //chartvars
  public enable: boolean = true;
  public stockdetailstyle: object;

  constructor(private stockserviceService: StockserviceService) {
    this.stockserviceService.getStockdetail().subscribe(
      s => {
        this.stockdetail = s
        console.log(this.stockdetail);
      }
    );
    this.stockserviceService.getstockhist(this.stockdetail).subscribe(
      data => {
        this.dataSource = new MatTableDataSource(data);
        //console.log(this.dataSource)
        this.stockhist = data;
        /* console.log("stockhist")
        console.log(this.stockhist); */
        this.dataSource.paginator = this.paginator;
        this.dataSource.sort = this.sort
        this.stockdetailstyle = {
          fontStyle: 'bold',
          size: '15px'
        }
      }
    );

    this.stockserviceService.getprestock(this.stockdetail).subscribe(
      data => {
        this.predata = data;
        console.log(this.predata);
      }
    );
    this.series1 = this.getData();
  }

  ngOnInit(): void {


  }

  //chart


  public primaryXAxis: Object = {
    valueType: 'DateTime',
    majorGridLines: { width: 0 },
    crosshairTooltip: { enable: true },
  };

  public primaryYAxis: Object = {
    labelFormat: 'n0',
    rangePadding: 'None',
    lineStyle: { color: 'transparent' },
    majorTickLines: { color: 'transparent' },
  };
  public chartArea: Object = {
    border: {
      width: 0
    }
  };
  public animation: AnimationModel = { enable: true };
  public crosshair: Object = {
    enable: true,
  };
  public tooltip: object = { enable: true, shared: true }
  public tooltipRender(args: ITooltipRenderEventArgs): void {
    if (args.text.split('<br/>')[4]) {
      let target: number = parseInt(args.text.split('<br/>')[4].split('<b>')[1].split('</b>')[0], 10);
      let value: string = (target / 100000000).toFixed(1) + 'B';
      args.text = args.text.replace(args.text.split('<br/>')[4].split('<b>')[1].split('</b>')[0], value);
    }
  };
  // custom code start
  public load(args: IStockChartEventArgs): void {
    let selectedTheme: string = location.hash.split('/')[1];
    selectedTheme = selectedTheme ? selectedTheme : 'Material';
    args.stockChart.theme = <ChartTheme>(selectedTheme.charAt(0).toUpperCase() + selectedTheme.slice(1)).replace(/-dark/i, "Dark");
  };
  // custom code end



  //public series1: Object[] = this.getData();
  public series1: Object[];
  public point1: Object;

  public getData(): Object[] {
    let pointCollection: Object[] = [];
    let point1: Object;

    /*     let yValue: number[] = [];
        yValue = this.predata;
        console.log(yValue) */

    let yValue: number[] = [0.7833150029182434, 0.7469280362129211, 0.7148612141609192, 0.6864256858825684,
      0.6614329814910889, 0.639212429523468, 0.6192484498023987, 0.6011436581611633, 0.5845927000045776,
      0.5693570971488953, 0.5552483201026917, 0.5421149134635925, 0.5298333764076233, 0.5183025002479553,
      0.5074380040168762, 0.4971691071987152, 0.48743653297424316, 0.47818928956985474, 0.46938425302505493,
      0.4609842598438263, 0.4529569447040558, 0.44527438282966614, 0.43791189789772034, 0.4308474659919739,
      0.4240618646144867, 0.41753721237182617, 0.41125786304473877, 0.4052092730998993, 0.3993781805038452,
      0.3937523365020752
    ]

    let i: number; let j: number = 0;
    for (i = 0; i < yValue.length; i++) {
      point1 = { x: i, y: yValue[j] };
      pointCollection.push(point1);
      j++;
    }
    console.log(pointCollection);
    return pointCollection;
  }


  @ViewChild('chart')
  public chart: ChartComponent;

  //Initializing Primary X Axis
  public primaryXAxisp: Object = {
    title: 'After following Days',
    majorGridLines: { width: 0 }, edgeLabelPlacement: 'Shift'
  };
  //Initializing Primary Y Axis
  public primaryYAxisp: Object = {

    interval: 0.25, lineStyle: { width: 0 }, majorTickLines: { width: 0 }
  };
  public chartAreap: Object = {
    border: { width: 0 }
  };
  public tooltipp: Object = {
    enable: true
  };
  public markerp: object = {
    visible: false
  };
  public marker1p: Object = {
    visible: true
  }
  public legendSettingsp: LegendSettingsModel = { visible: true };
  public min: number = 1;
  public max: number = 20;
  public value: number = 0;
  public step: number = 1;
  // custom code start
  public loadp(args: ILoadedEventArgs): void {
    let selectedTheme: string = location.hash.split('/')[1];
    selectedTheme = selectedTheme ? selectedTheme : 'Material';
    args.chart.theme = <ChartTheme>(selectedTheme.charAt(0).toUpperCase() + selectedTheme.slice(1)).replace(/-dark/i, "Dark");
  };
  // custom code end
  public title: string = 'Expected Trendline';


}
