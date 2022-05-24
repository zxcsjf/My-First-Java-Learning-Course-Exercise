package com.HomeWork50.OOPMortgage;

public abstract class UIControl {
    private boolean isEnabled = false;

    public UIControl(boolean isEnabled) {
        this.isEnabled = isEnabled;
        System.out.println("UIControl.");
    }

    // Polymorphism 多态，多形式。父类定义空的方法，子类完善override
    public abstract void render();

    public void enable(){
        isEnabled = true;
    }

    public void disable(){
        isEnabled = false;
    }


    public boolean isEnabled() {
        return isEnabled;
    }
}
