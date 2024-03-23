
public class FiatFactory extends CarFactory {
	public SedanCar buildSedanCar() {
        return new Siena();
    }
 
    public HatchCar buildHatchCar() {
        return new Palio();
    }
}
