package RepetitiveNumbersConroller;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.IOException;

public class RepetitiveNumbersProgram {

	public static void main(int[] args) throws IOException {
	
		int a =9;
		function(a);
	}
	public static int function(int i) throws IOException {
		try 
		{
		int count=0,ArryPices,input,Total=0;
		Scanner ArrayNumber = new Scanner(System.in);
		System.out.println("\r\n" + "How many numbers will you enter:");
		ArryPices = ArrayNumber.nextInt();
		
		int[] SelectedNumber = new int[ArryPices];
		
		System.out.println("Enter elements of the array:");
		
		    for (i=0;i<ArryPices;i++)
		    {
		    	for (int x = 0; x < SelectedNumber.length; x++) 
		    	{
		    		input = ArrayNumber.nextInt();
					SelectedNumber[x] = input;
					Total = Total+ SelectedNumber[x];
				}
		        				 
				 for( int j=0;j<ArryPices;j++)
				 {
					 for(int k=0;k<ArryPices;k++)
					 {
						 if(SelectedNumber[j]==SelectedNumber[k])
						 {
							 for( int l=0;l<j;l++)
							 {
								 if(SelectedNumber[l]==SelectedNumber[j])
									 count=-1;
							 }
							 
							 count++;
						 }						 
					 }
		            if (count != 0)
		            	System.out.println(SelectedNumber[j] + " number " + count + " times repeated ");
		            count=0;
		           }
		    }		    
		    System.in.read();	
		    ArrayNumber.close();
		    
		}
		
		catch(InputMismatchException e)
		{
			 System.out.println("Please enter numbers only!!");
			
		}
		
		finally
		{
			 System.out.println("I think run it again!");
		}
		
		return i;
	}
	
}
