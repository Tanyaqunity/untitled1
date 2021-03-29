package gsu;

public class baacloning {
    public static void main(String[] args) {
        baa originalbaa = new baa();
        originalbaa.quantity = 45;
        originalbaa.setManufacturer("Belarus");
        originalbaa.dosebaa = 5;

        baa clonebaa = originalbaa.clonebaa();
        System.out.println(clonebaa.dosebaa);
        System.out.println(clonebaa.manufacturer);
        System.out.println(clonebaa.quantity);






    }
}
