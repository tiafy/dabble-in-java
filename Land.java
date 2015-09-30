public class Land
{
	public static void main(String[] args)
	{
		int acre, tract, total;	
		acre = 43560;				//amount of square feet in an acre
		tract = 398767;			//amount of square feet in tract of land
		total = tract / acre;	//total number of acres in the specified tract
		System.out.println("The tract of land is " + total + " acres.");
	}
}