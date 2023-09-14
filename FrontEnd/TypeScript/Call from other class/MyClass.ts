export class MyClass{
    
    id:number;
    str:string;

    constructor(id:number, str:string){
        this.id = id;
        this.str = str;
    }

    display(){
        console.log(`Id : ${this.id} str : ${this.str}`);
    }
}

export let outerFun = function(){
    console.log("This is a outer function");
}

export let outerStr:string = "This is a outer string"
