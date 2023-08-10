/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package footballobserverdesign;

import java.util.ArrayList;

/**
 *
 * @author AreYouG
 */
public class Stadium implements Source{
    private final ArrayList<MyObserver> list;
    private final ArrayList<String> data;
    
    public Stadium(){
        list = new ArrayList<>();
        data = new ArrayList<>();
    }
    
    public void updateResult(String result){
        data.add(result);
        notifyObserver();
    }
    
    public String getLastResult(){
        if (data.isEmpty()) {
            return null;
        }
        String top = data.get(data.size() - 1);
        return top;
    }

    @Override
    public void notifyObserver() {
        for(MyObserver obs: list){
            obs.update(this);
        }
    }

    @Override
    public void register(MyObserver obs) {
        list.add(obs);
    }
    
    
}
