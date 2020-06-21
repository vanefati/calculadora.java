//Criacao de uma calculadora que faz as opera��es b�sicas usando o comando switch que recebe 3 dados: dois n�meros e um caracter: + - * ou /.
package operacoes;
import java.util.Scanner;

public class Calculadora {
	public static void main (String[] args)
	{

		Scanner entrada = new Scanner (System.in);

		System.out.println("entre com o primeito valor:");
		int num1 = entrada.nextInt();

		System.out.print("entre com o segundo valor:");
		int num2 = entrada.nextInt();

		System.out.print("Selecione uma operacao:");
		System.out.print("\n\n[1]:soma");
		System.out.print("[2]diminui:");
		System.out.print("[3]:multiplica");
		System.out.print("[4]:divide");

		int opcao = entrada.nextInt();
	
		switch(opcao) {
			case 1:
				int soma = num1+num2;
				System.out.println("A soma dos valores e: +soma");
				break;
			case 2:
				int dimnui = num1-num2;
				System.out.println("A subtracao dos valores e: +diminui");
				break;
			case 3:
				int multiplica = num1*num2;
				System.out.println("A multiplicacao dos valores e: +multiplica");
				break;
			case 4:
				if(num1<num2)
				{
					System.out.print("Calculo impossivel!");
				}
				else
				{
					int divide = num1/num2;
					System.out.println("A divisao dos valores e: +divide");
				}
				break;
			default:
				System.out.print("Operacao invalida!:");
		}
	}
}

