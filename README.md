# MenuHelper
Now you can create simple 1-level menu very fast!

For example:

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
