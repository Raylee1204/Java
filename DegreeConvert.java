package homework;

public class DegreeConvert_407170288 {

	public static void main(String[] args) {
		float degree =(int) (Math.random()*100+1);
	    int index =(int)(Math.random()*2+1);
	    System.out.println("index = " + index);
	    System.out.println("degree = " + degree);
	    
	    if (index ==2)
	    {
	    	degree = (degree-32)*5/9;
	    	System.out.println("C>>F = " + degree);
	    }
	    if(index ==1)
	    {
	    	degree = (degree*9/5+32);
	    	System.out.println("F>>C = " + degree);
	    }
	    

	}

}
