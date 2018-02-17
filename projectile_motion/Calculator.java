package projectile_motion;
import java.util.Vector;
import java.lang.Math.*;

public class Calculator {
	
	double vix,viy,vfy,vfx,t,xf,theta,vi,vf,yi,yf;
	final double ay = -9.81;
	final double xi = 0;
	final double ax = 0;
	
	public Calculator(double theta, double vi, double yi, double yf) {
		this.theta = theta; this.vi = vi; this.yi = yi;
		this.yi = yi; 
		this.yf = yf;
		
		this.vix = vi * Math.cos(Math.toRadians(theta));
		this.viy = vi * Math.sin(Math.toRadians(theta));

		if(yi == yf) {
			this.vfy = -viy;
			t = (vfy-viy)/ay;
			this.xf = vix * t;
		}
	}
	
	

	public double getVix() {
		return vix;
	}

	public void setVix(double vix) {
		this.vix = vix;
	}

	public double getViy() {
		return viy;
	}

	public void setViy(double viy) {
		this.viy = viy;
	}

	public double getAx() {
		return ax;
	}

	

	public double getAy() {
		return ay;
	}


	public double getVfx() {
		return vfx;
	}

	public void setVfx(double vfx) {
		this.vfx = vfx;
	}

	public double getVfy() {
		return vfy;
	}

	public void setVfy(double vfy) {
		this.vfy = vfy;
	}

	public double getT() {
		return t;
	}

	public void setT(double t) {
		this.t = t;
	}

	public double getXf() {
		return xf;
	}

	public void setXf(double xf) {
		this.xf = xf;
	}

	public double getXi() {
		return xi;
	}

	

}
