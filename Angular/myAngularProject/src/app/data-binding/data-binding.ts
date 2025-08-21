import { Component } from '@angular/core';

@Component({
  selector: 'app-data-binding',
  imports: [],
  templateUrl: './data-binding.html',
  styleUrl: './data-binding.css'
})
export class DataBinding {
  name:string="Yash";
  age:number=20;
  city:string= "Palamaner"
  cname:string=""

  image:string="favicon.ico";
  isDisabled:boolean=false;

  display(){
    alert('This is a click event')
  }

  citySelected(event: Event) {
  const selectedCity = (event.target as HTMLSelectElement).value;
  this.cname = selectedCity;
  console.log('City selected:', selectedCity);
}
}
