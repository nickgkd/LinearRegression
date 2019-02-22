package com.linear.com;

public class ExpoRegression {
	
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
	
	public double getE() {
		double res = 0;
		for(int i=0;i<x.length;i++)
		{
			for(int j=i; j==i && j<y.length;j++)
			{
				res=res+(x[i]*(Math.log(y[j])));
			}
		}
		
		return res;
	}
	
	public double getF() {
		double sumX=0;
		for(int i=0;i<x.length;i++)
		{
			sumX=sumX+x[i];
		}
		return sumX;
	}
	
	public double getG() {
		double res=0;
		for(int i=0;i<y.length;i++)
		{
			res=res+(Math.log(y[i]));
		}
		return res;
	}
	
	public double getH() {
		double sumSqX = 0;
		for(int i=0;i<x.length;i++)
		{
		sumSqX=sumSqX+(x[i]*x[i]);
		}
		return sumSqX;
	}
	
	public double getI() {
		return Math.pow(getF(),2);
	}
	
	public double getJ() {
		double res=0;
		for(int i=0;i<y.length;i++)
		{
			res=res+((Math.log(y[i]))*(Math.log(y[i])));
		}
		return res;
	}
	
	public double getK() {
		return Math.pow(getG(), 2);
	}
	
	
	public double getR()
	{
		double r=0;
		r=Math.sqrt(
				((getE()-(getF()*getG())/n) * (getE()-(getF()*getG())/n))/((getH()-getI()/n)*(getJ()-getK()/n))
				
			);
		return r;
	}

}
