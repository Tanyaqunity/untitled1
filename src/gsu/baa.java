package gsu;

public class baa extends medication {
    int dosebaa;

   @Override
   public void usedfor() {
        System.out.println("for adults");
    }
    baa clonebaa(){
       baa clone = new baa();
       clone.dosebaa = this.dosebaa;
       clone.manufacturer = manufacturer;
       return clone;
    }

}
