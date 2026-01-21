public class Prime{
public static void main(String[] args)
{
int num=5;
if(num<=1)
{
System.out.println(num + " is not a prime number");
}
for(int i=2;i<=num/2;++i)
{
if(num%i==0)
{
System.out.println(num + " is not a prime number");
break;
}
else
{
System.out.println(num + " is a prime number");
break;
}
}
}
} 