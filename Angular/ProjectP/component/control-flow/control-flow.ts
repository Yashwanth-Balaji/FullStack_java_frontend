import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-control-flow',
  imports: [FormsModule],
  templateUrl: './control-flow.html',
  styleUrl: './control-flow.css'
})
export class ControlFlow {
  isParaVisible : boolean = true;

  city:string[] = ["Tirupati","Amaravathi","Vijayawada","Rajamahendravaram","Chittoor","Madanapalli"];

  showP(){
    this.isParaVisible = true;
  }
  hideP(){
    this.isParaVisible = false;
  }

  month:string = "jan";

  studentDetails : any[] = [
    {name: 'Yash', city:"Amaravathi",isStatus:true},
    {name:"Balaji",city:"Tirupathi",isStatus:false},
    {name:"Ganesh",city:"Rajamahendravaram",isStatus:true},
    {name:"Aravind",city:"Chittoor",isStatus:false}
  ]
}
