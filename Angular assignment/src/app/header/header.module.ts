import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { HeadingComponent } from './heading/heading.component';
import { RouterModule } from '@angular/router';
import { ProductModule } from '../product/product.module';

@NgModule({
  declarations: [HeadingComponent],
  imports: [
    CommonModule,
    RouterModule,
    ProductModule
  ],
  exports:[
    HeadingComponent
  ]
})
export class HeaderModule { }
