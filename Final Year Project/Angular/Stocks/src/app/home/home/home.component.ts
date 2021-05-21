import { StockserviceService } from './../../service/stockservice.service';
import { Stock } from './../../classes/stock';
import { Component, ViewChild } from '@angular/core';
import { MatPaginator } from '@angular/material/paginator';
import { MatSort } from '@angular/material/sort';
import { MatTableDataSource } from '@angular/material/table';


@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent {

  displayedColumns: string[] = ['date', 'sname', 'open', 'high', 'low', 'close', 'adjClose', 'volume'];
  dataSource: MatTableDataSource<Stock>;

  @ViewChild(MatPaginator) paginator: MatPaginator;
  @ViewChild(MatSort) sort: MatSort;

  constructor(private stockserviceService: StockserviceService) {

    this.stockserviceService.getendstocks().subscribe(
      data => {
        this.dataSource = new MatTableDataSource(data);
        console.log(this.dataSource)
        this.dataSource.paginator = this.paginator;
        this.dataSource.sort = this.sort
      }
    );

  }

  applyFilter(event: Event) {
    const filterValue = (event.target as HTMLInputElement).value;
    this.dataSource.filter = filterValue.trim().toLowerCase();

    if (this.dataSource.paginator) {
      this.dataSource.paginator.firstPage();
    }
  }

  onStockClick(s: string) {
    console.log(s)
    this.stockserviceService.setStockdetail(s);
  }
}

