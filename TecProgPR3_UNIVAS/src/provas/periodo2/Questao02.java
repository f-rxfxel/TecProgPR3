package provas.periodo2;

import java.util.Scanner;

public class Questao02 {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		String[] names = new String[50]; // troque o "50" pela quantidade de convidados desejada :)
		String name = null;
		
		System.out.println("-> Cadastro de Convidados ");
		registerGuests(names, name);
		
		System.out.println("\nLista Fechada!\n");
		System.out.println("-> Convidados Cadastrados");
		
		for (String guest: names) {
		    System.out.println(guest);
		}
	}

	public static void registerGuests(String[] names, String name) {

		for (int i = 0; i < names.length; i++) {

			System.out.println("Digite o nome do " + (i + 1) + "° convidado: ");
			name = input.nextLine();

			for (int j = 0; j < names.length; j++) { // "j++" recebe um warning de "Dead Code" :(

				if (name.equalsIgnoreCase(names[j])) {
					System.out.println(name + " já está na lista de convidados! Tente novamente:");
					i--;
					break;
				} else {
					names[i] = name;
					break;
				}
			}
		}
	}
}