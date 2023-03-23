package br.edu.ifba.basicas;

import java.util.Arrays;
import java.util.Scanner;

import br.edu.ifba.colecao.ColecaoAluno;

public class Principal {

	public static void main (String[] args) {
		
		Aluno a = new Aluno();
		Scanner in = new Scanner(System.in);
		System.out.println(a);
		ColecaoAluno ca = new ColecaoAluno();
		
		for (int cont=0;cont<10;cont++) {
			
			System.out.println("Digite o nome do aluno: ");
			a.setNome(in.nextLine());
			System.out.println("digite o cpf do aluno: ");
			a.setCpf(in.nextLine());
			System.out.println("Digite a matricula do aluno: ");
			a.setMatricula(in.nextLine());
			
		
	}
		
		System.out.println(Arrays.toString(ca.retornoAluno()));
	}
	
}
