public class Ascending{
public static void main()
{
int arr[]={12,15,1,7,3,22,11,17,9,10};
for(int i=0;i<9;i++)
{
for(int j=0;j<9-i;j++)
{
if(arr[j]>arr[j+1])
{
int temp=arr[j];
arr[j]=arr[j+1];
arr[j+1]=temp;
}
}
}
for(int i=0;i<10;i++)
{
System.out.print(arr[i]+ "  ");
}
}
}