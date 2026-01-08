class SwitchCase
{

	public static void main(String args[])
	{
      int day=Integer.parseInt(args[0]);
	  
	  switch(day)
	  {
	  case 1 :
      System.out.println("Mon");	  
      break;
	  
	  case 2 :
      System.out.println("Tue");	  
      break;
	 
	  case 3 :
      System.out.println("Wed");	  
      break;
	  
	  case 4 :
      System.out.println("Thu");	  
      break;
	  
	  default:
	  System.out.println("Unknown day!!");
	}
	}


}