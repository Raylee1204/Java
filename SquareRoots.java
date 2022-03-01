package homework;

public class SquareRoots_407170288 {
	
	public static void main(String[] args) {	
		int a =(int)(Math.random()*999+1) ;
		int b =(int)(Math.random()*999+1);
		int c =(int)(Math.random()*999+1) ;
				
		if((b^2-4*a*c)>=0) 
		{	
			System.out.println("have Real number solution");
		  }
		else {
			System.out.println("no Real number solution");
		}
		    System.out.println("x=" + (-b+Math.sqrt(b*b-4*a*c))/2*a);
			System.out.println("Y=" + (-b-Math.sqrt(b*b-4*a*c))/2*a);
		    System.out.println("Finish");
		
		}
		}


