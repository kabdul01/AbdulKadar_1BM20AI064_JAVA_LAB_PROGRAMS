import square.*;
import cube.*;
import java.lang.Math;

abstract class rand
{
static int number;
rand()
{
number=(int)Math.random();
}
}

class imports extends rand
{
static int i=0;
public static void main(String args[])
{
for(i=0;i<10;i++)
{
square s=new square(number);
s.sq();
cube c=new cube(number);
c.cu();
}
}
}
