package com.blogspot.siargei_stepanov.menuhelper;

/**
 * Created by Siarhei_Stsiapanau on 1/10/2015.
 */
public class MenuExample {
    public void example(){
        Menu menu = new Menu();
        menu.addEntry(new MenuEntry("test1") {
            @Override
            public void run() {
                System.out.println("test1 run");
            }
        });
        menu.addEntry(new MenuEntry("test2") {
            @Override
            public void run() {
                System.out.println("test2 run");
            }
        });
        menu.run();
    }
}
