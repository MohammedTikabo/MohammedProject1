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
}
