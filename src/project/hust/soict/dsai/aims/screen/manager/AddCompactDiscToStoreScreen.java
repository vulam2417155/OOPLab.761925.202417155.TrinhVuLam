package project.hust.soict.dsai.aims.screen.manager;

import javax.swing.*;
import project.hust.soict.dsai.aims.media.CompactDisc;
import project.hust.soict.dsai.aims.store.Store;

public class AddCompactDiscToStoreScreen extends AddItemToStoreScreen {

    public AddCompactDiscToStoreScreen(Store store, StoreManagerScreen screen) {
        super(store, screen);
        setTitle("Add CD");

        JTextField tfTitle = new JTextField();
        JTextField tfCategory = new JTextField();
        JTextField tfArtist = new JTextField();
        JTextField tfDirector = new JTextField();
        JTextField tfCost = new JTextField();

        panel.add(new JLabel("Title:"));
        panel.add(tfTitle);
        panel.add(new JLabel("Category:"));
        panel.add(tfCategory);
        panel.add(new JLabel("Artist:"));
        panel.add(tfArtist);
        panel.add(new JLabel("Director:"));
        panel.add(tfDirector);
        panel.add(new JLabel("Cost:"));
        panel.add(tfCost);

        JButton btnAdd = new JButton("Add CD");
        btnAdd.addActionListener(e -> {
            String title = tfTitle.getText();
            String category = tfCategory.getText();
            String artist = tfArtist.getText();
            String director = tfDirector.getText();
            float cost = Float.parseFloat(tfCost.getText());

            CompactDisc cd = new CompactDisc(
                    title, category, artist, director, cost);
            store.addMedia(cd);
            refreshStore();
        });

        panel.add(new JLabel());
        panel.add(btnAdd);

        setVisible(true);
    }
}