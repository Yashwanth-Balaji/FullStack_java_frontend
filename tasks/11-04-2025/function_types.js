//With return type and parameters

function add1(a,b){
    return a+b;
}
console.log(add1(2,6));

let a=function(a,b){
    return a+b;
}
console.log(a(2,10));

let b=(a,b)=>{
    return a+b;
}
console.log(b(10,20));

//with return type and no parameters

function display(){
    return "Yashwanth balaji";
}
console.log(display());


let y=function(){
    return "Gtec Jainx"
}
console.log(y());

let z=()=>{
    return "Yelahanka"
}
console.log(z());

//without both the parameters and return type

function available(){
    console.log("Available");
}
available();

let p=function(){
    console.log("Good evening")
}
p();


let q=()=>{
console.log("Hello Guys");
}

q();

//with parameter and without return type

function mul(g1,g2){
    console.log(g1*g2);
}
mul(9,3);

let j=(f1,f2)=>{
    console.log(f1/f2);
}
j(9,3);


let t=(p1,p2)=>{
    console.log(p1**p2);
}

t(2,5);