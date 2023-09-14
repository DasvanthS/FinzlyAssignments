import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-class-binding',
  templateUrl: './class-binding.component.html',
  styleUrls: ['./class-binding.component.css']
})
export class ClassBindingComponent implements OnInit {

  isItalic:boolean = false
  isRed:boolean = false

  constructor() { }

  ngOnInit(): void {

  }

  applyChange(){
    this.isItalic = !this.isItalic;
    this.isRed = !this.isRed
  }

}
