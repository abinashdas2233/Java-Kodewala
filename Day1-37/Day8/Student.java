class Student{
	int id=1;
   	String name="Abhi";
	public String getInfo(){
	Student student=new Student();
	return Integer.toString(student.id) +" "+student.name;

}
    public void showDetails(){
	Student student=new Student();
	System.out.println(student.getInfo());
	
}
	public static void main(String[]args){
	Student student=new Student();
	student.showDetails();
	
	}
}
