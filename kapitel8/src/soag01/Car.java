package soag01;
/**
 * 
 * @author Sofia Ågren
 * @version 2019-10-23
 *
 */

public class Car {

	float fuel = 0.0f;		//i liter
	float length = 0.0f;	// mil
	float literMil = 0.0f;	//liter per mil
	
	public Car(float literMil) {
		this.literMil = literMil;
	}
	/**
	 * ger bränslenivån i liter
	 * @return liter bensin
	 */
	public float getGasLevel() {
		
		return fuel;
	}
	/**
	 * fyller bensin i bilen
	 * @param gas besin i liter
	 * @return hur mycket bensin efter på fyllning, i liter
	 */
	public float addGas(float gas) {
		this.fuel = this.fuel + gas; 
		return this.fuel;
	}
	public void drive(float distance) {
		length += distance;
		fuel -= distance*literMil;
	}
}
