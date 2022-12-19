package GCD;
public class GCD{
int a,b,i,gcd;
public GCD(int x, int y)
{
this.a=x;
this.b=y;
}
public void calculate()
{
for(i=1;(i<a)&&(i<b);i++)
if(a%i==0 && b%i==0)
{
gcd=i;
}
System.out.println("GCD is "+gcd);
}
}
