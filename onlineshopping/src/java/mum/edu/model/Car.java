
package mum.edu.model;

public class Car {
    private String model;
    private String makeup;
    //private String milleage;
    private double price;

    public Car(String model, String makeup, double price) {
        this.model = model;
        this.makeup = makeup;
        this.price = price;
    }
   public static Car createCar(String model, String makeup, double price){
       return new Car(model,makeup,price);
   }
    
}
