package gsu;

public class Baa extends Medication {
    int doseBaa;

   @Override
   public void printUsedFor() {
        System.out.println("for adults");
    }
    Baa cloneBaa(){
       Baa clone = new Baa();
       clone.doseBaa = this.doseBaa;
       clone.Manufacturer = Manufacturer;
       return clone;
    }

}
