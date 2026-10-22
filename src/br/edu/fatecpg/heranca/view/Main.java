package br.edu.fatecpg.heranca.view;
import br.edu.fatecpg.heranca.model.*;
import java.util.Scanner;

public class Main {
 public static void main(String[] args) {
	 Scanner scan = new Scanner(System.in);
	 System.out.println("----------------------- ATIVIDADE 1 -----------------------\n");

     Gerente gerente = new Gerente("Carlos", 7500.00);
     Vendedor vendedor = new Vendedor("Ana", 2500.00, 50.00);
     Faxineiro faxineiro = new Faxineiro("João", 1800.00, "Manhã");
     
     System.out.println("========== GERENTE ==========");
     gerente.baterPonto();
     gerente.fecharCaixa();
     gerente.solicitarMaterial();
     gerente.autorizarDesconto();
     gerente.receberSalario();
     gerente.tirarFerias();

     System.out.println("\n========== VENDEDOR ==========");
     vendedor.baterPonto();
     vendedor.abrirCaixa();
     vendedor.realizarVenda();
     vendedor.realizarVenda();
     vendedor.realizarVenda();
     vendedor.receberSalario();
     vendedor.tirarFerias();

     System.out.println("\n========== FAXINEIRO ==========");
     faxineiro.baterPonto();
     faxineiro.limparSetor("Recebimento");
     faxineiro.trocarTurno("Tarde");
     faxineiro.receberSalario();
     faxineiro.tirarFerias();
     
     System.out.println("\n----------------------- ATIVIDADE 2 -----------------------\n");
     
     PagamentoDinheiro pag1 = new PagamentoDinheiro(100.00);
     PagamentoCartao pag2 = new PagamentoCartao(100.00);
     
     System.out.println(pag1.emitirRecibo());
     System.out.println("Valor final (Dinheiro): " + pag1.calcularPagamento() + "\n");
     
     System.out.println(pag2.emitirRecibo());
     System.out.println("Valor final (Cartão): " + pag2.calcularPagamento());
     
     System.out.println("\n----------------------- ATIVIDADE 3 -----------------------\n");
     SistemaDeSeguranca sistema = new SistemaDeSeguranca();
     int opc = -1;
     do {
    	 if (!sistema.getAutenticado()) {
    	 System.out.print("Login: ");
    	 String login = scan.nextLine();
    	 
    	 System.out.print("Senha: ");
    	 String senha = scan.nextLine();
    	 
    	 sistema.login(login, senha);
    	 } else {
    		 System.out.println("1 - Sair do sistema");
    		 opc = scan.nextInt(); 
    		 switch (opc) {
    		 case 1:
    			 sistema.logout();
    			 scan.nextLine();
    			 break;
    		 default:
    			 System.out.println("Opção invalida!");
    			 break;
    		 }
    	 }
     } while (opc != -2);

     
 }
}
