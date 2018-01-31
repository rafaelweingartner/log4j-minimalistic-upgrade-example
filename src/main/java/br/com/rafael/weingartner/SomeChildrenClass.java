package br.com.rafael.weingartner;

public class SomeChildrenClass extends BaseClass {

    public void letsDoSomeLogging() {
        logger.info("Logging for: " + getClass().getSimpleName());
    }

}
