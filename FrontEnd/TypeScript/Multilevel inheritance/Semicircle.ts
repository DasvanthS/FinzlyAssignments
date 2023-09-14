import { Circle } from "./Circle";
import {fun} from "../otherPackage/fun";

export class Semicircle extends Circle{
    override area(): void {
        console.log("In semicircle class");
        super.area();
        
    }
}

let sc = new Semicircle();
sc.area();

fun();


