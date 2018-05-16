package hilos;

public class Sumatoria extends Thread
{
	int suma=0;
	String mensaje;
	private int n;
	public Sumatoria (int n)
	{
		this.n=n;
		
		for(int i=0;i<=n;i++)
		{
			suma = suma +i;
			
		}
		System.out.println("La sumatoria de "+ n + " es de: "+suma);
		
	}
	
}