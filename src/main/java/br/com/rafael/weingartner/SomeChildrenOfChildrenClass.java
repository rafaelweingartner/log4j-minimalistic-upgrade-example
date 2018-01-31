package br.com.rafael.weingartner;

public class SomeChildrenOfChildrenClass extends SomeChildrenClass {

    public void letsDoSomeLogging() {
        super.letsDoSomeLogging();
        logger.debug("Debug log for: " + getClass().getSimpleName());
    }

}
