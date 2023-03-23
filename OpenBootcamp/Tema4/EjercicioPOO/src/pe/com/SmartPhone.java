package pe.com;


public class SmartPhone extends SmartDevice{
    private String camera;
    private double storage;
    //constructor
    public SmartPhone() {
    }
    public SmartPhone(String camera, double storage, String modelo, String marca, double precio) {
        super(modelo, marca, precio);
        this.camera = camera;
        this.storage = storage;
    }
    //getter and setter
    public String getCamera() {
        return camera;
    }

    public void setCamera(String camera) {
        this.camera = camera;
    }

    public double getStorage() {
        return storage;
    }

    public void setStorage(double storage) {
        this.storage = storage;
    }
    //metodo toString

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" ");
        sb.append("SmartPhone{camera=").append(camera);
        sb.append(", storage=").append(storage);
        sb.append('}');
        return sb.toString();
    }
    
}
