package com.linear.com;

public class Driver {

	public static void main(String[] args) {
		
		
		//Linear Rewgression
		double []arrX= {1,2,3,4};
		double []arrY= {2,3,4,5};
		int n1=4;
		
		
		
		//Power Regression 
		double []arrX1= {1,2,3,4,5,6};
		double []arrY1= {1.9,2.9,3.9,4.5,5.5,5.5};
		int n2=6;
		
		
		
		//Exponential Regression 
		double []arrX2= {1,2,3,4,5,6,7,8,9,10};
		double []arrY2= {1.5,2.5,2.8,3,3.5,4.2,8,9.5,11.23,15.2};
		int n3=10;
		
		
		//Logarithmic Regression
		double []arrX3= {1,2,3,4,5,6,7,8,9,10,11};
		double []arrY3= {1.83,2.90,3.96,4.57,5.03,5.33,5.64,5.79,5.94,6.00,6.04};
		int n4=11;
		
		
		
		LineRegression u= new LineRegression();
		u.setX(arrX);
		u.setY(arrY);
		u.setN(n1);
		double result1=u.getR();
		System.out.println("Linear Regression R:="+result1);
			
		
		LogRegression log=new LogRegression();
		log.setX(arrX);
		log.setY(arrY);
		log.setN(n1);
		double result2=log.getR();
		System.out.println("Logarithmic Regression R:="+result2);
		
		
		
		ExpoRegression expo=new ExpoRegression();
		expo.setX(arrX);
		expo.setY(arrY);
		expo.setN(n1);
		double result3=expo.getR();
		System.out.println("Exponential Regression R:="+result3);
	
		
		
		PowRegression pow=new PowRegression();
		pow.setX(arrX);
		pow.setY(arrY);
		pow.setN(n1);
		double result4=pow.getR();
		System.out.println("Power Regression R:="+result4);
		
		System.out.println("-----------------------------------------------------------");
		
		
		
		if(result1 > result2 && result1 > result3 && result1 > result4)
		{
			System.out.println("Linear Regression is Best Fit, since R is:"+u.getR());
		}
		
		else if(result2 > result1 && result2 > result3 && result2 > result4)
		{
			System.out.println("Logarithmic Regression is Best Fit, since R is:"+log.getR());
		}
		
		else if(result3 > result1 && result3 > result2 && result3 > result4)
		{
			System.out.println("Exponential Regression is Best Fit, since R is:"+expo.getR());
		}
		
		else
		{
			System.out.println("Power Regression is Best Fit, since R is:"+pow.getR());
		}
		/* System.out.println("F:sum of x="+u.getF());
		System.out.println("E:sum of x*y="+u.getE());
		System.out.println("G:sum of y="+u.getG());
		System.out.println("H:sum of x*x="+u.getH());
		System.out.println("I:sum of F*F="+u.getI());
		System.out.println("J:sum of y*y="+u.getJ());
		System.out.println("K:sum of G*G="+u.getK());*/
	}

}
