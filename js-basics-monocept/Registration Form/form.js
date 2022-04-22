
var letters = /^(?=.*[0-9])(?=.*[!@#$%^&*])[a-zA-Z0-9!@#$%^&*]{8,16}$/;
var specialchar=  /^[a-zA-Z0-9]+$/;
var emailveri= /^\w+@[a-zA-Z_]+?\.[a-zA-Z]{2,3}(.[a-z]{2,8})?$/;

const form = document.getElementById('form');

form.addEventListener('submit', (e) => {

    var pass1 = document.getElementById("pass").value;
    var pass2 = document.getElementById("confirmpass").value;
    var name = document.getElementById("name").value;
    document.getElementById("spass").innerHTML="";
    document.getElementById("scon").innerHTML="";
    document.getElementById('sname').innerHTML="";
    document.getElementById('semail').innerHTML="";
    
    
    if(name.search(specialchar)==-1){
        document.getElementById('sname').innerHTML="**Please fill only numbers and alphabets"
    }
    

    if (pass1 == "") {
        
        document.getElementById("spass").innerHTML = "***Please enter the password";
        
    }
    if (pass1.search(letters) == -1 && !pass1=="") {
        document.getElementById("spass").innerHTML = "***invalid password";
    }
    
    

    if (pass1 != pass2) {
        document.getElementById("scon").innerHTML = "***Passwords are not same";
        
    }

    var email = document.getElementById('email').value;
    if (email.length > 25) {
        document.getElementById('semail').innerHTML = "**email length should be less than 25 characters";
    }
    if(email.search(emailveri)==-1){
        document.getElementById('semail').innerHTML="**invalid email address";
    }
    e.preventDefault();
}

);


