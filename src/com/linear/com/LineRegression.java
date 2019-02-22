package com.linear.com;

public class LineRegression {
	
	double x[];
	double y[];
	int n;
	
	public void setX(double arr[])
	{
		this.x=arr;
	}
	
	public void setY(double arr[])
	{
		this.y=arr;
	}
	
	public void setN(int n)
	{
		this.n=n;
	}
	
	double E, F, G, H, I, J, K,r;
	
	public double sumX() {
		double sumX=0;
		for(int i=0;i<x.length;i++)
		{
			sumX=sumX + x[i];
		}
		return sumX;
	}
	
	public double sumY() {
		double sumY=0;
		for(int i=0;i<y.length;i++)
		{
			sumY=sumY + y[i];
		}
		return sumY;
	}
	
	public double sumXY(){
		double sumXY=0;
		for(int i=0;i<x.length;i++)
		{
			for(int j=i; j==i && j<y.length;j++)
			{
				sumXY=sumXY+(x[i] * y[j]);
			}
		}
		
		return sumXY;
	}
	
	
	public double sumSqX() {
		double sumSqx=0;
		
		for(int i=0;i<x.length;i++)
		{
			sumSqx=sumSqx+(x[i] * x[i]);
		}
		
		return sumSqx;
	}
	
	
	public double sumSqY() {
		double sumSqY=0;
		
		for(int i=0;i<y.length;i++)
		{
			sumSqY=sumSqY+(y[i] * y[i]);
		}
		
		return sumSqY;
	}

	
	
	public double getR()
	{
		double r=0;
		r=Math.sqrt(
				((getE()-(getF()*getG())/n) * (getE()-(getF()*getG())/n))/((getH()-getI()/n)*(getJ()-getK()/n))
				
			);	
		return r;
	}
	public double getE() {
		return sumXY();
	}


	public double getF() {
		return sumX();
	}


	public double getG() {
		return sumY();
	}


	public double getH() {
		return sumSqX();
	}

	public double getI() {
		return Math.pow(sumX(), 2);
	}


	public double getJ() {
		return sumSqY();
	}


	public double getK() {
		return Math.pow(sumY(), 2);
	}
	
	

}