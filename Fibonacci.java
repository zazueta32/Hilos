package hilos;

public class Fibonacci extends Thread {
	int fibo1;
	int fibo2;
	private int n;
	
	public Fibonacci(int n){
		this.n=n;
		
		while(n<=1);
		
		fibo1=1;
		fibo2=1;
		
    	for(int i=2; i<=n;i++){
			
			fibo2 = fibo1 + fibo2;
			fibo1 = fibo2 - fibo1;
		}
		System.out.println("Los " + n + " primeros numeros de la serie de Fibonacci son: "+fibo1);
		//System.out.println(fibo2 + " ");
		//System.out.println(fibo1 + " ");
		System.out.println();
	}
}
