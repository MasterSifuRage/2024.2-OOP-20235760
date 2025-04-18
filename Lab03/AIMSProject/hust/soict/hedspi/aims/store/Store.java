package hust.soict.hedspi.aims.store;

import hust.soict.hedspi.aims.disc.DigitalVideoDisc;

public class Store {
    private DigitalVideoDisc[] itemsInStore = new DigitalVideoDisc[100];
    private int qtyInStore = 0;

    public void addDVD(DigitalVideoDisc disc) {
        if (qtyInStore < itemsInStore.length) {
            itemsInStore[qtyInStore++] = disc;
            System.out.println(disc.getTitle() + " added to store.");
        } else {
            System.out.println("Store is full!");
        }
    }

    public void removeDVD(DigitalVideoDisc disc) {
        int index = -1;
        for (int i = 0; i < qtyInStore; i++) {
            if (itemsInStore[i].equals(disc)) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            for (int i = index; i < qtyInStore - 1; i++) {
                itemsInStore[i] = itemsInStore[i + 1];
            }
            itemsInStore[qtyInStore - 1] = null;
            qtyInStore--;
            System.out.println(disc.getTitle() + " removed from store.");
        } else {
            System.out.println("DVD not found in store.");
        }
    }
}