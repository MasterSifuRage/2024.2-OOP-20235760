package hust.soict.hedspi.aims.store;

import hust.soict.hedspi.aims.media.Media;
import java.io.*;
import java.util.ArrayList;

public class Store implements Serializable {
    private static final long serialVersionUID = 1L;
    private ArrayList<Media> itemsInStore = new ArrayList<>();

    public ArrayList<Media> getItemsInStore() {
        return itemsInStore;
    }

    public void addMedia(Media media) {
        itemsInStore.add(media);
        saveToFile();
    }

    public void removeMedia(Media media) {
        itemsInStore.remove(media);
        saveToFile();
    }

    public void displayStore() {
        if (itemsInStore.isEmpty()) {
            System.out.println("The store is empty.");
        } else {
            System.out.println("Items in Store:");
            for (Media media : itemsInStore) {
                System.out.println(media.toString());
            }
        }
    }

    public void saveToFile() {
        try {
            File directory = new File("data");
            if (!directory.exists()) {
                directory.mkdirs();
            }
            try (FileOutputStream fos = new FileOutputStream("data/store.dat");
                 ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                oos.writeObject(this);
                File file = new File("data/store.dat");
                System.out.println("Saved store.dat at: " + file.getAbsolutePath());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Store loadFromFile() {
        try (FileInputStream fis = new FileInputStream("data/store.dat");
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            File file = new File("data/store.dat");
            System.out.println("Loaded store.dat from: " + file.getAbsolutePath());
            return (Store) ois.readObject();
        } catch (FileNotFoundException e) {
            return new Store();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return new Store();
        }
    }
}