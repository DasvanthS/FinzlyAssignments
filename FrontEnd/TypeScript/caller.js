"use strict";
//Task display class data using advanced features of Typescript
Object.defineProperty(exports, "__esModule", { value: true });
var MyClass_1 = require("./MyClass");
var MyClass_2 = require("./MyClass");
console.log(MyClass_2.outerStr);
(0, MyClass_2.outerFun)();
var mc = new MyClass_1.MyClass(2, "Das");
mc.display();
