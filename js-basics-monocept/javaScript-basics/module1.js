function makeCustomer(){
    let customer= {};
    let _id, _name;

    customer.setId = function(id){
        _id=id;
    }
    customer.setName = function(name){
        _name=name;
    }
    customer.getDetails=function () {
        return `customer name :${_name} and id is: ${_id}`;
    }
    return customer;
}

let cust = makeCustomer();
cust.setId(102);
cust.setName("Rohan");
console.log(cust.getDetails());