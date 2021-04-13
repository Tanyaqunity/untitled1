package gsu;

import java.util.Objects;

public class Medication {
    protected String Manufacturer;
    int quantity;
    private int type;

    private static int MedicationCounter = 0;

    public static int getMedicationCounter() {
        return MedicationCounter;
    }

    private String BatchNumber;

    public Medication() {
        this("EMPTY");
        System.out.println("it's Medication");
    }

    public Medication(String BatchNumber) {
        System.out.println("it's Medication " + BatchNumber);
        this.BatchNumber = BatchNumber;

        MedicationCounter++;
    }

    public void setBatchNumber(String BatchNumber) {
        this.BatchNumber = BatchNumber;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("deleting Medication!");
    }


    public String getBatchNumber() {
        return BatchNumber;
    }

    public static boolean getMedicationCounter() {
    }

    public String getManufacturer() {
        return Manufacturer;
    }
    public void setManufacturer(String anotherManufacturer) {
        Manufacturer = anotherManufacturer;
    }

    public void printUsedFor() {
    }
    int recommendedDose() {
        int result = 5;
        if (type < 0) {
            result = quantity/30;
        }
        return result;
    }

    @Override
    public boolean equals(Object another) {
        if (this == another) {
            return true;
        }
        if (another instanceof Medication) {
            Medication anotherMedication = (Medication) another;
            if (this.BatchNumber().equals(anotherMedication.BatchNumber())) {
                return true;
            }
        }

        return false;
    }

    private Object BatchNumber() {
    }

    @Override
    public Object hashCode() {
        return Objects.hashCode(BatchNumber());

        @Override
        public String toString() {
            return "Medication (BatchNumber=" + BatchNumber() + ")";
        }


    
}
