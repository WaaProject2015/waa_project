
package mum.edu.model;

import java.util.ArrayList;
import java.util.List;

public class SizeConstants{
    private List<String> size=new ArrayList();
    public SizeConstants(){
    size.add("medium");
    size.add("large");
    size.add("small");
    } 
   
    public static List<String> retrieveSize() {
       return new SizeConstants().size;
    }
    
}
