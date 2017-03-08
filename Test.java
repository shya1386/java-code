package price;
import java.util.*;
import java.lang.*;
import java.io.*;
 public class Test 
 {	
 static double W_Flatbase,W_numperson,W_value,O_price;
  static double flat_rate=0.05;
  static double person_rate=0.012;
  static double food_rate=0.13;
  static double drug_rate=0.075;
  static double elec_rate=0.02;
  static double I_base1=1299.99;
  static double I_base2=5432.00;
  static double I_base3=12456.95;
  static int I_numperson1=3;
  static int I_numperson2=1;
  static int I_numperson3=4;
  static String I_category1="food";
  static String I_category2="drugs";
  static String I_category3="books";
 
	 public static void main(String []args)
	 {
		Test ob=new Test();
        System.out.println("Input1:"+I_base1);
        System.out.println("Output1:"+ob.calculateprice(I_base1,I_numperson1,I_category1));
        System.out.println();
        System.out.println("Input2:"+I_base2);
		System.out.println("Output2:"+ob.calculateprice(I_base2,I_numperson2,I_category2));
        System.out.println();
        System.out.println("Input3:"+I_base3);
		System.out.println("Output3:"+ob.calculateprice(I_base3,I_numperson3,I_category3));
 
     }
 
  	 public static double calculateprice(double base,int numperson,String category)
	  	 {
      		 	//W_value=0.00;
       			W_Flatbase=base +(flat_rate*base);
		 		W_numperson=person_rate*numperson*W_Flatbase;
		 		if(category==("food")){
		 		W_value  = food_rate * W_Flatbase;
		 		O_price=W_Flatbase+W_numperson+W_value;
                }else if(category==("drugs")){
                	W_value=drug_rate*W_Flatbase;
                	O_price=W_Flatbase+W_numperson+W_value;
                }else {                     
                	O_price = W_Flatbase+ W_numperson ;
       }
	  String str = String.format("%1.2f", O_price);
       O_price= Double.valueOf(str);
       return O_price;
 
     }
 }

  

		 
	 
		 
		 
		 
		 
		 
		 
	  
		 
		 
	 
	   
