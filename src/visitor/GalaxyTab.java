package visitor;

public class GalaxyTab extends Tablet {
    
    public GalaxyTab(String model,String brand){
        super(model,brand);
    
    }
    @Override
    public void accept(IVisitor visitor){
        visitor.visit(this);
    
    }
     
}
