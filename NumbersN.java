import java.util.*;
class NumbersN{
public static void main (String [] args){
Scanner scan = new Scanner(System.in);
System.out.println("Print N Numbers divuisible by 5");
System.out.println("Enter the N value:");
int N = scan.nextInt();
int y = 5, count = 0;
for (;y<=1000;)
{
if (y%5 == 0){
System.out.println(y);
count++;
}
if (N == count)
break;
y = y+5;
}
}
}