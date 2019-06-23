import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import {IProducts} from './Productslist'
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  private url:string ="http://localhost:8080/AccoliteCRUDRestService/student";
  constructor(private http: HttpClient) { }

  getProducts() {
    return this.http.get(this.url);
  }
  
}
