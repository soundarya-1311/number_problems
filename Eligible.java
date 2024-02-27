import java.util.Scanner;
class Eligible{
public static void main(String [] args){
Scanner scan = new Scanner(System.in);
System.out.println();
int age = scan.nextInt();
if(age>=18)
System.out.println("Eligible for voting");
else
System.out.println("Not Eligible for voting");

}
}
