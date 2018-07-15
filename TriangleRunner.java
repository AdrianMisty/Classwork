/**
 * TriangleRunner.java 
 * Name : AdrianMisty
 * Date : 12/05/12
 */

import java.util.Scanner;

public class TriangleRunner
{
	public static void main(String[] args)
	{
	    Scanner input = new Scanner(System.in); 
	        Triangle t1 = new Triangle(30 ,30 ,30);
	    
	        System.out.println(t1);
	        //add more Triangles to test all methods
		System.out.println("Is it a Triangle ? " + t1.isTriangle());
		System.out.println("Is it a Right Triangle ? " + t1.isRight());
		System.out.println("Is it a Obtuse Triangle ? " + t1.isObtuse());
		System.out.println("Is it a Equilateral Triangle ? " + t1.isEquilateral());
		System.out.println("Is it a Acute Triangle ? " + t1.isAcute());
		System.out.println("Is it a Isosceles Triangle ? " + t1.isIsosceles());
        
	}
}
