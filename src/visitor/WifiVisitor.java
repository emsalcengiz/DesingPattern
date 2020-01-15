package visitor;

public class WifiVisitor implements IVisitor {
    @Override
	public void visit(Tablet tablet) {
            
		  if (tablet instanceof IPad)  
			System.out.println("IPad Wifi açýlýyor");
		  else if(tablet instanceof IPad) 
			System.out.println("GalaxyTab  Wifi bulunmamaktadýr...");
		  else
			  System.out.println("Bu nesne bir tablet deðil...");
			
		
	}
    
}
