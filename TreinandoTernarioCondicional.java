import java.util.Scanner;
public class TreinandoTernarioCondicional {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int idade;
		String texto = "";
		System.out.println("Bem vindo ao programa: Testando ternário condicional! \n Para começar digite sua idade: ");
		idade = entrada.nextInt();
		texto = (idade >= 18) ? "Você é maior de idade!" : "Você é menor de idade!";
		System.out.println(texto);
	}
}
