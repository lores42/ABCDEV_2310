package procedure_fonction_exo_3;

public class App {
	
	
	public static boolean est_divisible( int a, int b)
		{
			if(a%b==0)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		
	public static void main(String[] args) {

		int nbr1, nbr2;
		boolean divisible;
		nbr1 = 8;
		nbr2 = 3;
		divisible= est_divisible(nbr1,nbr2);
		
		System.out.println(divisible);

	}

}
