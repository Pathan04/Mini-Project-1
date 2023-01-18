import java.util.*;
import java.io.*;
class electricityBillGeneration  
{   
      
    public static void main(String args[])   
    {   
        try{
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Door Number : ");
        String doorNumber = s.nextLine();
        System.out.print("Enter Units : ");
        int units = s.nextInt();  
          
        double billToPay = 0;  
        
        if(units < 100)  
        {  
            billToPay = units * 1.20;  
        }  
          
        else if(units < 300){  
            billToPay = 100 * 1.20 + (units - 100) * 2;  
        }  
        
        else if(units > 300)  
        {  
            billToPay = 100 * 1.20 + 200 * 2 + (units - 300) * 3;  
        }  
        System.out.println("The electricity bill for " +units+ " is : ₹ " + Math.round(billToPay));  
        
        
        System.out.println("Press   '1' For Paying Offline\n\t'2' For Paying Online");
        System. out.print("What's Your Option : ");
        int choice = s.nextInt();
        
        if(choice==1){
            System. out.print("\n\n\t\t");
            System. out.print("Loading...");
            System. out.print("\n\t");
            System. out.print("Goto Near electricity office !... and pay cash there");
            System. out.print("\n\n\t\tThank You!..");
            
        }
        else{
            System. out.println("Enter Bill Number : ");
            long billNumber = s.nextLong();
            if(billNumber<0){
                System. out.println("Invalid Bill Number");
            }
            else{
            System.out.println("You Are Paying "+Math.round(billToPay)+" Rupees");
            System. out.println("Here You Go");
            System. out.println("Paid Successfully !..");
            
            System. out.print("\n\n\t\t");
            System. out.print("\n---------------");
            System. out.print("\nRecipt");
            System.out.print("\n---------------");
            System. out.print("\n\t");
            System. out.print("\nDoor Number : "+doorNumber);
            System. out.print("\nBill Number : "+billNumber);
            System.out.print("\nBill Status : Paid");
            System.out.print("\nAmount : "+Math.round(billToPay));
            System. out.print("\nBalance : 0");
            
            
            
            }
            
        }
        }
        catch(Exception e){
            System. out.println("IO Exception Occured");
            System. out.println("Enter Valid Input Please");
            System. out.println("Error Is : " +e);
        }
        finally{
            System. out.println("\nThanks for Using this code");
        }
    }   
}  
