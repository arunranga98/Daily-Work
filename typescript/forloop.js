var i = 1;
/*for(i=1;i<=10;i++)
{
    console.log(i+ ' ');
}
while(i<=10)
{
    console.log(i+ ' ');
    i++;
}*/
var marks = [30, 50, 70, 34, 56, 78, 98];
/*for(var m in marks){
    console.log(marks[m]);  // in --->for index position
}*/
for (var _i = 0, marks_1 = marks; _i < marks_1.length; _i++) {
    var m = marks_1[_i];
    console.log(m); //of -->only data
}
