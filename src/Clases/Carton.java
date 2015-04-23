package Clases;

import Interfaces.Marked;

import java.sql.Array;
import java.util.ArrayList;

public class Carton implements Marked {

    ArrayList<ArrayList<Integer>> carton = new ArrayList<ArrayList<Integer>>(3);

    public Carton(){

    }

    @Override
    public boolean isMarked() {
        return false;
    }
}
