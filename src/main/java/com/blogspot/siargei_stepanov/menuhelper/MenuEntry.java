package com.blogspot.siargei_stepanov.menuhelper;

/**
 * Created by Siarhei_Stsiapanau on 1/9/2015.
 */

public abstract class MenuEntry {
    private String title;

    public MenuEntry(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public abstract void run();
}
