package is.ru.helloworld;

import static spark.Spark.*;
import spark.*;


public class HelloWorld {

    public static void main(String[] args) {
    	final World world = new World();
        get(new Route("/") {
            @Override
            public Object handle(Request request, Response response) {
                return world.greet();
            }
        });
    }

}

