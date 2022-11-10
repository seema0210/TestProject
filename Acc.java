package Ass5;

public class Acc {

	// private data
    private int aceed;
    private String name1;
    private int balance;
    //using getter and setter
	public int getAceed() {
		return aceed;
	}
	public void setAceed(int aceed) {
		this.aceed = aceed;
	}
	public String getName1() {
		return name1;
	}
	public void setName1(String name1) {
		this.name1 = name1;
	}
	public int getBalance() {
		return balance;
	}
	public void setBal(int balance) {
		this.balance = balance;
	} 
	//declaring method for withdrawing
	public void withdrawing(int a)
	{
		int campare;
		if(a>balance)// comparison of balance and withdrow
		{
			System.out.println("Small Value");
		}
		else
		{
			campare=balance-a;
			System.out.println("Current balance : "+campare);
		}
	}
	//method declaration for deposite
	public void deposit(int b)
	{
		int amount;
		amount=balance+b;//addition of cureent balance and amount
		System.out.println("Current balance :"+amount);
	}
	public Acc()
	{
		super();
	}
}
