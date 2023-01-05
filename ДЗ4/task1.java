package ДЗ4;

import java.util.LinkedList;

// 1. Пусть дан LinkedList с несколькими элементами. 
// Реализуйте метод, который вернет “перевернутый” список.

public class task1 {

    public static void main(String[] args) {

        int[] listMas = {5,6,2,5,7,3,9,13};
        LinkedList<Integer> linkList = new LinkedList<>();

        for (Integer temp : listMas) {
            linkList.add(temp);
        }
        
        int temp = 0;
        while (temp != linkList.size() - 1) {
            linkList.add(linkList.size()-temp, linkList.getFirst());
            linkList.removeFirst();
            temp++;
        }


        System.out.println("linkList = " + linkList);

        
    }
}