package hilos;

public class Primos extends Thread
{
	
	private int n;
	public Primos(int n)
	{
		this.n=n;
		
		int r=0;
		 for(int i=1;i<(n+1);i++)
		 {
	         if(n%i==0)
	         {
	             r++;
	            }
	         }
	         if(r!=2)
	         {
	              System.out.println("El "+n+ " No es Primo");
	            }
	         else
	         {
	                System.out.println("El "+n+" Si es Primo");
	         }
	}

}
