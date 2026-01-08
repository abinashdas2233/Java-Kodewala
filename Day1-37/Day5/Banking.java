class Banking{
public static void main(String[]args){
double raviTotalAmount=2000.00;
double abinashTotalAmount=5000.00;
System.out.println("Before Transaction- Ravi Total amount-"+raviTotalAmount+"Abinash Total amount- "+abinashTotalAmount);
double TransactionAmount=500.00;
abinashTotalAmount=abinashTotalAmount-TransactionAmount;
raviTotalAmount=raviTotalAmount+TransactionAmount;
System.out.println("After Transaction- Ravi Total amount-"+raviTotalAmount+"Abinash Total amount- "+abinashTotalAmount);

}
}