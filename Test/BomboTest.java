import Clases.Bombo;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.LinkedList;

public class BomboTest {


    @Test
    public void devuelveNumeros(){
        Bombo bombo = new Bombo();

        Assert.assertTrue(bombo.getNumero() instanceof Integer);
    }

    @Test
    public void devuelveNumerosDentroDelRango(){
        Bombo bombo = new Bombo();
        int random = bombo.getNumero();
        boolean isBetween = random>0 && random<=90;
        Assert.assertEquals(isBetween, true);
    }

    @Test
    public void noSeRepite(){
        Bombo bombo = new Bombo();
        int count = 90;
        HashMap<Integer,Integer> lista = new HashMap<Integer,Integer>();
        for(int i=0; i<count ; i++){
            Integer num = bombo.getNumero();
            lista.put(num,num);
        }
        Assert.assertEquals(lista.size(), count);
    }


}
