var collectData;
var sno = 0;
var table = document.querySelector('table');
const func = fetch("http://gsmktg.azurewebsites.net:80/api/v1/techlabs/test/students").then((response) => {
    //console.log("request resolved", response.json());
    return response.json();

}).then((data) => {
  
    console.log(data,typeof(data));
    data.forEach(e => {
        if(e.rollNo!=0 && e.name!=null ){
        sno++;
        table.innerHTML+=`<tr><td> ${sno}</td><td> ${e.age}</td><td> ${e.rollNo}</td><td>${e.name}</td><td>${e.email}</td><td>${e.date}</td><td>${e.isMale}</td><tr>`;
        }
    });
    document.querySelector('h1').innerText+=sno;
}).catch((error) => {
    console.log("request rejected", error);
});




