/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Observer.weather;
public interface Subject {
  public void registerObserver(ObserverInterface o);
  public void removeObserver(ObserverInterface o);
  public void notifyObservers();
}