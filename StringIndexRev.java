class StringIndexRev{
public static void main(String [] args){
String name = "ABC";
char [] arr1 = name .toCharArray();
char [] rev = new char [arr1.length];
int i = arr1.length -1;
int j = 0;
for(; i>-1; i--){
rev [j] = arr1[i];
j++;

}
System.out.println(rev);
}
}