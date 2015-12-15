
package mum.edu.model;

import java.util.ArrayList;
import java.util.List;

public class Category{
    private List<String> categories=new ArrayList();
    public Category(){
        categories.add("cloth");
        categories.add("car");
        categories.add("book");        
    }    
    public static List<String> retrieveCategoryNames() {
         return new Category().categories;  
        
    }
    
}
