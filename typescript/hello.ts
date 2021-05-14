//console.log('Hello World');
var global = 10; //global variable
class Scopes {
    static staticValue: number=20; //static variable
    instanceValue =30;  //anytype variable

    display():void{
        var localVariable:number=40; // local variable
        console.log('Local :'+ localVariable);
        console.log('Instance :'+ this.instanceValue);
        console.log('Static :'+ Scopes.staticValue);
        console.log('Global :'+global);
    }
}
var obj = new Scopes();
obj.display();