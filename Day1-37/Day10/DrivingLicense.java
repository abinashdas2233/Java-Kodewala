class DrivingLicense{
	public static void main(String[]args){
		int age=Integer.parseInt(args[0]);
	
		if(age>=18 && age<=60){
			System.out.println("you are age is "+age+"Eligible to apply for DL.");
		
}
		else{
			System.out.println("you are age is " +age+"Not eligible to apply for DL.");
	

}
	}
}