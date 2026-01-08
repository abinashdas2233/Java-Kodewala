class Account{

public static void main(String[]args)
{

String accountHolder_name=args[0];
long accountNumber=Long.parseLong(args[1]);
double balance=Double.parseDouble(args[2]);

System.out.println("Name="+account_holder_name+" Balance-"+balance+" Account Number-"+account_number);
}

}