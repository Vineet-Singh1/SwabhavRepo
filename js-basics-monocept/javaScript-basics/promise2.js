const todos = (resource) => {

    return new Promise((resolve, reject) => {
            const request = new XMLHttpRequest();
            request.addEventListener('readystatechange', () => {
                if (request.readyState == 4 && request.status == 200) {
                    // console.log(request,request.readyState);
                    //  callback("data received");
                    const data = JSON.parse(request.responseText);
                  resolve(data);

                } else
                    if (request.readyState == 4) {
                        //console.log("could not fetch data");
                        // callback("data not found");
                        reject("callback is not fetched");
                    }
            });
            //request.open("GET","https://jsonplaceholder.typicode.com/todos/");
            request.open("GET", resource);
            request.send();

        // resolve("data could not be fetched");
      
    })
}

todos("shikhar.json").then((data) => {
   
    console.log("shikhar's data");
    console.log(data);
    return todos("rohan.json");
}).then((data) => {
    console.log("'rohan's data");
    console.log(data);
    return todos("vineet.json");
}).then((data) => {
    console.log("vineet's data");
    console.log(data);
}).catch((err) => {
    console.log(err);
});