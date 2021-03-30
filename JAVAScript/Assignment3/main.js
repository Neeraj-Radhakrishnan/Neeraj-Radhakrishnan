//Q1
class Rectangle{
    width;
    height;
    constructor(width,height){
        this.width = width;
        this.height = height;
    }
    
}
let rectangle = new Rectangle(4,5);
console.log(rectangle.width);
console.log(rectangle.height);

//Modified the properties

rectangle.height = 60;

console.log(rectangle.width);
console.log(rectangle.height)

//Q2
rectangle.getArea = function(){
    return this.height * this.width;
}
console.log(rectangle.getArea())

//Q3

rectangle.height = 50;
console.log(rectangle.getArea());

//Q4
var obj = {
     firstName:"Neeraj",
     lastName:"Radhakrishnan"}

console.log(obj.firstName);
console.log(obj.lastName);

obj.lastName = "K R"
console.log(obj.lastName);

//5

obj.middleName="K"
console.log(obj.middleName);

//6
var string = ({"firstName":"Neeraj","lastName":"Radhakrishnan"})
var json = eval(string)
console.log(json);
console.log(json.firstName);
console.log(typeof(json));

//7
var string = ({"firstName":"Neeraj","lastName":"Radhakrishnan"})
var real = JSON.parse('{"firstName":"Neeraj","lastName":"Radhakrishnan"}')
console.log(real);
console.log(typeof(real));




