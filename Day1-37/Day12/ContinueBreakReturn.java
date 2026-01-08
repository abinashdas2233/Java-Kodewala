class ContinueBreakReturn
{



    public static void main(String args[])
	{
	
	  int arr[]={-1,2,3,-4,-2,-5,8};
	
	for(int index=0; index<arr.length; index++)
	{
		int currentNumber = arr[index];
	  if(currentNumber <0)
	  {
		  System.out.println("This array is -ve");
		  break;
	  }
	
	 System.out.println(" Got positive number... i still assume array is +ve");
	 
	}
	  
	
	}



} 