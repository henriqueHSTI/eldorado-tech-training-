package org.eldorado.week.two.designpattern.singleton;

public class Estoque {


    private Estoque() {

    }

    private static Estoque instance;

    public static Estoque getInstance() {
        if (instance == null) {
            synchronized (Estoque.class) {
                if (instance == null) {
                    instance = new Estoque();
                }
            }
        }
        return instance;
    }
}