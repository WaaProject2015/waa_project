
package mum.edu.model;

import java.util.ArrayList;
import java.util.List;

public class Sellers implements IcreateObjects{
    private static List<Book> books=new ArrayList();
    private static List<Car> cars=new ArrayList();
    private static List<Cloth> clothes=new ArrayList();
    
  @Override
    public void createCar(String model,String makeup,double price){    
       cars.add(Car.createCar(model, makeup, price));
     
    }
  

    @Override
    public void createBook() {
        
    }

    @Override
    public void createCloth() {
        
    }
}
