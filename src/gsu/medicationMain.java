package gsu;

public class medicationMain {
    public static void main(String[] args) {
        medication a1 = new medication();
        medication a2 = new medication();
        medication a3 = new medication();

        medication[] array = new medication[3];
        array[0] = a1;
        array[1] = a2;
        array[2] = a3;

        a1.manufacturer = "China";
        a1.quantity = 70;

        System.out.println(a1.manufacturer);
        System.out.println(a1.quantity);
        System.out.println(a2.manufacturer);
        System.out.println(a2.quantity);

        baa baa1 = new baa();
        baa1.manufacturer = "USA";
        baa1.quantity = 60;
        baa1.dosebaa = 9;

        baa1.usedfor();

        drugs drugs1 = new drugs();
        drugs1.quantity = 40;
        drugs1.dosedrugs = 3;

        int a1recommendeddose = a1.recommendeddose();
        System.out.println(a1recommendeddose);



    }
}
