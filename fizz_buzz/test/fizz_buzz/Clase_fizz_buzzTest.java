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
    public void testSomeMethod1() {
        Clase_fizz_buzz fb = new Clase_fizz_buzz();
        String result = fb.getfizz_buzz(1);
        assertEquals("1",result);
    }
    @Test
    public void testSomeMethod2() {
        Clase_fizz_buzz fb = new Clase_fizz_buzz();
        String result = fb.getfizz_buzz(2);
        assertEquals("2",result);
    }
    public void testSomeMethod3() {
        Clase_fizz_buzz fb = new Clase_fizz_buzz();
        String result = fb.getfizz_buzz(3);
        assertEquals("fizz",result);
    }
    
}