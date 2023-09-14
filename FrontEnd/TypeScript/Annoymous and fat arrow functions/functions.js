"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var fun1 = function () {
    console.log("fun1");
};
var fun2 = function (a) {
    console.log("fun2 ".concat(a));
};
var fun3 = function () {
    return "fun3";
};
var fun4 = function (b) {
    return "fun4 " + b;
};
fun1();
fun2(2);
console.log(fun3());
console.log(fun4("das"));
var fun5 = function () {
    console.log("fun5");
};
var fun6 = function (c) {
    console.log("fun6 ".concat(c));
};
var fun7 = function () {
    return "fun7";
};
var fun8 = function (d) {
    return "fun8 ".concat(d);
};
fun5();
fun6(2);
console.log(fun7());
console.log(fun8("das"));
var arr = [1, 2, 3, 45, 3, 3, 342, 5, 45];
arr.splice(1, 2, 34.4);
console.log(arr);
var harr = ["aaa", "bbb", "ccc", "ddd", "eee"];
harr.push("ggg");
harr.push("hhh");
harr.pop();
console.log(harr);
harr.forEach(function (value, i) { return console.log(value + ":" + i); });
harr.splice(5, 1, "xxx", "yyy");
console.log(harr);
console.log(harr.slice(1, 4));
