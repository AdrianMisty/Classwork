/**
 * Triangle.java  12/05/12
 *
 * @author - Jane Doe
 * @author - Period n
 * @author - Id nnnnnnn
 *
 * @author - I received help from ...myself
 *
 */
public class Triangle
{
    private int side1, side2, side3;
    public Triangle(int s1, int s2, int s3)
    {
        side1 = s1;
        side2 = s2;
        side3 = s3;
      
    } 
    
    public void setSides(int s1, int s2, int s3)
    {
        side1 = s1;
        side2 = s2;
        side3 = s3;  
    }
    //returns true if this triangle is a triangle
    public boolean isTriangle()
    {
        return true;
    }
    //returns true if isTriangle == true and all sides of triangle have different lengths
    //otherwise, returns false      
    public boolean isScalene()
    {
        if ((side1 != side2 && side2!= side3)&&(side1!=side3))
           return true;
        else
            return false;
    }    
    //returns true if isTriangle == true and at least 2 sides of triangle have equal lengths
    //otherwise, returns false         
    public boolean isIsosceles()
    {
        if (((side1 ==side2)||(side1==side3)||(side2==side3)))
            return true;
        else
            return false;
    }
    //returns true if isTriangle == true and at all 3 sides of triangle have equal lengths
    //otherwise, returns false       
    public boolean isEquilateral()
    {
        if(side1 == side2 && side2==3 && side1 == side3)
           return true;
        else
            return false;
    }
    //returns true if isTriangle == true and a * a + b * b = c * c 
    //otherwise, returns false
    public boolean isRight()
    {
       if(side1*side1 +side2*side2 == side3*side3)
        return true;
       else
        return false;
    }    
    //returns true if isTriangle == true and a * a + b * b > c * c 
    //otherwise, returns false     
    public boolean isAcute()
    {
         if(side1*side2 + side2*side2 > side3*side3)
             return true;
         else
            return false;
    }
    //returns true if isTriangle == true and a * a + b * b < c * c 
    //otherwise, returns false       
    public boolean isObtuse()
    {
        if(side1*side1 + side2*side2 < side3*side3)
            return true;
        else
            return false;
    }
    //return a String that represents this Triangle object
    public String toString()
    {
        return "Side 1 = " +side1 + " Side 2 = " + side2 + " Side 3 = " + side3;
    }
}