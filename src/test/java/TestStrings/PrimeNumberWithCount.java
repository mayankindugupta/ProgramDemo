package TestStrings;

public class PrimeNumberWithCount {

	public static void main (String[] args)
	   {		
	       int i =0;
	       int num =0;
	       //Empty String
	       String  pNum = "";

	       for (i = 1; i <= 100; i++)         
	       { 		  	  
	          int temp=0; 	  
	          for(num =i; num>=1; num--)
		  {
	             if(i%num==0)
		     {
	            	 temp = temp + 1;
		     }
		  }
		  if (temp ==2)
		  {
		     //Appended the Prime number to the String
			  pNum = pNum + i + " ";
		  }	
	       }	
	       System.out.println("Prime numbers from 1 to 100 are :");
	       System.out.println(pNum);
	   }
}
