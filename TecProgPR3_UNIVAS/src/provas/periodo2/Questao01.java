package provas.periodo2;

import java.util.Scanner;

public class Questao01 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int[] grades= new int[25]; // troque o "25" pela quantidade de notas desejada :)
		int lowestGrade, highestGrade;
		
		for(int i = 0; i < grades.length; i++){
			System.out.print("Digite a nota do " + (i + 1) + "° aluno: ");
			grades[i] = input.nextInt();
		}
		
		highestGrade = grades[0];
		lowestGrade = grades[0];
		
		System.out.println("A maior nota é " + classifyHigh(grades, highestGrade));
		System.out.println("A menor nota é " + classifyLow(grades, lowestGrade));
		
	input.close();
	
	}
	
	public static int classifyHigh(int[] grades, int highestGrade) {
		for(int i = 0; i < grades.length; i++){
			if(grades[i] > highestGrade) highestGrade = grades[i];
		}
		return highestGrade;
	}
	
	public static int classifyLow(int[] grades, int lowestGrade) {
		for(int i = 0; i < grades.length; i++){
			if(grades[i] < lowestGrade) lowestGrade = grades[i];
		}
		return lowestGrade;
	}
}
