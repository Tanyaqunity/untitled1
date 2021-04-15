package gsu;

public class Drugs extends Medication {
    private String batchNumber;
    public static int DrugsCounter;
   int doseDrugs;


    public Drugs(String BatchNumber) {
        this.batchNumber = BatchNumber;
        System.out.println("Drugs constructor");
        DrugsCounter++;
    }
    public Drugs(String BatchNumber, int DoseDrugs) {
        super(BatchNumber);
        this.batchNumber = BatchNumber;
        this.doseDrugs = DoseDrugs;
        System.out.println("Drugs constructor with parameters");
    }

    public String getBatchNumber() {
        return batchNumber;
    }

    public int getDoseDrugs() {
        return doseDrugs;
    }

    public Drugs() {
    }

    public void setDoseDrugs(int DoseDrugs) {
        this.doseDrugs = DoseDrugs;
    }

    public void setBatchNumber(String batchNumber) { this.batchNumber = batchNumber; }


    @Override
    public boolean equals(Object another) {
        if (this == another) {
            return true;
        }

        if (!super.equals(another)) {
            return false;
        }

        if (another instanceof Drugs) {
            Drugs pk = (Drugs) another;
            if (this.doseDrugs == pk.doseDrugs && this.batchNumber.equals(pk.batchNumber)) {
                return true;
            }
        }

        return false;
    }

    @Override
    public String toString() {
        return "PublicTransport (BatchNumber=" +
                batchNumber + ", DoseDrugs=" + doseDrugs + ", " + super.toString() + ")";
    }

    @Override
   public void printUsedFor() {
       System.out.println("for kids");
   }

}
