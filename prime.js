var n=224;
var i=2;
count=0
while(i<=(n/2)){
    if( n%i==0 ){
        count+=1;
    }
    i++;
}
if (count<2)
    console.log("Prime Number")
else
    console.log("Not Prime Number")