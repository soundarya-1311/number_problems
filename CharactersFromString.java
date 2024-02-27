import java.util.*;

class CharactersFromString{

public static void main(String [] args){

Scanner scan = new Scanner (System.in);

String string = scan.nextLine();

for( int i =0; i <string.length(); i++){
System.out.println(string.charAt(i));
}
}

}