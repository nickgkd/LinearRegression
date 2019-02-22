package com.linear.com;

public class LogRegression {
	
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
		double xlog=0;
		for(int i=0;i<x.length;i++)
		{
			for(int j=i; j==i && j<y.length;j++)
			{
				res=res+(y[j]*(Math.log(x[i])));
			}
			
		}
		return res;
	}

	
	public double getF() {
		double sumLogX=0;
		for(int i=0;i<x.length;i++)
		{
			sumLogX=sumLogX+(Math.log(x[i]));
		}
		return sumLogX;
	}


	public double getG() {
		double sumY=0;
		for(int i=0;i<y.length;i++)
		{
			sumY=sumY+y[i];
		}
		return sumY;
	}


	public double getH() {
		double sumLogX=0;
		for(int i=0;i<x.length;i++)
		{
			sumLogX=sumLogX+((Math.log(x[i]))*(Math.log(x[i])));
		}
		return sumLogX;
	}

	public double getI() {
		return Math.pow(getF(),2);
		
	}


	public double getJ() {
		double sum=0;
		for(int i=0;i<y.length;i++)
		{
			sum=sum+(y[i]*y[i]);
		}
		return sum;
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
