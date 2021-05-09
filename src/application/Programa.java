package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Cliente;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List <Cliente> list = new ArrayList<>();
		
		System.out.println("---- FORMULÁRIO DE CADASTRO DE CLIENTE ----");
		
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("CPF/CNPJ: (Incluir pontos e traços): ");
		String cpfOuCnpj = sc.nextLine();
		System.out.print("Telefone (xx)xxxxx-xxxx: ");
		String telefone = sc.nextLine();
		System.out.print("CEP (xxx.xxx.xxx-xx): ");
		String cep = sc.nextLine();
		System.out.print("Logradouro: ");
		String logradouro = sc.nextLine();
		System.out.print("Número: ");
		int numero = sc.nextInt();
		System.out.print("Bairro: ");
		sc.nextLine();
		String bairro = sc.nextLine();
		System.out.print("Cidade: ");
		String cidade = sc.nextLine();
		System.out.print("Estado: ");
		String estado = sc.nextLine();
			
		Cliente cliente = new Cliente(nome, email, cpfOuCnpj, telefone, cep, logradouro, numero, bairro, cidade, estado);
		list.add(cliente);
		
		System.out.println(cliente);
		
	sc.close();
	}
}
