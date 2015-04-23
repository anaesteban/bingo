package Clases;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Bombo {
    private List list = new LinkedList<Integer>();

    public  Bombo (){
        for(int i =0; i<=90; i++){
            list.add(i);
        }
        Collections.shuffle(list);
    }

    public Integer getNumero(){
        return (Integer)list.remove(0);

    }

}
