const questions = [
    {
        'que': 'Which of the following is a markup language?',
        'a': 'HTML',
        'b': 'CSS',
        'c': 'JavaScript',
        'd': 'PHP',
        'correct': 'a'
    },
    {
        'que': 'how many sides does triangle has?',
        'a': 'ONE',
        'b': 'TWO',
        'c': 'THREE',
        'd': 'FOUR',
        'correct': 'c'
    },
    {
        'que': 'Which of the following is our national bird?',
        'a': 'PEACOCK',
        'b': 'CROW',
        'c': 'SPARROW',
        'd': 'OSTRICH',
        'correct': 'a'
    },
    {
        'que': 'Which of the following is the longest river in India?',
        'a': 'YAMUNA',
        'b': 'KAVERI',
        'c': 'GANGA',
        'd': 'NONE OF THE ABOVE',
        'correct': 'c'
    },
    {
        'que': 'Which of the following language used for styling the webpages?',
        'a': 'C',
        'b': 'CSS',
        'c': 'JavaScript',
        'd': 'PHP',
        'correct': 'b'
    }
];


let index = 0;
let total = questions.length;
let right = 0;
let wrong = 0;
const queBox = document.getElementById('quesbox');
const optionInputs = document.querySelectorAll('.options');
const data = questions[index];

const loadQuestion = () => {
    if (index == total) {
        return end();
    }
    reset();
    const data = questions[index];
    queBox.innerText = `${index + 1}) ${data.que}`;
    optionInputs[0].nextElementSibling.innerText = data.a;
    optionInputs[1].nextElementSibling.innerText = data.b;
    optionInputs[2].nextElementSibling.innerText = data.c;
    optionInputs[3].nextElementSibling.innerText = data.d;
}

const button = document.querySelector('#btn1');

button.addEventListener('click', () => {
    const data = questions[index];
    console.log("button clicked")
    const ans = getAnswer();
    console.log(ans, data.correct);
    if (ans == undefined) {
        alert('please choose an option');
        index--;

    }
    if (ans == data.correct) {
        right++;
    } else {
        wrong++;
    }
    index++;
    loadQuestion();
    return;
});

const getAnswer = () => {
    let answer;
    optionInputs.forEach((input) => {
        if (input.checked) {
            answer = input.value;
        }

    });
    return answer;
}

const reset = () => {
    optionInputs.forEach((input) => {
        input.checked = false;
    });
}

const end = () => {
    document.getElementById("box").innerHTML = `<h2> Thank You for playing the quiz </h2><br>
    <h3>Results: ${right}/${total} are correct</h3> <a href= "quiz.html"><button class="btn" id="btn2">Replay</button></a>`;
    // replay();
}

loadQuestion();



    // const button2 = document.getElementById('btn2');

    // button2.addEventListener('click', () => {
    //     console.log("in the button 2 event listener");
    //     loadQuestion();
    // });