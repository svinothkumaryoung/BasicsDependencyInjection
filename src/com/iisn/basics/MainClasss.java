package com.iisn.basics;

public class MainClasss {
    private InterAB interAB;

    public InterAB getInterAB() {
        return interAB;
    }

    public void setInterAB(InterAB interAB) {
        this.interAB = interAB;
    }
    public void printInformation()
    {
        this.interAB.getInfo();
        this.interAB.printInfo();
    }

    public static void main(String[] args) {
        MainClasss mc=new MainClasss();
        InterAB iab=new Staff();
        mc.setInterAB(iab);
        mc.printInformation();
    }
}
