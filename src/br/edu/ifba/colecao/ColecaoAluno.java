package br.edu.ifba.colecao;

import br.edu.ifba.basicas.Aluno;

public class ColecaoAluno {
	

	
	private Aluno[] a = new Aluno[10];
	
    private void cadastrarAluno( Aluno a) {
    	
    	for(int cont=0;cont<this.a.length; cont++) {
    		if(this.a[cont]==null) {
    			this.a[cont] =a;
    			break;
    		}
    	}
    }
    public Aluno[] retornoAluno() {
    	return this.a;
    	
    }
}
	
