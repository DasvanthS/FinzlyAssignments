"use strict";
var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
Object.defineProperty(exports, "__esModule", { value: true });
exports.Semicircle = void 0;
var Circle_1 = require("./Circle");
var fun_1 = require("../otherPackage/fun");
var Semicircle = /** @class */ (function (_super) {
    __extends(Semicircle, _super);
    function Semicircle() {
        return _super !== null && _super.apply(this, arguments) || this;
    }
    Semicircle.prototype.area = function () {
        console.log("In semicircle class");
        _super.prototype.area.call(this);
    };
    return Semicircle;
}(Circle_1.Circle));
exports.Semicircle = Semicircle;
var sc = new Semicircle();
sc.area();
(0, fun_1.fun)();
