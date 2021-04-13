package gsu;

public class Drugs extends Medication {
    private final String BatchNumber;
    public static int DrugsCounter;
   int DoseDrugs;

    public Drugs(String BatchNumber) {
        super();
    }

    public Drugs(String BatchNumber) {
        this.BatchNumber = BatchNumber;
        System.out.println("Drugs constructor");
        DrugsCounter++;
    }
    public Drugs(String BatchNumber, int DoseDrugs) {
        super(BatchNumber);
        this.BatchNumber = BatchNumber;
        this.doseDrugs = DoseDrugs;
        System.out.println("Drugs constructor with parameters");
    }

    public String getBatchNumber() {
        return BatchNumber;
    }

    public int getDoseDrugs() {
        return DoseDrugs;
    }

    public Drugs() {
    }

    public void setDoseDrugs(int DoseDrugs) {
        this.DoseDrugs = DoseDrugs;
    }

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
            if (this.DoseDrugs == pk.DoseDrugs && this.BatchNumber.equals(pk.BatchNumber)) {
                return true;
            }
        }

        return false;
    }

    @Override
    public String toString() {
        return "PublicTransport (BatchNumber=" +
                BatchNumber + ", DoseDrugs=" + DoseDrugs + ", " + super.toString() + ")";
    }

    @Override
   public void printUsedFor() {
       System.out.println("for kids");
   }

}
