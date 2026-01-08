class Library{
   private static String bookName="DSA in java";
   public static int bookNumber=100;
   static String libraryName="CodeLibrary";
   protected static String student="Abhi";

    
}
class Institute{

  public static void main(String[]args){
  //Accessing private variable
  // System.out.println(Library.bookName); (throw an error,because of difffrent class.Private variable can't access)

  //Accessing public variable
    System.out.println(Library.bookNumber); //(Working fine with public variable in diffrent class)

   //Accessing protected variable
    System.out.println(Library.student); // this one will also working fine ,because both class are in same package.
  
}
}