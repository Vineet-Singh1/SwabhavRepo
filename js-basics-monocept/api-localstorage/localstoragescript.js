const button = document.getElementById('btnClick')


button.addEventListener('click',()=>{
    const value = document.getElementById('txt').value;
    const now = new Date();

    var text = localStorage.getItem(value);
    if (text == null) {
        alert("New Record")}

        else {
            var prevtime = text.split(".");
            
            const before = new Date(prevtime[prevtime.length - 1]);
            alert("you searched this " + dateFns.distanceInWords(now, before, { addSuffix: true }));};
    
    if( value>0){
    todos(`http://numbersapi.com/${value}`).then((data) => {
    //    console.log(data);
       var time = dateFns.format(now, 'MMMM D YYYY HH:mm:ss');;
       newData = `${data}${time}`;
       localStorage.setItem(value,newData);
      
       let box = document.getElementById('box');
       if(value%2==0)
       box.innerHTML += `<li id ="even" class = "list-group-item"> ${newData} <button class="delete">delete</button></li>`;
       else
       box.innerHTML += `<li id ="odd" class = "list-group-item">${newData} <button class="delete">delete</button></li>`;
         document.getElementById('txt').value="";
    });
}else{
    alert("enter a number");
}

});

let button2 = document.querySelector('ul');
button2.addEventListener('click', e => {
    let box = document.getElementById('box');
    let li = e.target.parentNode;
    console.log(li);
    var str = li.innerHTML;
    var matches = str.match(/(\d+)/);
    console.log(matches);
    localStorage.removeItem(matches[0]);
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

function findLocalStorage(value) {
    

    var text = localStorage.getItem(value);
    if (text == null) {
        alert("New Record")
        return true;
    }
    else {


        var prevtime = text.split(",");
        const now = new Date;
        const before = new Date(prevtime[prevtime.length - 1]);
        alert("you searched this " + dateFns.distanceInWords(now, before, { addSuffix: true }));
        return false;
    }
}