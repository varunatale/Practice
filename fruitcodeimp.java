package Java_collection_assignment_1;

import java.util.Scanner;

interface weight
{
	 void wt();
}
interface color
{
	void col();
	


}
abstract class fruit 
{
	String colour;
	int price;
	
 	abstract void taste();
 	
	void display() 
	{
		System.out.println("fruit class");
	}
	
}



class apple extends fruit implements color,weight 
{
	void taste() 
    {
       System.out.println("Apple is sweet in test");
    }
	public void col()
	{
		System.out.println("Color of apple is Red");
	}
	public void wt()
	{
		System.out.println("Weight is  10gm");
	}
	
}
class orange extends fruit implements color,weight
{
   void taste()
    {
       System.out.println("orange is very sweet in taste");
    }
   public void col()
	{
		System.out.println("Color is Orange");
	}
   public void wt()
	{
		System.out.println("Weight is  40gm");
	}
}

class banana extends fruit implements color,weight
{
	void taste() 
           {
      		System.out.println("banana is good in taste");
	   }
	public void col()
	{
		System.out.println("Color is Yellowe");
	}
	public void wt()
	{
		System.out.println("Weight is  20gm");
	}
}


public class Fruitrecord   {

	public static void main(String[] args) 
{
		
		
		fruit a= new apple();    // make abstractb class object
		a.taste();
		color b= new apple();    // make interface class object
		b.col();
		weight c=new apple();    // make interface class object
		c.wt();
		a= new orange();
		b=new orange();
		b.col();
		a.taste();		
		c.wt();
		a= new banana ();
		b=new banana();
		c=new banana();
		a.taste();
        b.col();
        c.wt();
		
		
		
		
		
		/*
		fruit a= new apple();
		color b= new apple();
		weight c=new apple();
		
		
	
		a= new orange();
		b=new orange();
		c=new orange();
		a= new banana ();
		b=new banana();
		c=new banana();
		a.taste();
		b.col();
		c.wt();
		b.col();
		a.taste();		
		c.wt();
		a.taste();
        b.col();
        c.wt();  */
}

}

