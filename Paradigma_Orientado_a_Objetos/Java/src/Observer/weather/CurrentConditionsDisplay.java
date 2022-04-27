/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Observer.weather;
public class CurrentConditionsDisplay implements ObserverInterface, DisplayElement {
  private float temperature;
  private float humidity;
  private Subject weatherData;
  
  public CurrentConditionsDisplay(Subject weatherData) {
    this.weatherData = weatherData;
    weatherData.registerObserver( this);
  }
  
  public void update(float temperature, float humidity, float pressure) {
    this.temperature = temperature;
    this.humidity = humidity;
    display(); // Not very good to call display() inside of update(). See MVC
  }
  
  public void display() {
    System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
  }
}