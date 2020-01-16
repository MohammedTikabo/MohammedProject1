import org.junit.jupiter.api.*;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigClassTest {

    @Test
    void testBigClassConstructor(){
        BigClass bc = new BigClass();

        assertEquals(null, bc.text);
        assertEquals(0, bc.number);

    }
    @Test
    void testBigClassConstructor1(){
        BigClass bc1 = new BigClass("Hi");

        assertEquals("Hi", bc1.text);
        assertEquals(0, bc1.number);

    }

    @Test
    void testBigClassConstructor2(){
        BigClass bc2 = new BigClass(2);

        assertEquals(null, bc2.text);
        assertEquals(2, bc2.number);

    }

    @Test
    void testBigClassConstructor3(){
        BigClass bc3 = new BigClass(2, "Hi");

        assertEquals("Hi", bc3.text);
        assertEquals(2, bc3.number);

    }

    @Test
    void testBigClassGnSN(){
        BigClass bc = new BigClass(0);
        BigClass bc1 = new BigClass(0, "test");

        bc.setNumber(-1);

        assertEquals(-1, bc.getNumber());
        assertEquals(0, bc1.getNumber());

    }

    @Test
    void testBigClassGnSS(){
        BigClass bc = new BigClass("test1");
        BigClass bc1 = new BigClass(0, "test2");
        assertEquals("test1", bc.getText());
        bc.setText("test5");

        assertEquals("test5", bc.getText());
        assertEquals("test2", bc1.getText());

    }
}
