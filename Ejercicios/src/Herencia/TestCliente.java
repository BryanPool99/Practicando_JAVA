package Herencia;

import java.util.Date;

public class TestCliente {
	public static void main(String[] args) {
		Cliente c1=new Cliente("Bryan", new Date(), false);
		System.out.println("cliente 1 = " + c1);
	}
}
