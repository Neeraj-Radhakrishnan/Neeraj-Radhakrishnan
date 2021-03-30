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
exports.__esModule = true;
//Question 1
var x = 10;
console.log(x); //10
//const a = 20; this will throw an error aas we have mentioned a as const
//Question 2
var a = 1;
var b = 2;
if (a === 1) {
    var a = 10;
    b = 20;
    console.log(a); //10
    console.log(b); //20
}
console.log(a); //10
console.log(b); //2 cannot access ouside the block
//Question 3
var Order = {
    id: 101,
    title: "Table",
    price: 5000,
    printorder: function () {
        return this.title;
    },
    getPrice: function () {
        return this.price;
    }
};
console.log(Order.printorder());
console.log(Order.getPrice());
var obj = Object.assign(Order, {});
console.log(obj);
//Question 4
var list = [];
var names = ["Tom", "lvan", "Jerry"];
var xyz = function (names) {
    for (var i in names) {
        var x_1 = "{" + "names:" + names[i] + ",length:" + names[i].length + "}";
        list.push(x_1);
    }
};
console.log(list);
//Question 5
//a
function add(a, b) {
    return a + b;
}
;
console.log(add(5, 2));
//b
var userName = "Neeraj";
var friends = ['kiran', 'Adeeb', 'Shyamm'];
function userFriends(userName, friends) {
    console.log("Name is:" + userName + "\n Friends are:");
    for (var friend in friends) {
        console.log(friends[friend]);
    }
}
;
userFriends(userName, friends);
//c
var cities = ['Kochi', 'Mumbai', 'Delhi', 'Chennai', 'Banglore'];
function capitalNames() {
    var fiveNames = [];
    for (var _i = 0; _i < arguments.length; _i++) {
        fiveNames[_i] = arguments[_i];
    }
    for (var i in fiveNames) {
        console.log(fiveNames[i].toUpperCase());
    }
}
capitalNames.apply(void 0, cities);
//Question 6 Template Literals
var laptopModel = "Thoshiba Satelite";
var deskNo = 101;
var name = "Radhakrishnan";
console.log("Customer Name: " + name + ",\nwith Desktop Number: " + deskNo + ",\nLaptop Model: " + laptopModel + " ");
// Question 7  De-structuring
//a 
var arr1 = ['Hyderabad', 'Mumbai', 'Delhi', 'Jaipur'];
console.log(arr1[3]);
//b
var Obj = {
    name: "Neeraj",
    address: {
        city: 'Kodungallur',
        state: 'Kerala',
        pincode: 680685
    }
};
console.log(Obj.address.pincode); //get pincode 501301
//8
var Account = /** @class */ (function () {
    function Account(accountId, accountName, accountBalance) {
        this.accountId = accountId;
        this.accountName = accountName;
        this.accountBalance = accountBalance;
        console.log(accountId, accountName, accountBalance);
    }
    return Account;
}());
var SavingAccount = /** @class */ (function (_super) {
    __extends(SavingAccount, _super);
    function SavingAccount(interest, accountId, accountName, accountBalance) {
        return _super.call(this, accountId, accountName, accountBalance) || this;
    }
    SavingAccount.prototype.getaccountBalance = function () {
        return this.accountBalance;
    };
    return SavingAccount;
}(Account));
var CurrentAccount = /** @class */ (function (_super) {
    __extends(CurrentAccount, _super);
    function CurrentAccount(cash_credit, accountId, accountName, accountBalance) {
        return _super.call(this, accountId, accountName, accountBalance) || this;
    }
    return CurrentAccount;
}(Account));
var ac = new SavingAccount(1, 4000, "Neeraj", 1000);
var ad = new CurrentAccount(100, 248, "Radhakrishnan", 6000);
//let acc=ac.accountBalance+ad.accountBalance
//console.log(acc);
function totalBalance(ac, ad) {
    var totalBalance = ac.accountBalance + ad.accountBalance;
    console.log(totalBalance);
}
totalBalance(ac, ad);
