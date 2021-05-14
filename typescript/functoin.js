/*function add(num1: number,num2:number): number{
    return num1+num2;
}
let sum=add(39,21);
console.log('Sum is :'+ sum);

//****************Optional Function *************
function add(num1: number,num2:number,n3?:number): number{
    return num1+num2+n3;
}
let sum=add(39,21,2);
console.log('Sum is :'+ sum);*/
//**********Default value******** */
function add(num1, num2, n3) {
    if (n3 === void 0) { n3 = 30; }
    return num1 + num2 + n3;
}
var sum = add(3, 2);
console.log('Sum is :' + sum);
