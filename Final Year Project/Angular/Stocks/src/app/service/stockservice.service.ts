import { BehaviorSubject, Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';


@Injectable({
  providedIn: 'root'
})
export class StockserviceService {

  stockdetail$ = new BehaviorSubject<string>('');

  constructor(private httpClient: HttpClient) { }

  setStockdetail(s: string) {
    this.stockdetail$.next(s);
  }
  getStockdetail() {
    return this.stockdetail$;
  }

  getendstocks(): Observable<any> {
    return this.httpClient.get("http://localhost:8080/getendstocks");
  }

  getstockhist(stockdet: string): Observable<any> {
    return this.httpClient.post("http://localhost:8080/stockhist", stockdet);
  }

  getprestock(stockdet: string): Observable<any> {
    return this.httpClient.post("http://127.0.0.1:5000/index", stockdet, { responseType: 'json' });
  }

}
