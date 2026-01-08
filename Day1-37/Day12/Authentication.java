import java.util.*;
class Authentication{

	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		String email="abinash@gmail.com";
		String password="3344";
		
		int count=0;
			do{
			System.out.println("Enter old Password-");
			String newPassword=sc.nextLine();
            if(password.equals(newPassword)){

		System.out.println("new password set");
			return;
}
         else{
		System.out.println("Enter again old password");
		count++;
		

}



}
	while(count<5);




}


}