import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { EmployeeComponent } from './employee/employee.component';
import { StudentComponent } from './student/student.component';
import { PropertyBindingComponent } from './property-binding/property-binding.component';
import { SlassBindingComponent } from './slass-binding/slass-binding.component';
import { ClickEventComponent } from './click-event/click-event.component';
import { ClassBindingComponent } from './class-binding/class-binding.component';
import { PrimeNumberComponent } from './prime-number/prime-number.component';

@NgModule({
  declarations: [
    AppComponent,
    EmployeeComponent,
    StudentComponent,
    PropertyBindingComponent,
    SlassBindingComponent,
    ClickEventComponent,
    ClassBindingComponent,
    PrimeNumberComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
