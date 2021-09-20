package lab3;


public class Zoning {
	private double legnth;
	private double width;
	public double calclotarea;
	public  double heightLimit;
	public  int unitCountLimit;
	static final double Lotarea[]= {2000,2500,3500,5000};
	static final double [] areapercentage= {200,100,50,25};
	
    
    //non-default constructor

  public Zoning() {
	  System.out.println("default legnth"+legnth +"default width"+width);
	  }

  public Zoning(double legnth, double width) {
	  this.legnth=legnth;
	  this.width=width;
	  calclotarea=legnth*width;
	  
  }
  
  
  public void setLegnth(double legnth) {
	  if(legnth>0) {
	  this.legnth=legnth;
	     }
	  else {
		  this.legnth=0;
  }
  }
  
  
  public  double getLegnth() {
	  return this.legnth;
  }
  
  public  double getWidth() {
	  return this.width;
  }
  public void setWidth(double width) {
	  if(width>0) {
		  this.width=width;
		     }
		  else {
			  this.width=0;
	  }
	   }
  
  
  // calculate lot area
  
  public double calculate() {
	  calclotarea=width*legnth;
	  return calclotarea;
  }
  
 
 public double heightLimit() {
	 if(calclotarea<Lotarea[0]) {
		 heightLimit=25;
	 }
	 else if(calclotarea<=Lotarea[1]) {
		 heightLimit=25+(areapercentage[0]/(calclotarea-2000));
	 }
	 else if(calclotarea<=Lotarea[2]) {
		 heightLimit=35+(areapercentage[1]/(calclotarea-2500));
	 }
	 else if(calclotarea<=Lotarea[3]) {
		 heightLimit=45+(areapercentage[2]/(calclotarea-3500));
	 }
	 else {
		 heightLimit=45+(areapercentage[3]/(calclotarea-5000));
		 
	 }
	
		  return heightLimit;
	 
 }
  
 public int unitCountLimit() {
	 if(calclotarea<=Lotarea[0]) {
		 unitCountLimit=1;
	 }
	 
	 else if(calclotarea<=Lotarea[1]) {
		 unitCountLimit=2;
		 
	 }
	 else if(calclotarea<=Lotarea[2]) {
		 unitCountLimit=3;
		 
	 }
	 
	 else if(calclotarea<=Lotarea[3]) {
		 unitCountLimit=4;
	 }
	 
	 else  {
		 unitCountLimit=5;
	 }
	 
	return unitCountLimit;
	 
 }
 
 public String toString() {
	return "Lot area is "+this.calclotarea+" the height limit is"+this.heightLimit+"Unit count limit is"+this.unitCountLimit;
 }
  
}
