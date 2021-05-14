let i: number=1;
/*for(i=1;i<=10;i++)
{
    console.log(i+ ' ');
}
while(i<=10)
{
    console.log(i+ ' ');
    i++;
}*/
let marks: number[]=[30,50,70,34,56,78,98];
/*for(var m in marks){
    console.log(marks[m]);  // in --->for index position
}*/
for(var m of marks){
    console.log(m); //of -->only data
}