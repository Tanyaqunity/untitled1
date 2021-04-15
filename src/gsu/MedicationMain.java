package gsu;

public class MedicationMain {
    public static void main(String[] args) {

        System.out.println(Medication.getMedicationCounter());

        Medication m1 = new Medication("L5487");
        String number1 = new String("L5487");
        Medication m2 = new Medication(number1);

        Medication a1 = new Medication();
        Medication a2 = new Medication();
        Medication a3 = new Medication();

        Medication[] array = new Medication[3];
        array[0] = a1;
        array[1] = a2;
        array[2] = a3;

        a1.Manufacturer = "China";
        a1.quantity = 70;

        System.out.println(a1.Manufacturer);
        System.out.println(a1.quantity);
        System.out.println(a2.Manufacturer);
        System.out.println(a2.quantity);

        Baa baa1 = new Baa();
        baa1.Manufacturer = "USA";
        baa1.quantity = 60;
        baa1.doseBaa = 9;

        baa1.printUsedFor();

        Drugs drugs1 = new Drugs();
        drugs1.quantity = 40;
        drugs1.doseDrugs = 3;

        int a1recommendedDose = a1.recommendedDose();
        System.out.println(a1recommendedDose);

        Drugs dr1 = new Drugs (
                "BatchNumber1", 45
        );

        Drugs dr2 = new Drugs("BatchNumber1",45 );
        dr2.setDoseDrugs(4);
        dr2.setBatchNumber("BatchNumber1");


        System.out.println(dr1.equals(dr2));

        System.out.println(m1);
        System.out.println(dr1);

        System.out.println(Medication.getMedicationCounter());
    }

}
