let num = 1001;
let x = num;
let sum = 0;

while (num > 0) {
    let tem = num % 10;
    sum = sum * 10 + tem;
    num = Math.floor(num / 10); 
}

if (sum == x)
    console.log("Palin");
else
    console.log("not");
