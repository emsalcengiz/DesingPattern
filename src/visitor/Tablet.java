package visitor;

public abstract class Tablet {
    
    private String model;
    private String brand;
    
    public Tablet(String model,String brand){
        super();
        this.model=model;
        this.brand=brand;
             
    }
   
    public String getModel(){
        return model;
    }
    
    public void setModel(String model){
        this.model=model;
    }
    
    public String getBrand(){
    return brand;
    
    }
    
    public void setBrand(String brand){
        this.brand=brand;
    }
    
    public abstract void accept(IVisitor visitor);
    
}
