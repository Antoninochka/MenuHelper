package com.blogspot.siargei_stepanov.menuhelper;

public class App {
    public static void main(String[] args) {
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
