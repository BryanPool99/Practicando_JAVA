package pe.com;

public class SmartDevice {
    private String modelo;
    private String marca;
    private double precio;
    //constructor vacio
    public SmartDevice() {
    }
    //constructor
    public SmartDevice(String modelo, String marca, double precio) {
        this.modelo = modelo;
        this.marca = marca;
        this.precio = precio;
    }
    //getters and setters
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    //metodo toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SmartDevice{modelo=").append(modelo);
        sb.append(", marca=").append(marca);
        sb.append(", precio=").append(precio);
        sb.append('}');
        return sb.toString();
    }
    
}
