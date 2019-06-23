import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { DisplayallComponent } from './product/displayall/displayall.component';
// import {ProductModule} from './product/product.module';


const routes: Routes = [

    {path: 'home', component:HomeComponent},
    {path: 'product', loadChildren:'./product/product.module#ProductModule' },
    {path:'', redirectTo:'home',pathMatch:'full'}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
