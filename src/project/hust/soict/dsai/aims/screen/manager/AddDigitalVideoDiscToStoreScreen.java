package project.hust.soict.dsai.aims.screen.manager;

import javax.swing.*;
import project.hust.soict.dsai.aims.disc.DigitalVideoDisc;
import project.hust.soict.dsai.aims.store.Store;

public class AddDigitalVideoDiscToStoreScreen extends AddItemToStoreScreen {

    public AddDigitalVideoDiscToStoreScreen(Store store, StoreManagerScreen screen) {
        super(store, screen);
        setTitle("Add DVD");

        JTextField tfTitle = new JTextField();
        JTextField tfCategory = new JTextField();
        JTextField tfDirector = new JTextField();
        JTextField tfLength = new JTextField();
        JTextField tfCost = new JTextField();

        panel.add(new JLabel("Title:"));
        panel.add(tfTitle);
        panel.add(new JLabel("Category:"));
        panel.add(tfCategory);
        panel.add(new JLabel("Director:"));
        panel.add(tfDirector);
        panel.add(new JLabel("Length:"));
        panel.add(tfLength);
        panel.add(new JLabel("Cost:"));
        panel.add(tfCost);

        JButton btnAdd = new JButton("Add DVD");
        btnAdd.addActionListener(e -> {
            String title = tfTitle.getText();
            String category = tfCategory.getText();
            String director = tfDirector.getText();
            int length = Integer.parseInt(tfLength.getText());
            float cost = Float.parseFloat(tfCost.getText());

            DigitalVideoDisc dvd = new DigitalVideoDisc(
                    title, category, director, length, cost);
            store.addMedia(dvd);
            refreshStore();
        });

        panel.add(new JLabel());
        panel.add(btnAdd);

        setVisible(true);
    }
}