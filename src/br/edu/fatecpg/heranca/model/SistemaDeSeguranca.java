package br.edu.fatecpg.heranca.model;
import java.util.Scanner;

public class SistemaDeSeguranca implements Autenticavel {
	Scanner scan = new Scanner(System.in);
	final String loginCorreto = "admin";
	final String senhaCorreta = "1234";
	private Boolean autenticado = false;
	
	public Boolean getAutenticado() {
		return autenticado;
	}

	public void setAutenticado(Boolean autenticado) {
		this.autenticado = autenticado;
	}

	public void login(String login, String senha) {
		if(!autenticado) {
			if (login.equals(loginCorreto) && senha.equals(senhaCorreta)) {
				autenticado = true;
				System.out.println("Login bem-sucedido!\n");
			} else {
				System.out.println("Login incorreto, tente novamente!\n");
			}
		}
	}
	
	public void logout() {
		System.out.println("Você deseja fazer logout (s/n)?");
		String opcao = scan.nextLine();
		
		if (opcao.equals("s")) {
			System.out.println("Adeus!");
			autenticado = false;
		} else {
			System.out.println("Ok!");
		}
		
	}
}
