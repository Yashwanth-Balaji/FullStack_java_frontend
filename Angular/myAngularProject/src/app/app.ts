import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { AdminComponent } from './admin-component/admin-component';
import { DataBinding } from './data-binding/data-binding';

@Component({
  selector: 'app-root',
  imports: [DataBinding],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  protected title = 'myAngularProject';
}
