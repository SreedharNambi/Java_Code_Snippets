package collections;

import java.util.ArrayList;


public class MyArrayList{
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Sreedhar");
        list.add("Hari");
        list.add(1,"Shyam");
        System.out.println(list);

        ArrayList<String> newList = new ArrayList<String>();
        newList.addAll(list);
        System.out.println(newList);  

        newList.remove(1);
        System.out.println(newList);  

        newList.clear();
        System.out.println(newList);

        list.set(0, "Giri");
        System.out.println(list);  

        for(int i=0; i<list.size(); i++){
            System.out.println("the element : "+list.get(i));
        }    
        
        for(String element: list){
            System.out.println("the element : "+element);
        }
    }
}