class MainClass
{

	public static void main(String []args)
	{
		Customer c1 =new Customer();
		SBI s1=new SBI();
		PNB p1=new PNB();
		OBC o1=new OBC();
		double SBIamount=s1.getrateOfISBI();
		double PNBamount=p1.getrateOfIPNB();
		double OBCamount=o1.getrateOfIOBC();
		System.out.println("Amount in SBI: "+SBIamount);
		System.out.println("Amount in PNB: "+PNBamount);
		System.out.println("Amount in OBC: "+OBCamount);
		if(SBIamount>PNBamount){
			if(SBIamount>OBCamount)
			{
			System.out.println("You can open account in SBI"); 	
			}
			else
			{
			System.out.println("You can open account in OBC");
			}
		}
		if(PNBamount>SBIamount){
			if(PNBamount>OBCamount)
			{
			System.out.println("You can open account in PNB"); 	
			}
			else
			{
			System.out.println("You can open account in OBC");
			}
		}

	}

}
class Customer 
{
	double depositAmount;
	public Customer()
	{
		depositAmount=25000;
	}
}
class SBI extends Customer
{
	double rateOfISBI;
	public SBI()
	{
		rateOfISBI=5.5;
	}
	double getrateOfISBI()
	{
		double totalAmount;
		totalAmount=depositAmount+(depositAmount*rateOfISBI/100);
		return totalAmount;
	}
}
class PNB extends Customer
{
	double rateOfIPNB;
	public PNB()
	{
		rateOfIPNB=7.5;
	}
	double getrateOfIPNB()
	{
		double totalAmount;
		totalAmount=depositAmount+(depositAmount*rateOfIPNB/100);
		return totalAmount;
	}
}

class OBC extends Customer
{
	double rateOfIOBC;
	public OBC()
	{
		rateOfIOBC=6.5;
	}
	double getrateOfIOBC()
	{
		double totalAmount;
		totalAmount=depositAmount+(depositAmount*rateOfIOBC/100);
		return totalAmount;
	}
}