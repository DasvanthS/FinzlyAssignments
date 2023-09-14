import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-login-page',
  templateUrl: './login-page.component.html',
  styleUrls: ['./login-page.component.css']
})
export class LoginPageComponent implements OnInit {

  result:string = ''

  constructor() { }

  ngOnInit(): void {
  }

  onClick(email:any, password:any){
    if(email == "das@gmail.com" && password=="12345"){
      this.result = "Valid user"
    }
    else{
      this.result = "Not a valid user"
    }
  }

  onKeyDown(data:any){
    if(data.length > 20){
      alert("Value should be less than 10")
    }
  }

}
