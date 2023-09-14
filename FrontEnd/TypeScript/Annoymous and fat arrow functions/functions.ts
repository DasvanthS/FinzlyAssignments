
let fun1 = function(){
    console.log("fun1");
}

let fun2 = function(a:number){
    console.log(`fun2 ${a}`);
}

let fun3 = function():string{
    return "fun3";
}

let fun4 = function(b:string):string{
    return "fun4 " + b;
}

fun1();
fun2(2);
console.log(fun3());
console.log(fun4("das"));

let fun5 = () => {
    console.log("fun5");
}

let fun6 = (c:number) => {
    console.log(`fun6 ${c}`);
}

let fun7 = ():string => {
    return "fun7";
}

let fun8 = (d:string):string => {
    return `fun8 ${d}`;
} 

fun5();
fun6(2);
console.log(fun7());
console.log(fun8("das"));


let arr:number[] = [1,2,3,45,3,3,342,5,45]
arr.splice(1,2,34.4)
console.log(arr);

let harr:string[] = ["aaa","bbb","ccc","ddd","eee"]
harr.push("ggg");
harr.push("hhh")
harr.pop();
console.log(harr);
harr.forEach((value, i) => console.log(value + ":" + i));

harr.splice(5,1,"xxx","yyy");
console.log(harr);

console.log(harr.slice(1,4));
