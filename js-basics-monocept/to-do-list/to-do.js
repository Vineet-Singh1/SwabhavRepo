// const button1 = document.querySelector('#btn1');
// const txt = document.querySelector('input');
// const item = document.querySelector('#p');
// button1.addEventListener('click', () => {
//     item.innerHTML += `<li class="list-group-item" >${txt.value}
//     <button class="delete">delete</button></li>`;
// });

// const button2 = document.querySelector('delete');


const button1 = document.querySelector('#btnClick');
button1.addEventListener('click', () => {
    document.getElementById('error').innerHTML = "";
    let name = document.getElementById('name').value;
   
    if (name == '') {
        document.getElementById('error').innerHTML = "**Please enter value";
    } else {
        let box = document.getElementById('box');
        box.innerHTML += `<li class = "list-group-item">${name}  <button class="delete">delete</button></li>`;
    }
    document.getElementById('name').value = "";
});



let button2 = document.querySelector('ul');
button2.addEventListener('click', e => {
    let box = document.getElementById('box');
    let li = e.target.parentNode;
    console.log(e.target.parentNode);
    box.removeChild(li);
}
);