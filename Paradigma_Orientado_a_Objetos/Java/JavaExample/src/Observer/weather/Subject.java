/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Observer.weather;

import java.util.Observer;
public interface Subject {
   public void registerObserver(Observer o);
  public void removeObserver(Observer o);
  public void notifyObservers();
}