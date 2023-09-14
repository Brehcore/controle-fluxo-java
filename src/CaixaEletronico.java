import java.util.Locale;
import java.util.Scanner;

public class CaixaEletronico {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double saldo = 25.0;
		
		System.out.print("Digite o valor do saque: ");
		double valorSolicitado = sc.nextDouble();
		
		if(valorSolicitado < saldo)
			saldo -= valorSolicitado;
		else
			System.out.println("Saldo insuficiente.");
		
		System.out.println();
		System.out.println("Seu saldo atual: " + saldo);
		
		sc.close();
	}

}
