/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fizz_buzz;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author daw108
 */
public class Clase_fizz_buzzTest {
    
    public Clase_fizz_buzzTest() {
    }

    @Test
    public void Numero1() {
        Clase_fizz_buzz fb = new Clase_fizz_buzz();
        String result = fb.getfizz_buzz(1);
        assertEquals("1",result);
    }

    @Test
    public void Numero2() {
        Clase_fizz_buzz fb = new Clase_fizz_buzz();
        String result = fb.getfizz_buzz(2);
        assertEquals("2",result);
    }

    @Test
    public void Multiplo3() {
        Clase_fizz_buzz fb = new Clase_fizz_buzz();
        String result = fb.getfizz_buzz(3);
        assertEquals("fizz",result);
    }
    
    @Test
    public void Multiplo5() {
        Clase_fizz_buzz fb = new Clase_fizz_buzz();
        String result = fb.getfizz_buzz(5);
        assertEquals("buzz",result);
    }
    
    @Test
    public void Multiplo53() {
        Clase_fizz_buzz fb = new Clase_fizz_buzz();
        String result = fb.getfizz_buzz(15);
        assertEquals("fizz buzz",result);
    }
    
    @Test
    public void testSomeMethod6() {
        Clase_fizz_buzz fb = new Clase_fizz_buzz();
        String result = fb.getfizz_buzz(25);
        assertEquals("buzz",result);
    }
    
    @Test
    public void Contiene3() {
        Clase_fizz_buzz fb = new Clase_fizz_buzz();
        String result = fb.getfizz_buzz(13);
        assertEquals("fizz",result);
    }

 
}
