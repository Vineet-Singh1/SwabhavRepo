const DataService= function(){

    let obj={};

    obj.doTask1 = function(){
        console.log("You are in Task1");
    }
    obj.doTask2 = function(){
        console.log("You are in Task2");
    }
    return obj;
}();

// const data= DataService();
DataService.doTask1();
DataService.doTask2();