package hust.soict.hedspi.aims.screen.manager;

import hust.soict.hedspi.aims.media.CompactDisc;
import hust.soict.hedspi.aims.store.Store;

import javax.swing.*;

public class AddCompactDiscToStoreScreen extends AddItemToStoreScreen {
    private static final long serialVersionUID = 1L;
    private JTextField tfArtist;

    public AddCompactDiscToStoreScreen(Store store) {
        super(store);
        setTitle("Add CD to Store");

        // Lấy inputPanel từ createCenter() và thêm trường "Artist"
        JPanel center = (JPanel) getContentPane().getComponent(1);
        JPanel inputPanel = (JPanel) center.getComponent(0); // inputPanel là thành phần đầu tiên trong BorderLayout.CENTER

        inputPanel.add(new JLabel("Artist:"));
        tfArtist = new JTextField(20);
        inputPanel.add(tfArtist);
    }

    @Override
    protected void addMediaToStore() {
        String title = tfTitle.getText();
        String category = tfCategory.getText();
        String artist = tfArtist.getText();
        float cost;
        try {
            cost = Float.parseFloat(tfCost.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid cost format!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        CompactDisc cd = new CompactDisc(title, category, artist, cost);
        store.addMedia(cd);
        JOptionPane.showMessageDialog(this, "CD added successfully!");
    }
}