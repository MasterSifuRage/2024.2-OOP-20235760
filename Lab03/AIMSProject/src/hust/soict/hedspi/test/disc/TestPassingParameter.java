package hust.soict.hedspi.test.disc;

import hust.soict.hedspi.aims.media.DigitalVideoDisc;

public class TestPassingParameter {
    public static void main(String[] args) {
        DigitalVideoDisc avengersDVD = new DigitalVideoDisc("The Avengers");
        DigitalVideoDisc batmanDVD = new DigitalVideoDisc("The Dark Knight");

        System.out.println("Before swap:");
        System.out.println("Avengers DVD title: " + avengersDVD.getTitle());
        System.out.println("Batman DVD title: " + batmanDVD.getTitle());

        swap(avengersDVD, batmanDVD);
        System.out.println("After swap:");
        System.out.println("Avengers DVD title: " + avengersDVD.getTitle());
        System.out.println("Batman DVD title: " + batmanDVD.getTitle());

        changeTitle(avengersDVD, batmanDVD.getTitle());
        System.out.println("After changeTitle:");
        System.out.println("Avengers DVD title: " + avengersDVD.getTitle());
    }

    public static void swap(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        String temp = dvd1.getTitle();
        dvd1.setTitle(dvd2.getTitle());
        dvd2.setTitle(temp);
    }

    public static void changeTitle(DigitalVideoDisc dvd, String title) {
        dvd.setTitle(title);
    }
}