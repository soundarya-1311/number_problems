import java.util.*;

class StringPalindrome{
public static void main(String [] args){

Scanner scan = new Scanner (System.in);
System.out.println("Enter the string:");

String str = scan.nextLine();
String rev = "";
int StrLength = str.length();
for ( int i = StrLength-1; i<0; i--){
rev = rev + str.charAt(i);
}
if(str.toLowerCase().equals(rev.toLowerCase()))
System.out.println(str+" is a palindrome.");
else
System.out.println(str+" is not a palindrome.");

}
}

