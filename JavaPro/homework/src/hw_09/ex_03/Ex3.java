package hw_09.ex_03;

import java.util.ArrayList;

public class Ex3 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(3);
        arrayList.add(5);
        arrayList.add(45);
        arrayList.add(45);
        arrayList.add(76);
        arrayList.add(65);
        arrayList.add(21342);
        arrayList.add(6);
        arrayList.add(343);
        arrayList.add(1);
        arrayList.add(658);
        arrayList.add(1);
        arrayList.add(5);
        arrayList.add(5);
        arrayList.add(21342);
        System.out.println(findUnique(arrayList));
    }
    public static ArrayList<Integer> findUnique(ArrayList<Integer> list) {
        ArrayList<Integer> list1 = new ArrayList<>();
        for(int al : list) {
            if (list1.contains(al) == false){
                list1.add(al);
            }
        }
        return list1;
    }
}

