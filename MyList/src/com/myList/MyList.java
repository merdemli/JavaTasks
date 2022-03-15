package com.myList;

public class MyList<T> {                       //Generic bir class

    Object[] items;

    public MyList() {
        items = new Object[0];                                        //class new'lendiğinde ilk oluşturulan constructor'da
                                                                     //Object [], sıfır elemanlı oluşturulur
    }

    public void add(T entity) {

        Object[] tempArray = items;                             //temp array referans numarası tutuyor
        items = new Object[items.length + 1];                  // items arrayin eleman sayısı 1 arttırılır

        for (int i = 0; i < tempArray.length; i++) {          //tempArray'in tüm elemanları items'a geri atanır

            items[i] = tempArray[i];
        }
        items[items.length - 1] = entity;                  //yeni eklenen objenin, listeye eklenmesi
    }

    public int size() {                                  //listenin eleman sayısı
        return items.length;
    }

    public Object[] getItems() {       //elemanları

        for (Object item : items) {
            System.out.println(item);
        }
        return items;
    }

}
