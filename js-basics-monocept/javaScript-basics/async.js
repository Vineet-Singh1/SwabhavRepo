const demofunc=async()=>{
    const response = await fetch("rohan.json");
    if(!response.status==200){
        throw new Error("could not fetch resource");
    }
    const data = await response.json();
    return data;
};

demofunc().then((data)=>{
    console.log(data);
}).catch((error)=>{
 console.log("Rejected",error.message);
});