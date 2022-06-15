package MainPackage;

import LinkedLists.SLList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;


/**
 *
 * @author A.Konnov <github.com/Odhinn3>
 */
public class Main {
   
    public static void main(String[] args) throws CloneNotSupportedException {
        
        //part 1
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
        System.out.println(numberS + "\n" + "---");
        
        
        //part 2
        SLList<String> list = new SLList<>();
        list.addToFront("111");
        list.addToEnd("aaa");
        list.addToEnd("bbb");
        list.addToEnd("121");
        //list.print();
        list.addToEnd("127");

        //list.print();
        //list.typeSearch("121");
        //list.forEachPrintfromFirst(list, 121);
        list.forEachPrintfromAim(list, "111");
    } 
}
