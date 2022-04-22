const doSomething=()=>{
    return new Promise((resolve,reject)=>{
       // resolve("data could not be fetched");
        reject("data received");
    })
}

doSomething().then((data)=>{
    console.log(data);
}).catch((err)=>{
    console.log(err);
})