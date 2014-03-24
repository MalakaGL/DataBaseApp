/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewLayer;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class test extends JFrame implements ActionListener {

    JPanel panel;

    public test() {
        super("Add component on JFrame at runtime");
        setLayout(new BorderLayout());
        panel = new JPanel();
        panel.setLayout(new GridLayout(10,0));
        add(panel, BorderLayout.CENTER);
        JButton button = new JButton("CLICK HERE");
        add(button, BorderLayout.SOUTH);
        button.addActionListener(this);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent evt) {
        panel.add(new JTextField("Button"));
        panel.revalidate();
        validate();
    }

    public static void main(String[] args) {
        test acojfar = new test();
    }
}
