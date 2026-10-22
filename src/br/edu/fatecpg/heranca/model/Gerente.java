package br.edu.fatecpg.heranca.model;

public class Gerente implements Funcionario {
	private String nome;
	private double salario;
	
	public Gerente(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void baterPonto() {
		System.out.println("Gerente " + this.nome + " bateu ponto.");
	}
	
	public void tirarFerias() {
		System.out.println("Gerente " + this.nome + " entrou em férias");
	}
	
	public void receberSalario() {
		System.out.println("Gerente " + this.nome + " recebeu o salário de R$" + this.salario);
	}
	
    public void fecharCaixa() {
        System.out.println("Gerente " + this.nome + " fechou o caixa.");
    }

    public void solicitarMaterial() {
        System.out.println("Gerente " + this.nome + " solicitou material ao estoque.");
    }

    public void autorizarDesconto() {
        System.out.println("Gerente " + this.nome + " autorizou um desconto na venda.");
    }
}
