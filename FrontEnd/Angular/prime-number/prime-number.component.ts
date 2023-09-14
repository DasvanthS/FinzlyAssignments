import { INFERRED_TYPE } from '@angular/compiler/src/output/output_ast';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-prime-number',
  templateUrl: './prime-number.component.html',
  styleUrls: ['./prime-number.component.css']
})
export class PrimeNumberComponent implements OnInit {

  result:boolean | null  = null

  ngOnInit(): void {
  }

  checkPrime(str:string){
    const num:number = parseInt(str)
    if(num <=1 ){
      this.result = false
    }
    else{
      for(let i:number = 2; i <= num/2; i++){
        if(num % i == 0){
          this.result = false
          return;
        }
      }
      this.result = true
    }
  }

}
