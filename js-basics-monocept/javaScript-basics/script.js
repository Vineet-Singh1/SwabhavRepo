// let name = "Aman";
// console.log(name,typeof name);

// name = "Vineet";
// console.log(name,typeof name);

// name = 100;
// console.log(name,typeof name);

// console.log(value);
// var value = "Ramesh";

// let email="indiaismycountry@gmail.com";
// console.log(email.toUpperCase());
// console.log(email.indexOf("@"));
// console.log(email.substring(17));
// let firstIndex=email.indexOf("country");
// let lastIndex = firstIndex+7;
// console.log(email.substring(firstIndex,lastIndex));

//1. Convert to uppercase
//2. find the index of @
//3. find all characters after@
//4. extract country from email

// let email="indiaismyiscountry@gmail.com";
// let newStr = email.replace('is','IS');
// let str = email.replaceAll('is','IS');
// console.log(newStr);
// console.log(str);
// let title="Indian cooking";
// let author = "ramya";
// let likes = 500;
// let tempStr = `Blog on ${title} by ${author} has ${likes} likes`;
// console.log(tempStr);





//find the length of players
//generate a string of all players seperated by - Sachin-Virat...
//add ['Pant','Dinesh'] to player array
//add 'Ishan' to array

// let players =['Sachin','Virat','Rohit','Mayank'];
// console.log(players.length);
// player = players.join("-");
// console.log(player);
// let addPlayers= ['pant','Dinesh'];
// let newPlayers = players.concat(addPlayers);
// console.log(newPlayers);
// newPlayers.push('Ishan');
// console.log(newPlayers);

// let age = null;
// console.log(age);
// console.log(age+10);

// let newStr = null;
// let anotherStr = "Hello";
// console.log(newStr+anotherStr);

// let value = undefined;
// console.log(value);
// console.log(value+10);


// console.log(value+anotherStr);

// function writeSomething(){
//     console.log("Writing something");
// }
// writeSomething();


// const greet = function greet(){
//     console.log("Good Morning");
// }
// greet();

// const message = function(name="Akshay",time="night"){
//     console.log("send by "+name+" at "+time);
// };
// message("Vineet","Morning");
// message("nitin");
// message();

//Arrow function
// const message = (name,date)=>{
//     console.log("sender "+name+" at "+date);
// }
// message("Vineet","23/05/2020");

// const area= radius=>{return Math.PI*radius**2;};
// console.log(area(10));

// const  myfunc = func=>{
//     let val = 60;
//     console.log(value);
// };

// myfunc(val=>{
//     console.log(val);
// })

// let players = ["sachin","virat","kartik","Dhoni"];
// players.forEach(player=>{
//     console.log(player);
// });


// let employee = {
//     eName: "Vikas",
//     articles: [{ title: "Working with Dom", likes: 50 }, { title: "Working with Eclipse", likes: 700 }],
//     age: 45,
//     projects: ["java project", "machine learning project"],
//     login: function () {
//         console.log("user Logged in");
//     },
//     logOut: function () {
//         console.log("user Logged Out");
//        this.articles.forEach(article=>{
//            console.log(article.title+" "+article.likes);
//        })
//     }
// };
// console.log(employee);
// console.log(employee.eName);
// console.log(employee.age);
// console.log(employee.projects);
// employee.logOut();

// let value = 9.3445;
// console.log(Math.round(value));
// console.log(Math.ceil(value));
// console.log(Math.floor(value));
// console.log(Math.round((Math.random()*100)+1));

// const h1ref =document.querySelector('h1');
// console.log(h1ref);
// h1ref.textContent +=" Changed Title";
// const h1ref = document.querySelector('h1');
// let players = ['virat', 'sachin', 'dinesh', 'dhoni'];
// let html = ``;
// players.forEach(player => {
//     html += `<li>${player}</li>`;
// });
// console.log(html);
// h1ref.innerHTML = html;
// //console.log(h1ref);

// const h1ref = document.querySelector('div');
// let websites = [["facebook","www.facebook.com"],["whatsapp","www.whatsapp.com"],["google","google.com"]];
// let html = ` `;
//  websites.forEach(website=> {
//     html += `<a href="${website[0]}">${website[1]}</a>`;
//  });
//  h1ref.innerHTML = html;

// const para = document.querySelector('p');
// console.log(para.innerText);

// const para = document.querySelector('#unique');
//    console.log(para.innerText);

// const para = document.querySelector('.error');
//  console.log(para.innerText);

// const para = document.querySelector('div.error');
//  console.log(para.innerText);

//  const para2=document.getElementById('unique');
//  console.log(para2.innerText);

// const para3=document.getElementsByClassName("error");
//HTMLCollection, cannot itterate through a foreach-convert to an array

//  const para3=document.querySelectorAll(".error");
//  para3.forEach(para=>{
//      console.log(para);
//  });
//NodeCollection ,itterate through a foreach



// const paras=document.querySelectorAll('p');
// paras.forEach(para=>{
//     console.log(para);
// })
// //NodeCollection ,itterate through a foreach

// const paras=document.getElementsByTagName('p');
//HTMLCollection

// const h1ref = document.querySelector('thead');
// let html = ``;

// let players = [{ name: 'Sachin', age: 40, runs: 10000, wickets: 100 }, { name: 'rahul', age: 50, runs: 2000, wickets: 30 },
// { name: 'Dhoni', age: 46, runs: 50000, wickets: 900 }, { name: "kohli", age: 39, runs: 4000, wickets: 40 }

// ]

// players.forEach(player => {
//     // console.log(player.name+" "+player.age+" "+player.runs+" "+player.wickets);
//     html += `<tr> <td>${player.name}</td><td>${player.age}</td><td>${player.runs}</td><td>${player.wickets}</td></tr> `;
// });
// h1ref.innerHTML += html;

// let link = document.querySelector('a');
// console.log(link.getAttribute("href"));
// link.setAttribute("href","www.facebook.com");
// link.innerHTML="facebook";
// link.setAttribute("class","error");
// const para = document.querySelector('p');
// console.log(para.classList);
// para.classList.remove("success");
// para.classList.add("error");

// const paras = document.querySelectorAll('p');
// paras.forEach(para=>{
//     if(para.textContent.includes("error"))
//     para.classList.add("class","error");
//     if(para.textContent.includes("success"))
//     para.classList.add("class","success");
// });

// const paras = document.querySelectorAll('p')
// const heading = document.querySelector('h1');
// heading.addEventListener('click',()=>{
//     paras.forEach(para=>{
//         para.classList.toggle("success");
//     })
// });

// const button = document.querySelector('#btn1');
// const txt = document.querySelector('input');
// const para = document.querySelector('.p');
// console.log(button);
// console.log(txt);
// button.addEventListener('click', () => {
//     // console.log(txt.value);
//     para.innerHTML = txt.value;
// });

// const txt= document.querySelector('input');
// const para = document.querySelector('.p');
// txt.addEventListener('input',()=>{
//     if(para.innerHTML.includes)
//     para.innerHTML=txt.value;
//  });


// const article = document.querySelector('article');
// const para = document.querySelector('p');
// console.log(article.children);

// Array.from(article.children).forEach(child=>
//     {
//         console.log(child);

//     });

//     console.log(para.parentElement);
//     console.log(para.nextElementSibling);
//     console.log(para.previousElementSibling);

//const scores=[10,30,40,20,25,50,35];
// let filteredArray=[];
// scores.forEach(score=>{
//     if(score>=30)
//     filteredArray.push(score);
// });
// filteredArray.forEach(newscores=>{
//   console.log(newscores);
// });
// let filteredArray = scores.filter(score=>{
//     return score>30;
// });
// console.log(filteredArray)

// const users=[
// 	{name:"Jay",premium:true},
// 	{name:"Roy",premium:false},
// 	{name:"Lee",premium:true},
// 	{name:"Jan",premium:false},
// 	{name:"Tim",premium:true}
// ];
// let filteredArray = users.filter(user=>  user.premium);
// console.log(filteredArray);

//const prices=[100,300,400,200,250,500,350];
// let discountPrices=[];
// prices.forEach(price=>{
//     discountPrices.push(price-price*0.5);
// });
// console.log(discountPrices);

// const prices=[100,300,400,200,250,500,350];
// const salesPrice = prices.map(price=>price*.5);
// console.log(salesPrice);


// const products=[
// 	{name:"Good night",price:350},
// 	{name:"Maggi",price:70},
// 	{name:"Rice",price:560},
// 	{name:"Biscuit",price:50},
// 	{name:"Shoe",price:900}
// ];

// const saleProduct = products.map(product=>{
//     if(product.price>500){
//         return {name:product.name,price:product.price*0.7};
//     } else return product;
// });
// console.log(saleProduct);
// const prices=[2,5,50,12,34,23,19,45,65,42];
// prices.sort();
// console.log(prices);
// prices.sort((a,b)=>{
//     return a-b;
// });
// console.log(prices);

// const products=[
// 	{name:"Good night",price:350},
// 	{name:"Maggi",price:70},
// 	{name:"Rice",price:560},
// 	{name:"Biscuit",price:50},
// 	{name:"Shoe",price:900}
// ];

// products.sort((a,b)=>{
//     return a.price-b.price;
// }
// );
// console.log(products);

// const products=[
// 	{name:"Good night",price:350},
// 	{name:"Maggi",price:70},
// 	{name:"Rice",price:560},
// 	{name:"Biscuit",price:50},
// 	{name:"Shoe",price:900}
// ];
// products.sort((a,b)=>{
//     if (a.name < b.name) {
//         return -1;
//       }
//       if (a.name > b.name) {
//         return 1;
//       }
// });
// console.log(products);

// const scores =[2,5,50,12,60,72,34,23,19,45,65,42,19,34];
// const result = scores.reduce((acc,score)=>{
//     if(score>=30){
//         acc++;
//     }
//     return acc;
// },0);
// console.log(result);

// const now = new Date();
// console.log("Todays date: "+now.getDate()+"-"+(now.getMonth()+1)+"-"+now.getFullYear());
// console.log(now.getTime());
// console.log(now);
// console.log(now.toDateString());
// console.log(now.toTimeString());
// console.log(now.toLocaleDateString());
// const before= new Date("February 20 2022 7:30:59");
// console.log(before);
// console.log((now-before)/(1000*60*60*24));


// function showTime(){
//      const now = new Date();
//      hours = now.getHours();
//      minutes = now.getMinutes();
//      seconds =  String(now.getSeconds()).padStart(2, '0');
//      const hrs = document.getElementById('hrs');
//      const mins =document.getElementById('mins');
//      const sec = document.getElementById('secs');
//      hrs.innerHTML=hours;
//      mins.innerHTML= minutes;
//      sec.innerHTML=seconds;


// }
// setInterval(showTime,1000);
// const now = new Date();
// const before= new Date("April 20 2022 7:30:59");
// console.log(dateFns.format(now,"ddd Do MMM YYYY"));
// console.log(dateFns.distanceInWords(now,before),{ addSuffix: true });
   

// console.log(1);
// console.log(2);
// console.log(3);
// setTimeout(()=>{
//     console.log("call back function is called")
// },3000);
// console.log(4);
// console.log(5);
// console.log(7);
// console.log(8);
// console.log(9);
// console.log(10);
// const now = new Date();
// const button1 = document.getElementById('btn1');
// button1.addEventListener('cllck',()=>{
     
// });

// const button2= document.getElementById('btn2');
// button2.addEventListener('click',()=>{
  
// });






// const greet =()=>{
//     console.log("hi");
// }

// const showAlert=()=>{
//     alert("Danger");
// };

// setTimeout(showAlert,2000);
// greet();
// greet();
// greet();
// greet();
// greet();
// greet();
// greet();

//method.js
// console.log(moment("20221031", "YYYYMMDD").fromNow());
// console.log(moment().startOf('day').fromNow());
// console.log(moment().endOf('day').fromNow());
// console.log(moment().startOf('hour').fromNow());
// console.log(moment().subtract(10, 'days').calendar());
// console.log(moment().subtract(3, 'days').calendar());
// console.log(moment().calendar());
// console.log(moment().add(3, 'days').calendar());
// console.log(moment().format('LTS'));
// console.log(moment().format('LLL'));
// console.log(moment().format('llll'));
// console.log(moment().format('LLLL'));

// const todos= (callback)=>{
// const request = new XMLHttpRequest();

// request.addEventListener('readystatechange',()=>{
//     if(request.readyState==4 && request.status==200){
//      // console.log(request,request.readyState);
//     //  callback("data received");
//     const data = JSON.parse(request.responseText);
//       callback(undefined,data);
     
      
//     }else
//         if(request.readyState==4){
//             //console.log("could not fetch data");
//             // callback("data not found");
//             callback("callback is not fetched",undefined);
//         }
    
// });



// //request.open("GET","https://jsonplaceholder.typicode.com/todos/");
// request.open("GET","shikhar.json");
// request.send();
// };

// todos((err,data)=>{
// console.log("call back is fired");
// if(err){
//     console.log(err);
// }else{
//     console.log(data);
// }
// });
