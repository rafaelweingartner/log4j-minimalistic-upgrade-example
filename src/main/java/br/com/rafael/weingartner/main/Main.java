package br.com.rafael.weingartner.main;

import br.com.rafael.weingartner.SomeChildrenClass;
import br.com.rafael.weingartner.SomeChildrenOfChildrenClass;

public class Main {

    public static void main(String[] args) {
        new SomeChildrenClass().letsDoSomeLogging();
        new SomeChildrenOfChildrenClass().letsDoSomeLogging();
    }
}