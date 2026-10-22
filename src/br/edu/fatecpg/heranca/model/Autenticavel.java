package br.edu.fatecpg.heranca.model;

public interface Autenticavel {
	public void login(String usuario, String senha);
	public void logout();
}
