import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Example5 implements ActionListener {
    private JFrame mainFrame;
    private JLabel statusLabel;
    private JPanel controlPanel;
    private JPanel composePanel;
    private JPanel blackPanel;
    private JPanel purplePanel;
    private JPanel redPanel;
    private JMenuBar mb;
    private JMenu file, edit, help;
    private JMenuItem cut, copy, paste, selectAll;
    private JTextArea ta; //typing area
    private int WIDTH=800;
    private int HEIGHT=700;


    public Example5() {
        prepareGUI();
    }

    public static void main(String[] args) {
        Example5 example5 = new Example5();
        example5.showEventDemo();
    }

    private void prepareGUI() {
        mainFrame = new JFrame("Belal Learning SWING");
        mainFrame.setSize(WIDTH, HEIGHT);
        mainFrame.setLayout(new BorderLayout(3, 3));

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

        ta = new JTextArea();
        ta.setBounds(50, 5, WIDTH-100, HEIGHT-50);


        statusLabel = new JLabel("Label", JLabel.CENTER);
        statusLabel.setSize(350, 100);

        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
        controlPanel = new JPanel();
        controlPanel.setLayout(new GridLayout(3,3)); //set the layout of the pannel
        composePanel=new JPanel();
        composePanel.setLayout(new GridLayout(2,1));
        blackPanel=new JPanel();
        blackPanel.setLayout(new GridLayout(1,2));
        purplePanel=new JPanel();
        purplePanel.setLayout(new GridLayout(2,13));
        purplePanel.add(ta);//add typing area
        redPanel= new JPanel();
        redPanel.setLayout(new GridLayout(1,8));



        //mainFrame.add(statusLabel);
        mainFrame.setVisible(true);
    }

    private void showEventDemo() {

        JLabel yellowLabel = new JLabel("yellow");
        JButton okButton = new JButton("OK");
        JLabel submitLabel = new JLabel("Submit");
        JButton cancelButton = new JButton("Cancel");
        JLabel treeLabel = new JLabel("tree");
        JButton VButton = new JButton("V");
        JLabel JBLabel = new JLabel("JB");
        JLabel electroLabel = new JLabel("electro");
        JButton ThomasButton = new JButton("Thomas");
        JButton costaButton = new JButton("Costa");
        JLabel ALabel = new JLabel("A");
        JLabel BLabel = new JLabel("B");
        JLabel CLabel = new JLabel("C");
        JLabel DLabel = new JLabel("D");
        JButton ZButton = new JButton("Z");
        JButton YButton = new JButton("Y");
        JButton XButton = new JButton("X");
        JButton WButton = new JButton("W");
        // JTextArea ta =new JTextArea("ta");
        okButton.setActionCommand("OK");
        //submitButton.setActionCommand("Submit");
        cancelButton.setActionCommand("Cancel");

        okButton.addActionListener(new ButtonClickListener());
        // submitButton.addActionListener(new ButtonClickListener());
        cancelButton.addActionListener(new ButtonClickListener());

        controlPanel.add(yellowLabel);
        controlPanel.add(VButton);
        controlPanel.add(submitLabel);
        controlPanel.add(okButton);
        //mainFrame.add(controlPanel);
        controlPanel.add(treeLabel);
//mainFrame.add(composepanel);

        controlPanel.add(cancelButton);
        controlPanel.add(JBLabel);
        controlPanel.add(electroLabel);
        controlPanel.add(ThomasButton);
        // mainFrame.add(winPanel);
        composePanel.add(electroLabel);
        composePanel.add(costaButton);


        blackPanel.add(controlPanel);
        blackPanel.add(composePanel);
        purplePanel.add(blackPanel);
        purplePanel.add(ta);

        redPanel.add(ALabel);
        redPanel.add(ZButton);
        redPanel.add(BLabel);
        redPanel.add(YButton);
        redPanel.add(CLabel);
        redPanel.add(XButton);
        redPanel.add(DLabel);
        redPanel.add(WButton);
        mainFrame.add(redPanel, BorderLayout.SOUTH);


        mainFrame.add(purplePanel);

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

    private class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();

            if (command.equals("OK")) {
                statusLabel.setText("Ok Button clicked.");
            } else if (command.equals("Submit")) {
                statusLabel.setText("Submit Button clicked.");
            } else {
                statusLabel.setText("Cancel Button clicked.");
            }
        }
    }
}

