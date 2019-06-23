import { Component, OnInit } from '@angular/core';
import { ProductService } from 'src/app/productservice.service';
@Component({
  selector: 'app-displayall',
  templateUrl: './displayall.component.html',
  styleUrls: ['./displayall.component.css']
})
export class DisplayallComponent implements OnInit {

  products : any=[];
  details  :any=[]

  constructor(private ProductService: ProductService) {

  }

  ngOnInit() {
    this.ProductService.getProducts()
      .subscribe(data => {
      this.products = data;
      const product1 :any = data[0];
      for (const detail in product1)
      {
        this.details.push(detail);
      }
      console.log(this.details)
      });
  }  


}
