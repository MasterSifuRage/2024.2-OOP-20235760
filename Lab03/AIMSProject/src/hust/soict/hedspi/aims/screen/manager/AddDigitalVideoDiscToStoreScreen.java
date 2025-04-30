package hust.soict.hedspi.aims.screen.manager;

import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.store.Store;

import javax.swing.*;

public class AddDigitalVideoDiscToStoreScreen extends AddItemToStoreScreen {
    private static final long serialVersionUID = 1L;
    private JTextField tfDirector;
    private JTextField tfLength;

    public AddDigitalVideoDiscToStoreScreen(Store store) {
        super(store);
        setTitle("Add DVD to Store");

        // Lấy inputPanel từ createCenter() và thêm các trường "Director" và "Length"
        JPanel center = (JPanel) getContentPane().getComponent(1);
        JPanel inputPanel = (JPanel) center.getComponent(0); // inputPanel là thành phần đầu tiên trong BorderLayout.CENTER

        inputPanel.add(new JLabel("Director:"));
        tfDirector = new JTextField(20);
        inputPanel.add(tfDirector);

        inputPanel.add(new JLabel("Length:"));
        tfLength = new JTextField(20);
        inputPanel.add(tfLength);
    }

    @Override
    protected void addMediaToStore() {
        String title = tfTitle.getText();
        String category = tfCategory.getText();
        String director = tfDirector.getText();
        int length;
        try {
            length = Integer.parseInt(tfLength.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid length format!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        float cost;
        try {
            cost = Float.parseFloat(tfCost.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid cost format!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        DigitalVideoDisc dvd = new DigitalVideoDisc(title, category, director, length, cost);
        store.addMedia(dvd);
        JOptionPane.showMessageDialog(this, "DVD added successfully!");
    }
}