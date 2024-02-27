import java.util.*;

class VowlesInString{
public static void main (String args[]){
Scanner scan = new Scanner (System.in);

System.out.println("Enter the String:");

String str = scan.nextLine();
str = str.toLowerCase();
int count = 0;
for (int i=0; i<str.length();i++){
if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
count++;
}

}
System.out.println("Number of vowels in string: "+ count);
}
}
