package MainPackage;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
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
        numberS.add(new PhoneNumber(9516643682l));
        numberS.add(new PhoneNumber(9516643683l));
        numberS.add(new PhoneNumber(9516643684l));
        
        //ассоциативный массив номеров 
        HashMap numberSlist = new HashMap<Long, String>();
        numberSlist.put(new PhoneNumber(9516643681l), "Mari-Liis");
        numberSlist.put(new PhoneNumber(9516643682l), "Tiina");
        numberSlist.put(new PhoneNumber(9516643683l), "Lembit");
        numberSlist.put(new PhoneNumber(9516643684l), "Jaan");
        numberSlist.put(new PhoneNumber(9516643682l), "Katre");



        
        System.out.println(numberSlist);
        System.out.println(numberS);
        
    }
    
}
