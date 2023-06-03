package gitproject;

public class Calculator {

	int balance=100;
	public void add()
	{
		int add=10;
		balance=balance+add;
		System.out.println("After added amount "+balance+" & previous amount "+this.balance);
	}
	
	public void sub()
	{
		int sub=10;
		balance=balance-sub;
		System.out.println("After substract amount "+balance+" &  previous amount "+this.balance);
	}
	
	public void div()
	{
		int div=10;
		balance=balance/div;
		System.out.println("After devided amount "+balance+" & previous amount"+this.balance);
	}

	public static void main(String[] args) {
		Calculator calculator=new Calculator();
		calculator.add();
		calculator.sub();
		calculator.div();
	}
}
