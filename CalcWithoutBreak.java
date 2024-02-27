import java.util.Scanner;
class CalcWithoutBreak{
public static void main (String [] args){
Scanner scan = new Scanner (System.in);
System.out.println("1.Addition 2.Subraction");
int choice = scan.nextInt();
switch (choice){
case 1:
int n1 = 100;
int n2 = 100;
int sum = n1 + n2;
System.out.println(sum);

case 2:
int n3 = 100;
int n4 = 100;
int sub = n3 - n4;
System.out.println(sub);

}
}
}
