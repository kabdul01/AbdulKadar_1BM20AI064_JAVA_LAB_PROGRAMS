package LCM;
public class LCM
{
int a,b,lcm,max;
boolean flag=true;
public LCM(int n1, int n2)
{
this.a=n1;
this.b=n2;
}
public void calculate()
{
if(a>b)
max=a;
else
max=b;
while (flag) 
{  
 if (max%a == 0 && max%b == 0)  
        {  
            System.out.println("LCM is "+max);  
            break;  
        }  
        ++max;  
}  
}
}