let num = 153;
let x = num;
let sum = 0;

while (num > 0) {
    let tem = num % 10;
    sum = sum +(tem**3);
    // num = Math.floor(num / 10); 
    num=(num/10)|0;
}

if (sum == x)
    console.log("Arm");
else
    console.log("not");
