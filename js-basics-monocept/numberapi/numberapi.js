const button = document.getElementById('btnClick')


button.addEventListener('click',()=>{
    const now = new Date();
    const value = document.getElementById('txt').value;
    todos(`http://numbersapi.com/${value}`).then((data) => {
       console.log(data);
       
       let box = document.getElementById('box');
       if(value%2==0)
       box.innerHTML += `<li id ="even" class = "list-group-item">${data} ${moment().format('LTS')} <button class="delete">delete</button></li>`;
       else
       box.innerHTML += `<li id ="odd" class = "list-group-item">${data} ${moment().format('LTS')} <button class="delete">delete</button></li>`;
       document.getElementById('txt').value="";
    });
    
});

let button2 = document.querySelector('ul');
button2.addEventListener('click', e => {
    let box = document.getElementById('box');
    let li = e.target.parentNode;
    console.log(e.target.parentNode);
    box.removeChild(li);
}
);



const todos = (resource) => {

    return new Promise((resolve, reject) => {
            const request = new XMLHttpRequest();
            request.addEventListener('readystatechange', () => {
                if (request.readyState == 4 && request.status == 200) {
                    const data = request.responseText;
                  resolve(data);

                } else
                    if (request.readyState == 4) {
                        reject("callback is not fetched");
                    }
            });

            request.open("GET", resource);
            request.send();
      
    })
}
