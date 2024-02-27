import java.util.*;
class NumberN1N2{
public static void main(String [] args){
Scanner scan = new Scanner (System.in);
System.out.println("PRINT THE NUMBERS UPTO N1 WHICH ARE DIVISIBLE BY N2");
System.out.println("Enter the value for N1:");
System.out.println("Enter the value for N2:");
int N1 = scan.nextInt();
int N2 = scan.nextInt();
System.out.println("OUTPUT");
int y = N2;
for(;y<=N1;){
if(y%N2 == 0){
System.out.println(y);
y=y+N2;
}
}
}
}