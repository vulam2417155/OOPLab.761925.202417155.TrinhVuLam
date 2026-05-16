package project.hust.soict.dsai.aims.screen.manager;

import javax.swing.*;
import project.hust.soict.dsai.aims.media.Book;
import project.hust.soict.dsai.aims.store.Store;

public class AddBookToStoreScreen extends AddItemToStoreScreen {

    public AddBookToStoreScreen(Store store, StoreManagerScreen screen) {
        super(store, screen);
        setTitle("Add Book");

        JTextField tfTitle = new JTextField();
        JTextField tfCategory = new JTextField();
        JTextField tfCost = new JTextField();
        JTextField tfAuthor = new JTextField();

        panel.add(new JLabel("Title:"));
        panel.add(tfTitle);
        panel.add(new JLabel("Category:"));
        panel.add(tfCategory);
        panel.add(new JLabel("Cost:"));
        panel.add(tfCost);
        panel.add(new JLabel("Author:"));
        panel.add(tfAuthor);

        JButton btnAdd = new JButton("Add Book");
        btnAdd.addActionListener(e -> {
            String title = tfTitle.getText();
            String category = tfCategory.getText();
            float cost = Float.parseFloat(tfCost.getText());
            String author = tfAuthor.getText();

            Book book = new Book(title, category, cost);
            book.addAuthor(author);
            store.addMedia(book);
            refreshStore();
        });

        panel.add(new JLabel());
        panel.add(btnAdd);

        setVisible(true);
    }
}