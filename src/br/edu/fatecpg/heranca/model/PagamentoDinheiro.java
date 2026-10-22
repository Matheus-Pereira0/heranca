package br.edu.fatecpg.heranca.model;

public class PagamentoDinheiro implements Pagamentos {
private double valor;
	
public double getValor() {
	return valor;
}

public void setValor(double valor) {
	this.valor = valor;
}

	public PagamentoDinheiro (double valor) {
		this.valor = valor;
	}
	
	public String emitirRecibo() {
		double desconto = valor * 0.1;
		String retorno = ("========== RECIBO - CARTÃO ==========\n"
                + "Valor base........: R$" +  this.valor
                + "\nDesconto (10%).........: R$" + desconto
                + "\nTotal a pagar.....: R$" + (this.valor - desconto)
                + "\nForma de pagamento: Cartão\n"
                + "\n=====================================");
        return retorno;
       }
	
	public double calcularPagamento() {
		return valor - valor * 0.10;
	}
}
