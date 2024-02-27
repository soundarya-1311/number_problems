import java.util.*;
class Prime{
int NthPrime(int n){

int num = 1,count=0,i;

while(count <n){
num = num +1;
for(i = 2;i<num; i++){
if (num %i == 0){
break;
}
}
if(i == num)
{
count = count+1;
}
}return(num);
}
}

class Main{
public static void main(String [] args){
Scanner scan = new Scanner(System.in);
System.out.println("Enter the Nth Value:");
int n= scan.nextInt();

Prime obj = new Prime();
System.out.println(obj.NthPrime(n));
}
}