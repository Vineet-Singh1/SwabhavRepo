const outerfun= outerVariable =>{
    
    return  innerVariable=> {
        console.log("outer variable " + outerVariable);
        console.log("inner variable " + innerVariable);
    }
}
const myfunc = outerfun('outside');
myfunc('inside');