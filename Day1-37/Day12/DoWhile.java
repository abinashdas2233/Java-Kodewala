class DoWhile
{


	public static void main(String args[])
	{
		int retryCount=1;
        do
		{
		// code or logic	
		System.out.println("Password reset attempt : "+retryCount);
		retryCount = retryCount+1;
		
		}
		while(retryCount <=3);
		
		

	}


}