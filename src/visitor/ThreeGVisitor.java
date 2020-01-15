package visitor;

public class ThreeGVisitor implements IVisitor {
    
    @Override
    public void visit(Tablet tablet){
        if (tablet  instanceof IPad) 
               System.out.println("IPad wifi 3G bulunmamaktadýr...");
        else if(tablet  instanceof GalaxyTab)
            System.out.println("GalaxyTab  3G ye sahip açýldý...");
        else
            System.out.println("Bu nesne bir tablet deðil...");
        
        
    }
    
}
