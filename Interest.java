public class Interest
{
	public static void main(String[] args)
	{
		double investment, rate, interest, value;
		investment = 19000;
		rate = 0.07;
		interest = investment * rate;
		value = investment + interest;
		System.out.println("The earned interest of $" + interest + " increases the investment of $" + investment + " to a total capital of $" + value + " after one year.");
	}
}