package com.HomeWork50.OOPMortgage;

public class TextBox extends UIControl {
    private String text;

    public TextBox() {
        super(true);
        System.out.println("TextBox.");
    }

    // Polymorphism
    @Override
    public void render() {
        System.out.println("TextBox render.");
    }

    @Override
    public String toString(){
        return text;
    }
    public void setText(String text){
        this.text = text;
    }

    public void clear(){
        this.text = "";
    }
}
