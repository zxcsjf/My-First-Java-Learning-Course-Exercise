package com.OOPMortgage;

public class CheckBox extends UIControl {
    public CheckBox(boolean isEnabled) {
        super(isEnabled);
    }

    // Polymorphism
    @Override
    public void render() {
        System.out.println("CheckBox render.");
    }
}
