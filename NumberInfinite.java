import java.util.*;
class NumberInfinite{
public static void main(String [] args){
Scanner scan = new Scanner(System.in);
System.out.println("Print N numbers divisible by 5 using Infinte Loop");
System.out.println("Enter the N value:");
int N = scan.nextInt();
int y=5, count = 0;
for (;;){
if ( y%5 == 0){
System.out.println(y);
count++;}
if (N==count)
break;
y = y+5;
}
}
}
