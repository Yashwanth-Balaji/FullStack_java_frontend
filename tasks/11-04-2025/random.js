let b = Math.floor(Math.random() * 101); // Random number between 0 and 100
console.log("Guess the number between 0 and 100!");

while (true) {
    let a = prompt("Enter a number between 0 and 100:");
    a = Number.parseInt(a);

    if (a >= 0 && a <= 100) {
        if (a < b)
            console.log("The number is smaller");
        else if (a > b)
            console.log("The number is greater");
        else {
            console.log("You guessed the correct number!");
            break;
        }
    } else {
        console.log("The entered number is out of range (0-100).");
    }
}
