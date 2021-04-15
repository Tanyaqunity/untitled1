package gsu;

public class Baacloning {
    public static void main(String[] args) {
        Baa originalBaa = new Baa();
        originalBaa.quantity = 45;
 //       originalBaa.setManufacturer("Belarus");
        originalBaa.doseBaa = 5;

        Baa cloneBaa = originalBaa.cloneBaa();
        System.out.println(cloneBaa.doseBaa);
        System.out.println(cloneBaa.Manufacturer);
        System.out.println(cloneBaa.quantity);






    }
}
