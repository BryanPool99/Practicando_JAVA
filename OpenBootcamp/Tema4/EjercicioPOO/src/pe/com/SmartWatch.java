package pe.com;


public class SmartWatch extends SmartDevice{
    private String batteryType;

    public SmartWatch() {
    }
    public SmartWatch(String batteryType, String modelo, String marca, double precio) {
        super(modelo, marca, precio);
        this.batteryType = batteryType;
    }
    //getters and setters

    public String getBatteryType() {
        return batteryType;
    }

    public void setBatteryType(String batteryType) {
        this.batteryType = batteryType;
    }
    //metodo toString()

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" ");
        sb.append("SmartWatch{batteryType=").append(batteryType);
        sb.append('}');
        return sb.toString();
    }
    
}
