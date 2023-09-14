import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-click-event',
  templateUrl: './click-event.component.html',
  styleUrls: ['./click-event.component.css']
})
export class ClickEventComponent implements OnInit {

  str:string = "";

  ngOnInit(): void {

  }

  componentFile(input:string){
    this.str = input;
  }



}
