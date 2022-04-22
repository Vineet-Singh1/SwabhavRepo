const worker = new Worker("worker.js");
const sumbutton= document.querySelector('.sum');
const bgcolorbutton= document.querySelector('.bgcolor');

sumbutton.addEventListener('click', e=>{
  worker.postMessage("hello Worker");
});

worker.onmessage= function(message){
    alert(`the final sum is ${message.data}`);
}
bgcolorbutton.addEventListener('click', e=>{
    if(document.body.style.background!=="green"){
        document.body.style.background="green";
    }
    else{
        document.body.style.background="blue";
    }
})