package project.hust.soict.dsai.aims.screen.manager;

import java.awt.*;
import javax.swing.*;
import project.hust.soict.dsai.aims.media.Media;
import project.hust.soict.dsai.aims.media.Playable;

public class MediaStore extends JPanel {
    private Media media;

    public MediaStore(Media media) {
        this.media = media;
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
            container.add(playButton);

            playButton.addActionListener(e -> {
                JDialog dialog = new JDialog();
                dialog.setTitle("Playing: " + media.getTitle());
                dialog.setSize(300, 150);
                dialog.setLocationRelativeTo(null);
                JLabel info = new JLabel("<html>Playing: " + media.getTitle()
                    + "<br>Cost: " + media.getCost() + " $</html>");
                info.setHorizontalAlignment(JLabel.CENTER);
                dialog.add(info);
                dialog.setVisible(true);
            });
        }

        this.add(Box.createVerticalGlue());
        this.add(title);
        this.add(cost);
        this.add(Box.createVerticalGlue());
        this.add(container);

        this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
    }
}