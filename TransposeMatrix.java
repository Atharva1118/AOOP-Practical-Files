public class TransposeMatrix{
public static void main(String[] args)
{
int a[][]={{1,2},{3,4}};

int t[][]=new int[2][2];

System.out.println("Original Matrix");
for(int i=0;i<2;i++)
{

for(int j=0;j<2;j++)
{
System.out.print(a[i][j]+"  ");
}
System.out.println();
}
for(int i=0;i<2;i++)
{
for (int j=0;j<2;j++)
{
t[j][i]=a[i][j];
}
}

System.out.println("Transpose Matrix");
for(int i=0;i<2;i++)
{

for(int j=0;j<2;j++)
{
System.out.print(t[i][j]+"  ");
}
System.out.println();
}
}
}