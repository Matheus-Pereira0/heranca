package br.edu.fatecpg.heranca.model;

public class Faxineiro implements Funcionario {
 private String nome;
 private double salario;
 private String turno;

 public Faxineiro(String nome, double salario, String turno) {
     this.nome = nome;
     this.salario = salario;
     this.turno = turno;
 }

 public void baterPonto() {
     System.out.println("Faxineiro " + this.nome + " bateu o ponto.");
 }


 public void receberSalario() {
     System.out.println("Faxineiro " + this.nome + " recebeu o salário de R$ " + salario);
 }


 public void tirarFerias() {
     System.out.println("Faxineiro " + this.nome + " entrou em férias.");
 }

 public void limparSetor(String setor) {
     System.out.println("Faxineiro " + this.nome + " limpou o setor: " + setor);
 }

 public void trocarTurno(String novoTurno) {
     this.turno = novoTurno;
     System.out.println("Faxineiro " + this.nome + " mudou para o turno: " + this.turno);
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
 
 public String getTurno() { 
	 return turno; 
}
 
}