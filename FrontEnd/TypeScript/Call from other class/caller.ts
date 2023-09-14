//Task display class data using advanced features of Typescript

import { MyClass } from "./MyClass";
import { outerFun, outerStr } from "./MyClass";

console.log(outerStr);
outerFun();
let mc = new MyClass(2,"Das");
mc.display();
