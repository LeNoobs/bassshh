package is.ru.helloworld;


import static org.junit.Assert.assertEquals;


import org.junit.Test;


public class WorldTest {


    @Test
    public void greetResultsInHello() {
        World world = new World();
        assertEquals("Hello wat world!", world.greet());
    }


}

