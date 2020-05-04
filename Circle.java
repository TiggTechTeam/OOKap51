/*************************************************** 
Class Circle: simple class for representing circles;
  implements Measurable, Comparable for demos

UV Objektorientierte Programmierung / H.Hagenauer
***************************************************/

public class Circle	implements Measurable, Comparable<Circle> {

	private	double radius;
	
	//----------constructors
	public Circle	(double	radius){
		this.radius	=	radius;
	}
	
	//----------methods
	
	//Interface Measurable
	public double getMeasure (){
		return getArea();
	}
	
	//Interface Comparable - copares area
	public int compareTo (Circle other) {
    if (this.getArea() < other.getArea())
      return -1;
    if (this.getArea() > other.getArea())
      return 1;
    return 0;
	}

	public void	display(){
		System.out.print("Circle - Radius " + radius);
	}
	
	public double getArea (){
		return radius * radius * Math.PI;
	}
  
  public String toString () {
    return "Circle - Radius: " + radius;
  }
  
  public boolean equals (Object other) {
    if(other instanceof Circle){
      Circle c = (Circle)other;
      return (this.radius == c.radius);
    }
    else
      return false;
  }
}
