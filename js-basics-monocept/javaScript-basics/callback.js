const todos= (resource,callback)=>{
    const request = new XMLHttpRequest();
    
    request.addEventListener('readystatechange',()=>{
        if(request.readyState==4 && request.status==200){
         // console.log(request,request.readyState);
        //  callback("data received");
        const data = JSON.parse(request.responseText);
          callback(undefined,data);
         
          
        }else
            if(request.readyState==4){
                //console.log("could not fetch data");
                // callback("data not found");
                callback("callback is not fetched",undefined);
            }
        
    });
    
    
    
    //request.open("GET","https://jsonplaceholder.typicode.com/todos/");
    request.open("GET",resource);
    request.send();
    };
    
    todos("rohan.json",(err,data)=>{
    console.log(data);
    todos("shikhar.json",(err,data)=>{
        console.log(data);
        todos("vineet.json",(err,data)=>{
            console.log(data);
        })
    }
    )
   
    });
    