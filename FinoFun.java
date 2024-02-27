import java.util.Scanner;

class Fibonacci{

int NthFibo(int count){
int n1 = 0, n2 = 1, n3, i;
System.out.println(n1,n2);
for(i =2; i<=count; i++){
n3 = n1+n2;
n2=n3;
}return(n3      );
}
}

class FinoFun{
public static void main(String [] args){
Scanner scan = new Scanner(System.in);

System.out.println("Enter the Nth value:");
int count = scan.nextInt();

Fibonacci obj = new Fibonacci();

System.out.println(obj.NthFibo(n3));
}
}


