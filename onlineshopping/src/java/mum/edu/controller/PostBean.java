
package mum.edu.controller;


import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.faces.event.AjaxBehaviorEvent;
import javax.inject.Named;
import mum.edu.model.CarModel;
import mum.edu.model.Category;
import mum.edu.model.IcreateObjects;
import mum.edu.model.Sellers;
import mum.edu.model.SizeConstants;
@Named
@SessionScoped
public class PostBean implements Serializable{    
    private String category;
    private String itemName;
    private String author;
    private String makeup;
    private String size;
    private double price;
    private String photoName; 
    private String selectedCategory;
    private String selectedSize;
     private String selectedModel;
    private String label;
    private List<String> categories=Category.retrieveCategoryNames();   
    private List<String> sizeOrModel=SizeConstants.retrieveSize();
    private IcreateObjects seller=new Sellers();
    private boolean renderSize=true;
    private boolean authorOn=false;
    
    public String processPost(){  
       if(selectedCategory.equals("cloth") ||selectedCategory.equals("car")){
        setRenderSize(true);
        if(label.equals("model")){
        seller.createCar(selectedModel,itemName,price);
        }
       }
        return "thanks?faces-redirect=true";
    }
    public void isCloth(AjaxBehaviorEvent e){
        if(selectedCategory.equals("cloth")){
            label="Size:";
            itemName="Section:";
            sizeOrModel=SizeConstants.retrieveSize();
            setRenderSize(true);
            setAuthorOn(false);
        }
        else if(selectedCategory.equals("car")){
            label="Model:";
            itemName="Makeup:";
            sizeOrModel=CarModel.retrieveModel();
            setRenderSize(true);
            setAuthorOn(false);
        }
        else if(selectedCategory.equals("book")){
            setRenderSize(false);
            label="Title:";
            itemName="Author:";
            setAuthorOn(true);
        }
    }
    
    //Getters and Setter
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setPhotoName(String photoName) {
        this.photoName = photoName;
    }

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public String getPhotoName() {
        return photoName;
    }   

    public void setCategory(String category) {
        this.category = category;
    }  
           

    /**
     * @return the categories
     */
    public List<String> getCategories() {
        return categories;
    }

    /**
     * @param categories the categories to set
     */
    public void setCategories(List<String> categories) {
        this.categories = categories;
    }

    /**
     * @return the category
     */
    public String getCategory() {
        return category;
    }

    /**
     * @return the selectedCategory
     */
    public String getSelectedCategory() {
        return selectedCategory;
    }

    /**
     * @param selectedCategory the selectedCategory to set
     */
    public void setSelectedCategory(String selectedCategory) {
        this.selectedCategory = selectedCategory;
    }

    /**
     * @return the size
     */
    public String getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(String size) {
        this.size = size;
    }

    /**
     * @return the selectedSize
     */
    public String getSelectedSize() {
        return selectedSize;
    }

    /**
     * @param selectedSize the selectedSize to set
     */
    public void setSelectedSize(String selectedSize) {
        this.selectedSize = selectedSize;
    }

    /**
     * @return the sizeConstants
     */
    public List<String> getSizeOrModel() {
        return sizeOrModel;
    }

    /**
     * @param sizeConstants the sizeConstants to set
     */
    public void setSizeOrModel(List<String> sizeOrModel) {
        this.sizeOrModel = sizeOrModel;
    }

    /**
     * @return the renderSize
     */
    public boolean isRenderSize() {
        return renderSize;
    }

    /**
     * @param renderSize the renderSize to set
     */
    public void setRenderSize(boolean renderSize) {
        this.renderSize = renderSize;
    }

    /**
     * @return the label
     */
    public String getLabel() {
        return label;
    }

    /**
     * @param label the label to set
     */
    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * @return the author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * @param author the author to set
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * @return the makeup
     */
    public String getMakeup() {
        return makeup;
    }

    /**
     * @param makeup the makeup to set
     */
    public void setMakeup(String makeup) {
        this.makeup = makeup;
    }

    /**
     * @return the authorOn
     */
    public boolean isAuthorOn() {
        return authorOn;
    }

    /**
     * @param authorOn the authorOn to set
     */
    public void setAuthorOn(boolean authorOn) {
        this.authorOn = authorOn;
    }
    
    
}
