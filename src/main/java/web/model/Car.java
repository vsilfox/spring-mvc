package web.model;

public class Car {
    private String model;
    private long serial;
    private int engineCapacity;

    public Car(String model, long serial, int engineCapacity) {
        this.model = model;
        this.serial = serial;
        this.engineCapacity = engineCapacity;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public long getSerial() {
        return serial;
    }

    public void setSerial(long serial) {
        this.serial = serial;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    @Override
    public String toString() {
        return "Car{" +
               "model='" + model + '\'' +
               ", serial=" + serial +
               ", engineCapacity=" + engineCapacity +
               '}';
    }
}
