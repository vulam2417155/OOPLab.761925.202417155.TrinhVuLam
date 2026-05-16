package project.hust.soict.dsai.aims.screen.manager;

import java.awt.*;
import javax.swing.*;
import project.hust.soict.dsai.aims.store.Store;

public class AddItemToStoreScreen extends JFrame {
    protected Store store;
    protected StoreManagerScreen storeManagerScreen;
    protected JPanel panel;

    public AddItemToStoreScreen(Store store, StoreManagerScreen storeManagerScreen) {
        this.store = store;
        this.storeManagerScreen = storeManagerScreen;

        panel = new JPanel(new GridLayout(0, 2, 5, 5));

        Container cp = getContentPane();
        cp.setLayout(new BorderLayout());
        cp.add(panel, BorderLayout.CENTER);

        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    protected void refreshStore() {
        storeManagerScreen.getContentPane().removeAll();
        Container cp = storeManagerScreen.getContentPane();
        cp.setLayout(new BorderLayout());
        cp.add(storeManagerScreen.createNorth(), BorderLayout.NORTH);
        cp.add(storeManagerScreen.createCenter(), BorderLayout.CENTER);
        storeManagerScreen.revalidate();
        storeManagerScreen.repaint();
        this.dispose();
    }
}