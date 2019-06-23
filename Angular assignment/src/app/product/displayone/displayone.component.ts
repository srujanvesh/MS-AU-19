import { Component, OnInit } from '@angular/core';
import { ProductService } from 'src/app/productservice.service';
import {Router, ActivatedRoute, Params} from '@angular/router';

@Component({
  selector: 'app-displayone',
  templateUrl: './displayone.component.html',
  styleUrls: ['./displayone.component.css']
})
export class DisplayoneComponent implements OnInit {

 public products:any=[];
 details  :any=[]
 public key;


  constructor(private ProductService: ProductService,private activatedRoute: ActivatedRoute) {

    this.activatedRoute.paramMap.subscribe((params: Params) => {
      
      this.key=params.get('id');
      console.log(this.key);
      this.ProductService.getProducts()
      .subscribe(data => {
      this.products = data;
      const product1 :any = data[0];
      for (const detail in product1)
      {
        this.details.push(detail);
        console.log(detail)
      }
      });
     
    });

    
   }

  ngOnInit() {


  }

}
