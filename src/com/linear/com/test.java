package com.linear.com;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		double x1,x2,x3,x4,y1,y2,y3,y4;
		double a, b, E, F, G, H, I, J, K,r;
		System.out.println("Enter the value of x1:");
		Scanner sc=new Scanner(System.in);
		x1=sc.nextDouble();
		System.out.println("Enter the value of y1:");
		y1=sc.nextDouble();
		System.out.println("Enter the value of x2:");
		x2=sc.nextDouble();
		System.out.println("Enter the value of y2:");
		y2=sc.nextDouble();
		System.out.println("Enter the value of x3:");
		x3=sc.nextDouble();
		System.out.println("Enter the value of y3:");
		y3=sc.nextDouble();
		System.out.println("Enter the value of x4:");
		x4=sc.nextDouble();
		System.out.println("Enter the value of y4:");
		y4=sc.nextDouble();
		
		double sumX=x1+x2+x3+x4;
		double sumY=y1+y2+y3+y4;
		double sumXY=((x1*y1)+(x2*y2)+(x3*y3)+(x4*y4));
		double sumSqX=((x1*x1)+(x2*x2)+(x3*x3)+(x4*x4));
		double sumSqY=((y1*y1)+(y2*y2)+(y3*y3)+(y4*y4));
		
		r=(4 * sumXY - sumX * sumY)/ 
                (Math.sqrt((4 * sumSqX - 
                sumX * sumX) * (4 * sumSqY -  
                sumY * sumY))); 
		System.out.println("The value of r:"+r);
		
		
		E=(x1*y1)+(x2*y2)+(x3*y3)+(x4*y4);
		F=sumX;
		G=sumY;
		H=sumSqX;
		I=Math.pow(sumX, 2);
		
		
		J=(y1*y1)+(y2*y2)+(y3*y3)+(y4*y4);
		K=Math.pow(G, 2);
		
		r=Math.sqrt(
				(((E-((F*G)/4)))*(E-((F*G)/4)))
				/
				(
						((H-I)/4)*((J-K)/4))
				);
		
		
		r=Math.sqrt(
				((E-(F*G)/4) * (E-(F*G)/4))/((H-I/4)*(J-K/4))
				);
		System.out.println("The value of r1:"+r);
		System.out.println("F:sum of x="+F);
		System.out.println("E:sum of x*y="+E);
		System.out.println("G:sum of y="+G);
		System.out.println("H:sum of x*x="+H);
		System.out.println("I:sum of F*F="+I);
		System.out.println("J:sum of y*y="+J);
		System.out.println("K:sum of G*G="+K);
		
	}

}
