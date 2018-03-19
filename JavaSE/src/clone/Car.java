package clone;

import java.io.Serializable;

/**
 * ���л���¡����
 * 
 * @author Administrator
 *
 */
public class Car implements Serializable {
	private static final long serialVersionUID = -5713945027627603702L;

	private String brand; // Ʒ��
	private int maxSpeed; // ���ʱ��

	public Car(String brand, int maxSpeed) {
		this.brand = brand;
		this.maxSpeed = maxSpeed;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", maxSpeed=" + maxSpeed + "]";
	}
}
