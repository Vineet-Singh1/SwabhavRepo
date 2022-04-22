localStorage.setItem("name","vineet");
localStorage.setItem("name","abhishek");
localStorage.setItem("age",15);
localStorage.setItem("isAdult",false);
console.log(localStorage.name);
localStorage.removeItem.name;
localStorage.clear();

const players =[{name:"Dhoni",score:300},
{name:"Dhoni",score:230},
{name:"Dhoni",score:100},
{name:"Dhoni",score:320}
];
localStorage.setItem("players",JSON.stringify(players));
const data = localStorage.getItem("players");

const playersData = JSON.parse(data);
console.log(playersData);

