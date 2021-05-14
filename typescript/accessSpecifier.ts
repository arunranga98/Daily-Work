class Product{
    readonly na='Arun';//CANNOT MODIFY VARIABLE THAT IS READONLY
    protected name:string;
    protected price=20;
    constructor(name: string,price: number){
         this.name=name; 
        this.price=price;
    }
    display():void{
        console.log(this.name);// use this keyword to ACCESS INSTANCE VARIABLE
        console.log(this.price);
    }
}
let product1=new Product('DELL LAPTOP',55000);
product1.display();

class ProductTax extends Product{
    protected tax:number;
    constructor(name:string,price:number,tax:number){
        super(name,price);
        this.tax=tax;
    }
    display():void{
        super.display();
        console.log(this.tax);
    }
    getNetPrice():number{
        return this.price + this.price*this.tax/100;
    }
}

var pt=new ProductTax('DEll',55000,28);
pt.display();
console.log('The Net price is: '+pt.getNetPrice());
