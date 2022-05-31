package MainPackage;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author A.Konnov <github.com/Odhinn3>
 */
public class Main {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //множество номеров
        Set<PhoneNumber> numberS = new HashSet<>();
        numberS.add(new PhoneNumber("9516643682"));
        numberS.add(new PhoneNumber("9516643681"));
        numberS.add(new PhoneNumber("9516643681"));//этот элемент не добавится

        //ассоциативный массив номеров 
        HashMap numberSlist = new HashMap<Long, String>();
        numberSlist.put(new PhoneNumber("9516643681"), "Mari-Liis");
        numberSlist.put(new PhoneNumber("9516643682"), "Tiina");
        numberSlist.put(new PhoneNumber("9516643683"), "Lembit");
        numberSlist.put(new PhoneNumber("9516643684"), "Jaan");
        numberSlist.put(new PhoneNumber("9516643681"), "Katre");//к номеру будет прикреплен другой владелец

        System.out.println(numberSlist);
        System.out.println(numberS);
        
    }
    
}
