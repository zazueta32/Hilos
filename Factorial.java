package hilos;

public class Factorial extends Thread
{
	int factorial=1;
	private int n;
	public Factorial(int n)
	{
		this.n=n;
		for (int i = n; i > 0; i--) {
            factorial = factorial * i;
        }
       
		 System.out.println("El factorial de " + n + " es: " + factorial);
		
	}
}

