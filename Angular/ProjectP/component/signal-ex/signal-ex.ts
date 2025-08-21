import { Component, computed, signal } from '@angular/core';

@Component({
  selector: 'app-signal-ex',
  imports: [],
  templateUrl: './signal-ex.html',
  styleUrl: './signal-ex.css'
})
export class SignalEx {
  

  name = "Yash";

  courseName = signal<string>("Full Stack");

  courseDuration = signal("6 Months");

  computedValue = computed(() => this.courseName() + " - " + this.courseDuration() + " done by " + this.name);

  //to change the value we use the constructor to make it possible using the set

  constructor(){
    
    setTimeout(()=>{
    this.courseName.set("Java Full Stack");
    this.name = "Yashwanth";
    },5000);
  }
}
