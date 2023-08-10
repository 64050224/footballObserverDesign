/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package footballobserverdesign;

/**
 *
 * @author AreYouG
 */
public class JapanTV implements MyObserver{
    @Override
    public void update(Source src) {
        System.out.println("JapanTV report: " + ((Stadium)src).getLastResult() + " Desu");
    }
}
