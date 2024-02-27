import java.util.*;
class LeapYear{
public static void main(String [] args){
Scanner scan = new Scanner(System.in);
System.out.println("Enter the year:");
int year = scan.nextInt();
if(year%4==0)
System.out.println("Is Leap Year!");
else
System.out.println("In not a Leap Year!");
}
}