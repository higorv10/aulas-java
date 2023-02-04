
/**
 * Classe que abstrai uma Conta Bancária
 * @author thiagoyama
 * @version 1.0
 */
public class Conta {
	/**
	 * Número da conta
	 */
	private int numero;
	
	/**
	 * Número da Agência
	 */
	private int agencia;
	
	/**
	 * Saldo da Conta
	 */
	private double saldo;
	
	
	public Conta(){
		
	}
	
	public Conta(int numero, int agencia, double saldo){
		this.setNumero(numero);
		this.setAgencia(agencia);
		this.setSaldo(saldo);
	}
	
	/**
	   * Deposita um valor ao saldo da conta
	   * @param valor Valor a ser depositado
	*/
	public void depositar(double valor){
		saldo = saldo + valor;
	}
	
	/**
	  * Retira um valor do saldo da conta
	  * @param valor Valor a ser retirado
	*/

	public void retirar(double valor){
		saldo = saldo - valor;
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public double getSaldo() {
		return saldo;
	}
    public void  setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
