import { Component, signal } from '@angular/core';
import { Admin } from '../../component/admin/admin'; // adjust if path differs
import { User } from '../../component/user/user';
import { Databinding } from '../../component/databinding/databinding';
import { SignalEx } from '../../component/signal-ex/signal-ex';
import { ControlFlow } from '../../component/control-flow/control-flow';
import { RouterLink, RouterOutlet } from '@angular/router';


@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterLink,RouterOutlet],        // can import other standalone components too
  templateUrl: './app.html',
  styleUrls: ['./app.css']
})
export class App {
  protected title = 'ProjectP';
}
