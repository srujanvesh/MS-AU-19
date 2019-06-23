import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { DisplayallComponent } from './displayall/displayall.component';
import { DisplayoneComponent } from './displayone/displayone.component';
import { RouterModule } from '@angular/router';

// RouterModule.forChild([
    //   {path: 'displayone', component:DisplayoneComponent}
    // ])

@NgModule({
  declarations: [DisplayallComponent, DisplayoneComponent],
  imports: [
    CommonModule,
    RouterModule.forChild([
            {
              path: 'displayone/:id',component:DisplayoneComponent},
              { path: 'displayall',component:DisplayallComponent},
              {path: '',redirectTo:'displayall',pathMatch:'full'}
    ])

  ],
  exports:[
    // DisplayallComponent,DisplayoneComponent
  ]
})
export class ProductModule { }
