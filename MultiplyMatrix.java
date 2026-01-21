public class MultiplyMatrix{
public static void main(String[] args)
{
int a[][]={{1,2},{3,4}};
int b[][]={{4,3},{2,1}};
int mul[][]=new int[2][2];
for(int i=0;i<2;i++)
{
for (int j=0;j<2;j++)
{
mul[i][j]=0;
for(int k=0;k<2;k++)
{
mul[i][j]+=a[i][k]*b[k][j];
}
}
}
for(int i=0;i<2;i++)
{

for(int j=0;j<2;j++)
{
System.out.print(mul[i][j]+"  ");
}
System.out.println();
}
}
}