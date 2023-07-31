package aaagt.structural.binaryfacade;

public class Main {

    public static void main(String[] args) {
        BinOps bins = new BinOps();
        System.out.println(bins.sum("10110", "1010"));//32
        System.out.println(bins.mult("10", "1010"));//20
    }
}
