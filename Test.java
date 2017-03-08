package price;
import java.lang.*;
import java.io.*;
public class Test 
{	
 static double nbase,nop,value,price;
	 public static void main(String []args)
	 {
		Test ob=new Test();
        System.out.println(ob.calc1(1299.99,3,"food"));
		 System.out.println(ob.calc2(5432.00,1,"drugs"));
		 System.out.println(ob.calc3(12456.95,4,"books"));
	 }
 	 public static double calc1(double b,int n,String c)
	  	 {
     		 nbase=b+(0.05*b);
		 nop=0.012*n*nbase;
		 if(c==("food"))
				 {
		 value=0.13*nbase;
		 }
		 price=nbase+nop+value;
      return price;
	 }
	 public static double calc2(double b1,int n1,String c1)
	 {
		 nbase=b1+(0.05*b1);
		 nop=0.012*n1*nbase;
		 if(c1==("drugs"))
		 {
			 value=0.075*nbase;
		 }
		 price=nbase+nop+value;
      return price;
		 
	 }
	 public static double calc3(double b2,int n2,String c2)
	 {
		 nbase=b2+(0.05*b2);
		 nop=0.012*n2*nbase;
		 if(c2==("books"))
		 {
			
		 price=nbase+nop;
        }
		 return price;
	 }
}


  

		 
	 
		 
		 
		 
		 
		 
		 
	  
		 
		 
	 
	   
