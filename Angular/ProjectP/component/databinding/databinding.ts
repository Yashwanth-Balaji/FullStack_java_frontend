import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-databinding',
  imports: [FormsModule],
  templateUrl: './databinding.html',
  styleUrl: './databinding.css'
})
export class Databinding {
  instituteName : string = "GTec-Jainx";
  location = "Yelahanka";
  minChar = 3;
  maxlength = 7;
  inputType: string = "checkbox";
  styledClass : string = "colorandfont";
  textColor : string = "yellow";
  modelName : string = "Ganesh";

 message(){
  alert("Jai Shree Ram")
 } 

 option(){
  alert("Value is changed ......!")
 }

 hovered(color: string) {
    this.textColor = color; // dynamically update
 }
}
