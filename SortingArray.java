class SortingArray{
public static void main (String [] args){
int[] a = new int [] {1, 45,7,58,1,7,89,45,45,91};
int t;
for(int i=0; i<a.length; i++){
for(int j = i+1; j<a.length; j++){
if(a[i] > a[j])
{
t=a[i];
a[i] = a[j];
a[j] = t;
}
}
}
for(int i =0; i<a.length; i++)
System.out.println(a[i]);

}
}
