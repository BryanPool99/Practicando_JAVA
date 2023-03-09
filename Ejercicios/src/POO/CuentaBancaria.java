package POO;
/*
  	Crear una clase "Cuenta bancaria" con atributos 
  	como número de cuenta, saldo y titular de la cuenta, 
  	y métodos para depositar, retirar y consultar el saldo.
*/
public class CuentaBancaria {
	//atributos
	private String numCuenta;
	private double saldo;
	private String titularCuenta;
	//CONSTRUCTOR
	public CuentaBancaria(String numCuenta, double saldo, String titularCuenta) {
		this.numCuenta = numCuenta;
		this.saldo = saldo;
		this.titularCuenta = titularCuenta;
	}
	//METODOS GETTERS AND SETTERS
	public String getNumCuenta() {
		return numCuenta;
	}
	public void setNumCuenta(String numCuenta) {
		this.numCuenta = numCuenta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getTitularCuenta() {
		return titularCuenta;
	}
	public void setTitularCuenta(String titularCuenta) {
		this.titularCuenta = titularCuenta;
	}
	public void depositar(double valDepo) {
		this.saldo+=valDepo;
	}
	public void retirar(double valRetiro) {
		if(this.saldo<valRetiro || this.saldo<=0) {
			System.out.println("No tiene saldo suficiente para retirar "+valRetiro);
		}else {
			this.saldo-=valRetiro;
		}
	}
	public void consultarSaldo() {
		System.out.println("Hola "+this.titularCuenta+"!!");
		System.out.println("Le informamos que el saldo actual de la cuenta con numero "+ this.numCuenta+" es de :$"+(this.saldo));
	}
	//metodo main
	public static void main(String[] args) {
		CuentaBancaria cB1=new CuentaBancaria("001", 510.50,"Bryan Pool");
		cB1.consultarSaldo();
		cB1.depositar(10.5);
		cB1.consultarSaldo();
		cB1.depositar(150);
		cB1.retirar(600);
		cB1.consultarSaldo();
	}
}
