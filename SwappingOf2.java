import java.util.*;
class SwappingOf2{
public static void main (String [] args){
Scanner scan = new Scanner (System.in);
System.out.println("SWAPPING OF TWO NUMBERS");
System.out.println("Enter num1:");
System.out.println("Enter num2:");
int num1 = scan.nextInt();
int num2 = scan.nextInt();
int temp = num1;
num1 = num2;
num2 = temp;
System.out.println(num1);
System.out.println(num2);
}
}