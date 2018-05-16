package hilos;

public class Hilos extends Thread
{
	private int n;
	public Hilos (int n)
	{
		this.n=n;
		
		if(n%2==0)
		{
			System.out.println("El "+n+ " Es par ");
		}
		else
		{
			System.out.println("El "+n+" No es par");
		}
	}
}
