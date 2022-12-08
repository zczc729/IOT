package Home;

public class AirConditional {
	boolean h_acStatus = false;
	double h_actmp = 24.0;
	boolean airclean = false;
	int windpower = 1;
	String acmode;
	public boolean isH_acStatus() {
		return h_acStatus;
	}
	public void setH_acStatus(boolean h_acStatus) {
		if(h_acStatus) {
			System.out.println("Your A/C is on");
		} else {
			System.out.println("Your A/C is off");
		}
		this.h_acStatus = h_acStatus;
	}
	public double getH_actmp() {
		return h_actmp;
	}
	public void setH_actmp(double h_actmp) {
		if(18.0 < h_actmp && h_actmp < 28.0) {
			System.out.println("Your A/C temerature set in " + h_actmp + "' C");
			this.h_actmp = h_actmp;
		} else {
			System.out.println("Try to set temperature in 18.0` C ~ 28.0` C");
		}
	}
	public boolean isAirclean() {
		return airclean;
	}
	public void setAirclean(boolean airclean) {
		this.airclean = airclean;
	}
	public int getWindpower() {
		return windpower;
	}
	public void setWindpower(int windpower) {
		System.out.println("Wind Power has been set in " + windpower + " level");
		this.windpower = windpower;
	}
	public String getAcmode() {
		return acmode;
	}
	public void setAcmode(String acmode) {
		this.acmode = acmode;
	}
	
	

}
