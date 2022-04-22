var randomNumber = Math.floor(Math.random() * 10 + 1);
console.log(randomNumber);
let attempts = 0;
var stopvalue = true;
var lastValues=[0];

function check() {
    let value = document.getElementById('myRange').value;
   
    if (stopvalue > 0 && !lastValues.includes(value) ) {
        console.log(lastValues);
        attempts++;
        document.querySelector('h1').innerHTML = `Total Attempts :${attempts}`;
        
        
        let button = document.getElementById(`btn${value}`);
        if (value == randomNumber) {
            button.classList.add("correct");
            document.querySelector('h1').innerHTML = `Hurray! you won the game in ${attempts} attempt`;
            stopvalue= false;
        }
        if (value > randomNumber) {
            button.classList.add('greater');
            lastValues.push(value);
            
        }
        if (value < randomNumber) {
            button.classList.add('lesser');
            lastValues.push(value);
        }
        
    }
}