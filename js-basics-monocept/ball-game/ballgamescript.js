var randomNumber = Math.floor(Math.random() * 50 + 1);
var attempts = 0;
var stopValue = true;
var heading = document.querySelector('h1');
console.log(randomNumber);
var buttons = document.querySelectorAll(".button");

var i = 0, length = buttons.length;
for (i; i < length; i++) {
    buttons[i].addEventListener('click', (button) => {

        if (stopValue > 0) {
            attempts++;
            heading.innerHTML = `Total attempts :${attempts}`;
            if (randomNumber == button.target.innerText) {
                button.target.setAttribute("class", "correct");
                heading.innerHTML = `Hurray! You Won...Total attempts :${attempts}`;
                stopValue = 0;
            }
            if (randomNumber > button.target.innerText) {
                button.target.setAttribute("class", "lesser");
                button.target.disabled = true;
            }
            if (randomNumber < button.target.innerText) {
                button.target.setAttribute("class", "greater");
                button.target.disabled = true;
            }
        }
    });
}




// function check(id) {
//     if (stopValue > 0) {

//         attempts++;
//         document.querySelector('h1').innerHTML = "Total attempts :" + attempts;
//         let button = document.getElementById(id).innerText;
//         if (button == randomNumber) {
//             document.querySelector('h1').innerHTML = "You Won... in " + attempts + " attempts";
//             // document.querySelectorAll('.button').forEach(elem => {
//             //     elem.disabled = true;
//             //   });
//             document.getElementById(id).className = "correct";
//             stopValue = false;
//         }
//         if (button < randomNumber) {

//             document.getElementById(id).className = "lesser";
//             document.getElementById(id).disabled = true;

//         }
//         if (button > randomNumber) {

//             document.getElementById(id).className = "greater";
//             document.getElementById(id).disabled = true;
//         }
//     }
// }