
/**
 * Write a description of class birthDateCreator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class birthDateCreator
{
    public static void main(String[]args)
    {
       Scanner input = new Scanner(System.in);
       int Day ;
       int Month;
       int Year, year;
       final int SUNDAY = 1;
       final int SATURDAY = 0;
       final int MONDAY = 2;
       final int TUESDAY = 3;
       final int WEDNESDAY = 4;
       final int THURSDAY = 5;
       final int FRIDAY = 6;
     
       int CurrentNumber;
      
       System.out.print("Enter your birth month ==>(1-12) ");
        Month = input.nextInt(); 
       System.out.print("Enter your day of birth ==> ");
        Day = input.nextInt();
       System.out.print("Enter your birth year( all 4 digits please ) ==> ");
        Year = input.nextInt();
        
       
       year = Year/100;
       CurrentNumber =(int)( Math.floor(year /4));
       if ( Month == 1)
          Month = January  ;
       else if (Month == 2 )
          Month = Feburary;
       else if (Month == 3 )
         Month = March;
       else if (Month == 4 ) 
          Month = April;
       else if (Month == 5 ) 
          Month = May;
       else if (Month == 6 )
          Month = June;
       else if(Month == 7)
          Month = July;
       else if (Month == 8) 
          Month = August;
       else if (Month == 9)
          Month = September;
       else if (Month == 10)
          Month = October;
       else if (Month == 11)
          Month = November;
       else if (Month ==12)
         Month = December; 
       
       if (1700 <= year || year <= 1799 )
           year = year + 4;
       else if(1800 <= year || year <= 1899)
           year = year + 2;
       else if (1900 <= year|| year <=1999)
           year = year + 0;
       else if (2000 <= year || year <=2099)    
           year = year + 6; 
       else if(2100 <= year || year <= 2199) 
            year = year + 4;
       else if(2200 <= year || year <= 2299)   
             year = year  + 2;
       else if (2300 <= year || year <= 2399)
             year = year + 0;
       else if(2400 <= year || year <=2499)
            year = year +6;
       else if (2500 <= year || year <= 2599)
          year = year +4;
        
    

    
     
    
    }
   
    
}
