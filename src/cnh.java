import java.util.Scanner;

public class CNH {
	
	public static void habilitacao(int idade) {
		if (idade >= 18) {
			System.out.println("=".repeat(42));
			System.out.printf("Você tem %d anos.%nEstá apto a tirar a sua CNH!%n", idade);
			System.out.println("=".repeat(42));
		}
		else {
			System.out.println("=".repeat(42));
			System.out.printf("Você tem apenas %d anos.%nFalta %d anos para porder tirar a sua CNH!%n", idade, 18-idade);
			System.out.println("=".repeat(42));
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=".repeat(17) + " DETRAN " + "=".repeat(17));
		System.out.print("Digite sua idade: ");
		int idade = sc.nextInt();
		habilitacao(idade);
		System.out.println("FIM DO PROGRAMA! VOLTE SEMPRE!");
		
		sc.close();

	}

}
