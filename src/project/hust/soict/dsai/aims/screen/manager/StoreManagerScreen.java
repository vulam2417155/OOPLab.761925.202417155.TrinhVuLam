package project.hust.soict.dsai.aims.screen.manager;

import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;
import project.hust.soict.dsai.aims.media.Media;
import project.hust.soict.dsai.aims.store.Store;
import project.hust.soict.dsai.aims.disc.DigitalVideoDisc;
import project.hust.soict.dsai.aims.media.Book;
import project.hust.soict.dsai.aims.media.CompactDisc;

public class StoreManagerScreen extends JFrame {
    private Store store;

    public StoreManagerScreen(Store store) {
        this.store = store;

        Container cp = getContentPane();
        cp.setLayout(new BorderLayout());
        cp.add(createNorth(), BorderLayout.NORTH);
        cp.add(createCenter(), BorderLayout.CENTER);

        setTitle("Store");
        setSize(1024, 768);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    JPanel createNorth() {
        JPanel north = new JPanel();
        north.setLayout(new BoxLayout(north, BoxLayout.Y_AXIS));
        north.add(createMenuBar());
        north.add(createHeader());
        return north;
    }

    JMenuBar createMenuBar() {
        JMenu menu = new JMenu("Options");

        JMenuItem viewStore = new JMenuItem("View store");
        viewStore.addActionListener(e -> {
            getContentPane().removeAll();
            Container cp = getContentPane();
            cp.setLayout(new BorderLayout());
            cp.add(createNorth(), BorderLayout.NORTH);
            cp.add(createCenter(), BorderLayout.CENTER);
            revalidate();
            repaint();
        });
        menu.add(viewStore);

        JMenu smUpdateStore = new JMenu("Update Store");

        JMenuItem addBook = new JMenuItem("Add Book");
        addBook.addActionListener(e -> new AddBookToStoreScreen(store, this));

        JMenuItem addCD = new JMenuItem("Add CD");
        addCD.addActionListener(e -> new AddCompactDiscToStoreScreen(store, this));

        JMenuItem addDVD = new JMenuItem("Add DVD");
        addDVD.addActionListener(e -> new AddDigitalVideoDiscToStoreScreen(store, this));

        smUpdateStore.add(addBook);
        smUpdateStore.add(addCD);
        smUpdateStore.add(addDVD);
        menu.add(smUpdateStore);

        JMenuBar menuBar = new JMenuBar();
        menuBar.setLayout(new FlowLayout(FlowLayout.LEFT));
        menuBar.add(menu);

        return menuBar;
    }

    JPanel createHeader() {
        JPanel header = new JPanel();
        header.setLayout(new BoxLayout(header, BoxLayout.X_AXIS));

        JLabel title = new JLabel("AIMS");
        title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 50));
        title.setForeground(Color.CYAN);

        header.add(Box.createRigidArea(new Dimension(10, 10)));
        header.add(title);
        header.add(Box.createHorizontalGlue());
        header.add(Box.createRigidArea(new Dimension(10, 10)));

        return header;
    }

    JPanel createCenter() {
        JPanel center = new JPanel();
        center.setLayout(new GridLayout(3, 3, 2, 2));

        ArrayList<Media> mediaInStore = store.getItemsInStore();
        for (int i = 0; i < Math.min(9, mediaInStore.size()); i++) {
            MediaStore cell = new MediaStore(mediaInStore.get(i));
            center.add(cell);
        }

        return center;
    }

    public static void main(String[] args) {
        Store store = new Store();

        store.addMedia(new DigitalVideoDisc("Harry Potter 1",
                "Fantasy", "Chris Columbus", 152, 3.0f));
        store.addMedia(new DigitalVideoDisc("Harry Potter 2",
                "Fantasy", "Chris Columbus", 161, 3.5f));
        store.addMedia(new DigitalVideoDisc("Harry Potter 3",
                "Fantasy", "Alfonso Cuaron", 141, 5.0f));
        store.addMedia(new Book("The Hunger Games", "Fiction", 5.5f));
        store.addMedia(new Book("Catching Fire", "Fiction", 4.9f));
        store.addMedia(new Book("Mockingjay", "Fiction", 5.1f));

        new StoreManagerScreen(store);
    }
}