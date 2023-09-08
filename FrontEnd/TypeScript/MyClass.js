"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.outerStr = exports.outerFun = exports.MyClass = void 0;
var MyClass = /** @class */ (function () {
    function MyClass(id, str) {
        this.id = id;
        this.str = str;
    }
    MyClass.prototype.display = function () {
        console.log("Id : ".concat(this.id, " str : ").concat(this.str));
    };
    return MyClass;
}());
exports.MyClass = MyClass;
var outerFun = function () {
    console.log("This is a outer function");
};
exports.outerFun = outerFun;
exports.outerStr = "This is a outer string";
