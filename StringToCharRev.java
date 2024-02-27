class StringToCharRev{
public static void main (String [] args){
String name = "Sound";
char [] arr1 = name.toCharArray();
for(int i=0; i<arr1.length; i++){
System.out.println(arr1[i]);
}

char [] rev = new char [arr1.length];
int i = arr1.length-1;
int j = 0;
for(; i>-1; i--){
rev[j] = arr1[i];
j++;
}
System.out.println(rev);
}
}