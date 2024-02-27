class String_Char_Rev_String{
public static void main (String [] args){
String name = "Mani";
char [] arr = name.toCharArray();
for(int i=0; i<arr.length; i++){
System.out.println(arr[i]);
}

char [] rev = new char [arr.length];
int i = arr.length-1;
int j = 0;
for (; i>-1; i--){
rev [j] = arr[i];
j++;
}
System.out.println(rev);


char [] rev1 = new char [rev.length];
int a = rev.length-1;
int b = 0;
for (; a>-1;a--){
rev1[b] = rev[a];
b++;
}
System.out.println(rev1);
}
}