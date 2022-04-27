/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Observer.weather;

public class StatisticsDisplay implements ObserverInterface, DisplayElement {
  private float maxTemp = 0.0f;
  private float minTemp = 200;
  private float tempSum = 0.0f;
  private int numReadings;
  private Subject weatherData;
  
  public StatisticsDisplay(Subject weatherData) {
    this.weatherData = weatherData;
    weatherData.registerObserver(this);
  }
  
  public void update(float temperature, float humidity, float pressure) {
    tempSum += temperature;
    numReadings++;
    
    if (temperature > maxTemp) {
      maxTemp = temperature;
    }
    
    if (temperature < minTemp) {
      minTemp = temperature;
    }
    
    display();
  }
  
  public void display() {
    System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings) + "/" + maxTemp + "/" + minTemp);
  }
}