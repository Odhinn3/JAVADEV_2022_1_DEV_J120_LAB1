package MainPackage;

import java.util.*;

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
        Set<PhoneNumber> numbers = new HashSet<>();
        numbers.add(new PhoneNumber(9516643682l));
        numbers.add(new PhoneNumber(9516643683l));
        numbers.add(new PhoneNumber(9516643684l));
        
        //ассоциативный массив номеров 
        Map<PhoneNumber, String> numberslist = new HashMap<>();
        numberslist.put(new PhoneNumber(9516643681l), "Mari-Liis");
        numberslist.put(new PhoneNumber(9516643682l), "Tiina");
        numberslist.put(new PhoneNumber(9516643683l), "Lembit");
        numberslist.put(new PhoneNumber(9516643684l), "Jaan");
        numberslist.put(new PhoneNumber(9516643682l), "Katre");

        System.out.println(numberslist.keySet());
        
        
        System.out.println(numberslist);
        System.out.println(numbers);
        
    }
    
}
