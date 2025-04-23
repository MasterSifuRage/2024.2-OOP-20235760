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
        String temp = dvd1.getTitle();      // Lưu tiêu đề của dvd1
        dvd1.setTitle(dvd2.getTitle());     // Gán tiêu đề của dvd2 cho dvd1
        dvd2.setTitle(temp);                // Gán tiêu đề tạm cho dvd2
    }

    public static void changeTitle(DigitalVideoDisc dvd, String title) {
        dvd.setTitle(title);
    }
}