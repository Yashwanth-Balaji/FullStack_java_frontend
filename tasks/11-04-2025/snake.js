console.log("Welcome to the Snake Game")
let inp=prompt("Enter your choice=")
input=inp.toLowerCase();
let guess='sgw'.charAt(Math.floor(Math.random() * 3));

console.log(guess)
if (input==guess){
    console.log("Both inputs are same, So Draw")
}
else{
    if (input =='s' && guess=='w'||input =='w' && guess=='s')
        console.log("Snake wins")
    else if(input=='s' && guess=='g'||input=='g' && guess=='s')
        console.log("Gun wins")
    else if(input=='w' && guess=='g'||input=='g' && guess=='w')
        console.log("Water wins")
    else
        console.log("Enter a valid input")
}