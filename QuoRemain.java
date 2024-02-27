import java.util.Scanner;
class QuoRemain{
public static void main(String [] args){
Scanner scan = new Scanner (System.in);
System.out.println("Enter the numbers");
int n1 = scan.nextInt();
int n2 = scan.nextInt();
int Quotient = n1/n2;
int Remainder = n1%n2;
System.out.println("Quotient:"+Quotient);
System.out.println("Remainder:"+Remainder);
}
}