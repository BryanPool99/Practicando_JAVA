package Herencia;

import java.util.Date;

public class Cliente extends Persona{
	private int idCliente;
    private Date fechaRegisto;
    private boolean vip;
    private static int contadorCliente;
    //constructor
    public Cliente(String nombre,Date fechaRegistro, boolean vip) {
		super(nombre);
		this.idCliente = ++Cliente.contadorCliente;
		this.fechaRegisto=fechaRegistro;
		this.vip=vip;
	}
    //getters and setters
	public int getIdCliente() {
		return idCliente;
	}
	public Date getFechaRegisto() {
		return fechaRegisto;
	}
	public void setFechaRegisto(Date fechaRegisto) {
		this.fechaRegisto = fechaRegisto;
	}
	public boolean isVip() {
		return vip;
	}
	public void setVip(boolean vip) {
		this.vip = vip;
	}
	//metodo toString
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cliente [idCliente=");
		builder.append(this.idCliente);
		builder.append(", fechaRegisto=");
		builder.append(this.fechaRegisto);
		builder.append(", vip=");
		builder.append(this.vip);
		builder.append(", ").append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
}
