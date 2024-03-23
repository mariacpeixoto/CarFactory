
public class Client {
	public static void main(String[] args) {
		CarFactory factory;
		
		factory = new FiatFactory();
	    SedanCar sedan = factory.buildSedanCar();
	    HatchCar hatch = factory.buildHatchCar();
	    
	    System.out.println("*Carro Sedan*");
	    sedan.showSedanInformation();
	    System.out.println("\n*Carro Hatch*");
	    hatch.showHatchInformation();
	    
	 
	    factory = new VolksFactory();
	    sedan = factory.buildSedanCar();
	    hatch = factory.buildHatchCar();
	    
	    System.out.println("\n*Carro Sedan*");
	    sedan.showSedanInformation();
	    System.out.println("\n*Carro Hatch*");
	    hatch.showHatchInformation();
	}
}
