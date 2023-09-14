
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
