var form = document.getElementById('myform');
form.addEventListener('submit', e => {
    e.preventDefault();

    var age = document.getElementById('age').value;
    var mydate = document.getElementById('mydate').value;
    var email = document.getElementById('email').value;
    var id = document.getElementById('id').value;
    var name = document.getElementById('name').value;
    var rollNo = document.getElementById('rollNo').value;
    var isMale = document.getElementById('ismale').value;

    fetch("http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students", {
        method: 'POST',
        body: JSON.stringify({
            Age: age,
            Date: mydate,
            Email: email,
            Id: id,
            Name: name,
            RollNo: rollNo,
            isMale: isMale

        }),
        headers: {
            "Content-Type": "application/json; charset=UTF-8"
        }
    }).then(function (response) {
        return response.json();
    }).then(function (data) {
        console.log(data);
    }).catch(function (error) {
        console.log(error);
    })
})
