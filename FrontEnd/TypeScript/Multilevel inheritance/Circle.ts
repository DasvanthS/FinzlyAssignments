import { Shape } from "./Shape";

export class Circle extends Shape{

    override area(){
        console.log("In circle class");
        super.area();
        
    }
}

let obj = new Circle();
obj.area();

