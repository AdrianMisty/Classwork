/**
 * ConditionalMethods.java  12/07/12
 *
 * @author - Jane Doe
 * @author - Period n
 * @author - Id nnnnnnn
 *
 * @author - I received help from ...
 *
 */
import java.util.Scanner;

public class ConditionalMethods
{
    //Given two integers, divide the largest number by the smallest.
    //DO NOT ASSUME THAT THE NUMBERS ARE ENTERED IN ANY ORDER!!!!
    //If there is no remainder, output the answer in the following format:
    //       8 / 4 = 2
    //If there is a remainder, output the answer in the following format:
    //       7 / 2 = 3 R 1
    public static void divide(int n1, int n2)
    {
        int answer;
        int remainder; 
        int large,small;
        
        if(n1<n2)
        {
          large=n2;
          small=n1;
           }
        else
        {
          large=n1;
          small=n2;
        }
        answer= large/small;
        remainder=large%small;
        if(remainder!=0)
        
                 System.out.println(large+" / "+small+ " = "+answer+" R " +remainder);
         else 
                 System.out.println(large+"/"+small+"=" +answer );  
    }
    //returns the largest of  n1, n2, and n3
    public static int findLarge(int n1, int n2, int n3)
    {
        int large;
        if(n1 > n2 && n1 > n3)
                 large=n1;//return n1;
        else if (n2 >= n1 && n2 >= n3)
                 large =n2;
        else 
                 large=n3;
        return large;
    }
    //returns the smallest of n1, n2, and n3
    public static int findSmall(int n1, int n2, int n3)
    {
        int small;
        if(n1 < n2 && n1 < n3)
                small = n1;
        else if (n2 <= n1 && n2 <= n3)
                 small=n2;
        else
                small=n3;   
        return small ;
        }
    public static void main(String[] args)
    {
       //Test the divide, findLarge, findSmall, and babbageTaxes methods here     
         divide(2,23);
         divide(22,2);
         divide(25,2);
       System.out.println(findLarge(54,4,95));
       System.out.println(findLarge(100,100,100));
       System.out.println(findLarge(2,3,2));
        //find large
       System.out.println(findLarge(14, 9, 56));
        //* put static to method if you want to use inother methods that have static
       System.out.println(findSmall(144, 95, 52));
    }
    //Given the income of a citizen of Babbage, returns the amount of taxes owed    
    public static double babbageTaxes(double income)
    {
        double tax;
        if (income<=5000 && income >= 0)
              
             tax = income * 0;
             
        else if (income >= 5001 && income <= 10000 )  
             
             tax =(int)(Math.round(income* .03));
        else if (income >= 10001 && income <= 20000  )
             
             tax = (int)(Math.round(income * .055));
        else if( income >= 20001 && income <= 40000 )
             
             tax= (int)(Math.round(income*.108)) ; 
        else  
              tax = (int)(Math.round(income* .237));
        return tax ;
    }
    
 }