package br.edu.fatecpg.heranca.model;

public class PagamentoCartao implements Pagamentos {
private double valor;
	
public double getValor() {
	return valor;
}

public void setValor(double valor) {
	this.valor = valor;
}

	public PagamentoCartao (double valor) {
		this.valor = valor;
	}
	
	public String emitirRecibo() {
		double taxa = valor * 0.05;
		String retorno = ("========== RECIBO - CARTÃO ==========\n"
                + "Valor base........: R$" +  this.valor
                + "\nTaxa (10%).........: R$" + taxa
                + "\nTotal a pagar.....: R$" + (this.valor + taxa)
                + "\nForma de pagamento: Cartão\n"
                + "\n=====================================");

        return retorno;
       }
	
	public double calcularPagamento() {
		return valor + valor * 0.05;
	}
}
