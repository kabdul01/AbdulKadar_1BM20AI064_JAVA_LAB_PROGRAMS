package Emp
public class Emp
{
  String name;
  int empid;
  String category;
  float bpay;
  float hra;
  float da;
  float npay;
  float pf;
  float grosspay;
  float incometax;
  float allowance;
  
  public Emp(String name,int empid, float bpay, float hra)
  {
    this.name=name;
    this.empid=empid;
    this.bpay=bpay;
    this.hra=hra;
  } 
  
  public void calculations(float bpay, float hra, float da)
  {
     da = bpay*0.05;
     hra = bpay*0.09;
     pf = bpay*0.11;
     allowance = bpay*0.10;
     grosspay = bpay+da+hra+allowance-pf;
     incometax = 0.75*grosspay;
     npay = grosspay- incometax;
  )
    
    public void display()
 {
   System.out.println("/n/n Employee Details");
   System.out.println("/n/n Name:"+name);
   System.out.println("/n/n Empid:"+empid);  
   System.out.println("/n/n Category:"+category);      
   System.out.println("/n/n bpay:"+bpay);
   System.out.println("/n/n da:"+da);
   System.out.println("/n/n hra:"+hra);
   System.out.println("/n/n pf:"+pf);
   System.out.println("/n/n all:"+allowance);
   System.out.println("/n/n gs:"+grosspay);
   System.out.println("/n/n Incometax:"+incometax);
   System.out.println("/n/n npay:"+npay);
 }
}    
