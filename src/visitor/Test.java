package visitor;

public class Test {
    
    public static void main(String[] args) {
		IPad ipad=new IPad("Ipad Mini", "Apple");
		GalaxyTab galaxyTab =new GalaxyTab("Galaxy Tab", "Samsung");
		
		ipad.accept(new WifiVisitor());
		galaxyTab.accept(new ThreeGVisitor());

	}
   
}
