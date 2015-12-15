
package mum.edu.model;

public class Cloth {
    private String size;
    private String section;
    //private String milleage;
    private double price;

    public Cloth(String size, String section, double price) {
        this.size=size;
        this.section = section;
        this.price = price;
    }
      public static Cloth createCloth(String size, String section, double price){
       return new Cloth(size,section,price);
   }
}
