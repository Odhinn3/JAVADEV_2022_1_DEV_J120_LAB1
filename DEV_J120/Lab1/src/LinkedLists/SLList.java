package LinkedLists;


import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;


public class SLList<T> implements Iterable<T>{//реализация односвязного списка 
    
    private Node<T> head;//первый элемент списка

    public SLList() {//конструктор по умолчанию
    }

    public SLList(Node head) {
        this.head = head;
    }
  
    public void isEmpty(){//проверка списка на пустоту
        if (head == null){
            System.out.println("Single linked list is empty");
        } else {
        System.out.println("Single linked list is not empty");
        }
    }
  
    public void addToEnd (T data){//добавление элемента в конец списка
        Node node = new Node (data);
        if (head == null) {
            head = node;
            return;
        }
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = node;
    }
    
    public void addToFront (T data){//добавление элемента в начало списка
        Node temp = new Node (data);
        temp.next = head;
        head = temp;      
    }
    
    public Node getFirstNode (){//извлечение первого элемента без удаления
        System.out.println("First node = " + head.data);
        return head;
    }
    
    public void removeFirst(){//удаление первого элемента
        head = head.next;
    }
    
    public Node getLastNode (){//извлечение последнего элемента без удаления
        Node temp = head;
        while (temp.next != null)
            temp = temp.next;
        return temp;
    }
    
    public void removeLast(){//удаление последнего элемента
        Node temp = head;
        Node tempNext = head;
        if (head.next != null)
            tempNext = head.next;   
        while (tempNext.next != null) {
            temp = temp.next;
            tempNext = tempNext.next;
            }
        temp.next = null;
    }
    
    public void print(){//вывод на печать содержимого списка
        Node temp = head;
        while (temp != null) {
            System.out.println("Data = " + temp.data);
            temp = temp.next;
        }
    }
    
    public Node typeSearch(T data1){//извлечение значения заданного типа
        Node temp = head;
        int i = 0;
        while (temp != null){
            if (Objects.equals(temp.data, data1)){
                System.out.println("Заданный элемент на позиции " + i);
                return temp;
            } else {
                i++;
                System.out.println("Перебираем коллекцию...");
                temp = temp.next;
            }
        }
        System.out.println("Элемента заданного типа нет в списке");
        return null;    
    }
    
    public void forEachPrint(SLList<T> list){//перебор списка через for-each
        int i1 = 0;
        for (T t : list ){
            System.out.println("Элемент №" + i1 + " : " + t + ", "+ t.getClass());
            i1++;
        }
    }
    
    public void forEachPrintfromFirst(SLList<T> list, T aim){//перебор списка через for-each от головы до заданного значения
        int i1 = 0;
        for (T t : list ){
            if(t != aim){
                System.out.println("Элемент №" + i1 + " : " + t);
                i1++;
            } else {
                System.out.println("Заданный элемент в списке под номером " + i1);
                break;
            }
        }
    }
    
    public void forEachPrintfromAim(SLList<T> list, T aim){//перебор списка через for-each от заданного значения
        SLList<T> temp = new SLList<>();
        for (T t: list){
            temp.addToEnd(t);
        }
        Node tmp = temp.head;
        while (tmp.data != aim){
            temp.removeFirst();
            tmp = tmp.next;
        }
        for (T t: temp) {
            System.out.println(t);
        }

    }

    @Override
    public Iterator<T> iterator() {
        return new MyIterator<T>(head);
    }

    private static class MyIterator<T> implements Iterator<T>{
        
        Node hasNode;

        public MyIterator(Node hasNode) {
            this.hasNode = hasNode;
        }

        @Override
        public boolean hasNext() {
            return hasNode != null;
        }

        @Override
        public T next() {
            if (hasNode == null) throw new NoSuchElementException();
            T res = (T)hasNode.data;
            hasNode = hasNode.next;
            return res;
        }
    }
    
    

}