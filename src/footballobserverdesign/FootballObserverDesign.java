/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package footballobserverdesign;

/**
 *
 * @author AreYouG
 */
import java.util.Scanner;
public class FootballObserverDesign {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Stadium stadium = new Stadium();
        JapanTV jpTV = new JapanTV();
        ThaiTV sevenColorTV = new ThaiTV();
        stadium.register(jpTV);
        stadium.register(sevenColorTV);
        
        String result;
        while(true){
            System.out.println("Enter match score/result <submit no-input to end>: ");
            result = sc.nextLine();
            if(result.length() == 0){
                break;
            }else{
                stadium.updateResult(result);
            }
        }
        
        sc.close();
    }
    
}
