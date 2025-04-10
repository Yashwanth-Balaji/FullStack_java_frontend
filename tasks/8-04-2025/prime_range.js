var n=20;
count=0;

for(let o=2;o<=n;o++){
   if(!isPrime(o)){
    count+=1;
   }
}
function isPrime(t){
var i=2;
pr=false;
while(i<=(t/2)){
    if( t%i==0 ){
        return true;
    }
    i++;
}
return false;
}
