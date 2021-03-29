package gsu;

public class medication {
    protected String manufacturer;
    int quantity;
    private int type;

    public String getManufacturer() {
        return manufacturer;
    }
    public void setManufacturer(String anothermanufacturer) {
        manufacturer = anothermanufacturer;
    }

    public void usedfor() {
    }
    int recommendeddose() {
        int result = 5;
        if (type < 0) {
            result = quantity/30;
        }
        return result;

    }
}
