package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ContaTerminal;

public class Program {

	public static void main(String[] args) {
		
		//TODO: Conhecer e importar a classe Scanner
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//TODO: Exibir as mensagens para o nosso usuario
		
		System.out.print("Por favor, digite o número da Agência: ");
		String agencia = sc.nextLine();
		System.out.print("digite o seu nome: ");
		String nomeCliente = sc.nextLine();
		System.out.print("digite o seu numero: ");
		int numero = sc.nextInt();
		System.out.print("digite o seu saldo: ");
		double saldo = sc.nextDouble();
		
		//TODO: Obter pela scanner os valores digitados no terminal
		
		ContaTerminal conta = new ContaTerminal(numero, agencia, nomeCliente, saldo);
		
		//TODO: Exibir a mensagem conta criada
		System.out.println(conta);
		
		sc.close();
	}
}
