import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

/* Component */
import { HeaderComponent } from './header/header.component';
import { MenuComponent } from './menu/menu.component';

@NgModule({
  declarations: [HeaderComponent, MenuComponent],
  imports: [
    CommonModule
  ],
  exports: [
    HeaderComponent,
    MenuComponent
  ]
})
export class SharedModule { }
