package br.edu.fatecpg.heranca.model;

public class Vendedor implements Funcionario {
 private String nome;
 private double salario;
 private double comissao;
 private int totalVendas;

 public Vendedor(String nome, double salario, double comissao) {
     this.nome = nome;
     this.salario = salario;
     this.comissao = comissao;
     this.totalVendas = 0;
 }

 public void baterPonto() {
     System.out.println("Vendedor " + nome + " bateu o ponto.");
 }

 
 public void receberSalario() {
     double total = salario + (comissao * totalVendas);
     System.out.println("Vendedor " + this.nome + " recebeu R$ " + total);
 }


 public void tirarFerias() {
     System.out.println("Vendedor " + this.nome + " entrou em férias.");
 }

 public void realizarVenda() {
     totalVendas++;
     System.out.println("Vendedor " + this.nome + " realizou uma venda. Total: " + this.totalVendas);
 }

 public void abrirCaixa() {
     System.out.println("Vendedor " + this.nome + " abriu o caixa.");
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
 
 public double getComissao() { 
	 return comissao; 
}
 
 public void setComissao(double comissao) { 
	 this.comissao = comissao; 
}
 
 public int getTotalVendas() { 
	 return totalVendas; 
}
}
