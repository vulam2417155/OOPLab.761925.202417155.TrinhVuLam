package project;

public class TestDisc {
    public static void main(String[] args) {
        DigitalVideoDisc d1 = new DigitalVideoDisc("A");
        DigitalVideoDisc d2 = new DigitalVideoDisc("B");
        DigitalVideoDisc d3 = new DigitalVideoDisc("C");

        System.out.println("DVD 1 ID: " + d1.getId());
        System.out.println("DVD 2 ID: " + d2.getId());
        System.out.println("DVD 3 ID: " + d3.getId());
    }
}