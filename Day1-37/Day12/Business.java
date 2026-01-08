class Business{
	public static void main(String[]args){

		String role=args[0];
		long salary=20000;




	switch(role){
		
		case "user":
			System.out.println("salary of employee-"+salary);
			break;

		case "admin":
			System.out.println("salary of employee-"+salary);
			break;

		case "super_admin":
			System.out.println("salary of employee-"+salary);
			salary=50000;
			System.out.println("salary of employee after update-"+salary);
			break;
		default :
			System.out.println("Invalid Entery");







}

}


}