public class SubstractMatrx{
public static void main(String[] args)
{
int a[][]={{1,2},{3,4}};
int b[][]={{4,3},{2,1}};
int sub[][]=new int[2][2];
for(int i=0;i<2;i++)
{
for (int j=0;j<2;j++)
{
sub[i][j]=a[i][j]-b[i][j];
}
}
for(int i=0;i<2;i++)
{

for(int j=0;j<2;j++)
{
System.out.print(sub[i][j]+"  ");
}
System.out.println();
}
}
}