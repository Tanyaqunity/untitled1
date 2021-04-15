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

    private String batchNumber;

    public Medication() {
        this("EMPTY");
        System.out.println("it's Medication");
    }

    public Medication(String BatchNumber) {
        System.out.println("it's Medication " + BatchNumber);
        this.batchNumber = BatchNumber;

        MedicationCounter++;
    }

    public void setBatchNumber(String BatchNumber) {
        this.batchNumber = BatchNumber;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("deleting Medication!");
    }

    public String getBatchNumber() {
        return batchNumber;
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
            if (this.batchNumber.equals(anotherMedication.batchNumber)) {
                return true;
            }
        }

        return false;
    }

//    private Object BatchNumber() {
//    }

    @Override
    public int hashCode() {
        return Objects.hashCode(batchNumber);
    }

        @Override
        public String toString() {
            return "Medication (BatchNumber=" + batchNumber + ")";
        }


    
}
