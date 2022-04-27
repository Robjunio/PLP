/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Observer.weather;

public class ForecastDisplay implements ObserverInterface, DisplayElement {
  private float currentPressure = 29.92f;
  private float lastPressure;
  private Subject weatherData;
  
  public ForecastDisplay(Subject weatherData) {
    this.weatherData = weatherData;
    weatherData.registerObserver( this);
  }
  
  public void update(float temperature, float humidity, float pressure) {
    lastPressure = currentPressure;
    currentPressure = pressure;
    
    display();
  }
  
  public void display() {
    System.out.print("Forecast: ");
		if (currentPressure > lastPressure) {
			System.out.println("Improving weather on the way!");
		} else if (currentPressure == lastPressure) {
			System.out.println("More of the same");
		} else if (currentPressure < lastPressure) {
			System.out.println("Watch out for cooler, rainy weather");
		}
  }
}
