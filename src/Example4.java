
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.Border;

public class Example4 implements ActionListener {
    private JFrame mainFrame;
    private JLabel statusLabel;
    private JPanel controlPanel;
    private JMenuBar mb;
    private JMenu file, edit, help;
    private JMenuItem cut, copy, paste, selectAll;
    private JTextArea ta; //typing area
    private int WIDTH=800;
    private int HEIGHT=700;


    public Example4() {
        prepareGUI();
    }

    public static void main(String[] args) {
        Example4 example4 = new Example4();
        example4.showEventDemo();
    }

    private void prepareGUI() {
        mainFrame = new JFrame("Belal Learning SWING");
        mainFrame.setSize(WIDTH, HEIGHT);
        mainFrame.setLayout(new GridLayout(3,3));


        //menu at top
        cut = new JMenuItem("cut");
        copy = new JMenuItem("copy");
        paste = new JMenuItem("paste");
        selectAll = new JMenuItem("selectAll");
        cut.addActionListener(this);
        copy.addActionListener(this);
        paste.addActionListener(this);
        selectAll.addActionListener(this);


        //end menu at top



        statusLabel = new JLabel("",JLabel.CENTER);
        statusLabel.setSize(350, 100);

        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
        controlPanel = new JPanel();
        controlPanel.setLayout(new BorderLayout()); //set the layout of the pannel

        mainFrame.add(controlPanel);
        //mainFrame.add(statusLabel);
        mainFrame.setVisible(true);
    }

    private void showEventDemo() {
        JButton FreeButton = new JButton("Free");
        JButton okButton = new JButton("OK");
        JLabel submitLabel = new JLabel("Submit");
        JButton cancelButton = new JButton("Cancel");
        JButton tickaButton = new JButton("ticka");
        JButton LButton = new JButton("L");
        JButton snoozeButton = new JButton("snooze");
        JButton stopButton = new JButton("stop");
        JButton upButton = new JButton("up");
        JButton downButton = new JButton("down");
        JButton rightButton = new JButton("right");

        okButton.setActionCommand("OK");

        cancelButton.setActionCommand("Cancel");


        mainFrame.add(FreeButton);
        mainFrame.add(LButton);
        controlPanel.add(submitLabel , BorderLayout.CENTER);
        mainFrame.add(okButton);
        mainFrame.add(tickaButton);
        mainFrame.add(controlPanel);
        mainFrame.add(cancelButton);
        mainFrame.add(snoozeButton);
        mainFrame.add(stopButton);
        mainFrame.add(upButton);
        controlPanel.add(downButton, BorderLayout.SOUTH);
        controlPanel.add(rightButton, BorderLayout.EAST);



        mainFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == cut)
            ta.cut();
        if (e.getSource() == paste)
            ta.paste();
        if (e.getSource() == copy)
            ta.copy();
        if (e.getSource() == selectAll)
            ta.selectAll();
    }


}
