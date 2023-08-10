/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package footballobserverdesign;

/**
 *
 * @author AreYouG
 */
public interface Source {
    public void notifyObserver();
    public void register(MyObserver obs);
}
