package hust.soict.hedspi.aims.screen.manager;

import hust.soict.hedspi.aims.media.*;
import hust.soict.hedspi.aims.store.Store;

import javax.swing.*;
import java.awt.*;

public class MediaStore extends JPanel {
    private Media media;
    private Store store;
    private StoreManagerScreen screen;

    public MediaStore(Media media, Store store, StoreManagerScreen screen) {
        this.media = media;
        this.store = store;
        this.screen = screen;
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        JLabel title = new JLabel(media.getTitle());
        title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 15));
        title.setAlignmentX(CENTER_ALIGNMENT);

        JLabel cost = new JLabel("" + media.getCost() + " $");
        cost.setAlignmentX(CENTER_ALIGNMENT);

        JPanel container = new JPanel();
        container.setLayout(new FlowLayout(FlowLayout.CENTER));

        if (media instanceof Playable) {
            JButton playButton = new JButton("Play");
            playButton.addActionListener(e -> {
                JDialog playDialog = new JDialog();
                playDialog.setTitle("Playing Media");
                JTextArea playArea = new JTextArea();
                playArea.setEditable(false);
                String playMessage = ((Playable) media).play(); // Gọi play() để lấy chuỗi
                playArea.setText(playMessage);
                playDialog.add(playArea);
                playDialog.setSize(300, 200);
                playDialog.setLocationRelativeTo(null);
                playDialog.setVisible(true);
            });
            container.add(playButton);
        }

        JButton removeButton = new JButton("Remove");
        removeButton.addActionListener(e -> {
            int confirm = JOptionPane.showConfirmDialog(
                this,
                "Are you sure you want to remove " + media.getTitle() + "?",
                "Confirm Remove",
                JOptionPane.YES_NO_OPTION
            );
            if (confirm == JOptionPane.YES_OPTION) {
                store.removeMedia(media);
                screen.refreshCenter();
                JOptionPane.showMessageDialog(this, media.getTitle() + " has been removed.", "Success", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        container.add(removeButton);

        this.add(Box.createVerticalGlue());
        this.add(title);
        this.add(cost);
        this.add(Box.createVerticalGlue());
        this.add(container);
        this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
    }
}