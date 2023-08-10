/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package footballobserverdesign;

/**
 *
 * @author AreYouG
 */
public class ThaiTV implements MyObserver{

    @Override
    public void update(Source src) {
        System.out.println("ThaiTV report: " + ((Stadium)src).getLastResult()+" Krub");
    }
    
}
