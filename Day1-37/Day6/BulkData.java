class Bank{
}
class BulkData{
static byte data;
static short temprature;
static int amount;
static long serialNumber;
static double calculation;
static float result;
static char name;
static String address;


static Bank bank;
static BulkData bdata;

public static void main(String[]args){



System.out.println("Default value for data types:-");
System.out.println("Byte-"+data+"short-"+temprature+" int-"+amount+" long-"+serialNumber+"double-"+calculation+" float="+result+ "char-"+name+"String-"+address);
System.out.println(bank);
System.out.println(bdata);
}
}