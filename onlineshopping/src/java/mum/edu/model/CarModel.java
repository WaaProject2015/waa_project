
package mum.edu.model;

import java.util.ArrayList;
import java.util.List;

public class CarModel {
    private List<String> models=new ArrayList();
    public CarModel(){
    models.add("toyota");
    models.add("acura");
    models.add("ford");
    models.add("infiniti");
    } 
   
    public static List<String> retrieveModel() {
       return new CarModel().models;
    }
}
