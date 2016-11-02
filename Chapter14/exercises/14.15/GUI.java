/*
 *       Filename:  GUI.java
 *
 *    Description:  Exercise 14.15 - Displaying Events
 *
 *        Created:  24/01/16 20:10:05
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import java.awt.BorderLayout;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.awt.Color;

import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.ListSelectionModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JList;
import javax.swing.JTextArea;

public class GUI extends JFrame implements KeyListener{
    private JPanel container;
    private JPanel centerPane;
    private JPanel mousePane;

    private JLabel mousePos;    // displays mouse pos
    private JLabel mouseBtn;    // displays mouse btn click
    private JTextArea centerInfo;
    private JButton btn1;
    private JCheckBox cb1;
    private JCheckBox cb2;
    private JList<String> list1;

    private static final String[] listItems = {
        "one", "two", "potato"
    };

    // CONSTRUCTOR
    public GUI(){
        super("Displaying Events");

        createElements();

        add(container);

        setFocusable(true);
        addKeyListener(this);

    }
    // construct gui
    public void createElements(){
        container = new JPanel(new BorderLayout(5, 5));
        mousePane = new JPanel();
        centerPane = new JPanel();

        // MOUSE EVENTS
        mousePos = new JLabel("");
        mouseBtn = new JLabel("");

        mousePane.add(mousePos);
        mousePane.add(mouseBtn);

        MouseHandler mHandler = new MouseHandler();
        container.addMouseListener(mHandler);
        container.addMouseMotionListener(mHandler);

        // CENTER PANE
        centerInfo = new JTextArea(20, 30);
        centerInfo.setLineWrap(true);
        centerInfo.setEditable(false);

        // BUTTON
        btn1 = new JButton("Press Me!");

        btn1.addActionListener(new ActionListener(){
            // handle button event
            public void actionPerformed(ActionEvent event){
                centerInfo.setText(event.toString());
            }
        });

        // CHECKBOXES
        cb1 = new JCheckBox("Check Box 1");
        cb2 = new JCheckBox("Check Box 2");

        CheckBoxHandler cbHandler = new CheckBoxHandler();
        cb1.addItemListener(cbHandler);
        cb2.addItemListener(cbHandler);

        // LIST
        list1 = new JList<>(listItems);
        list1.setVisibleRowCount(3);
        list1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        list1.addListSelectionListener(new ListSelectionListener(){
            // handle list event
            public void valueChanged(ListSelectionEvent event){
                centerInfo.setText(event.toString());
            }
        });

        // TEXTAREA
        centerPane.add(btn1);
        centerPane.add(cb1);
        centerPane.add(cb2);
        centerPane.add(list1);
        centerPane.add(centerInfo);

        container.add(centerPane, BorderLayout.CENTER);
        container.add(mousePane, BorderLayout.PAGE_END);
    }
    // MOUSE EVENTS
    private class MouseHandler implements MouseListener, MouseMotionListener{
        // mouseListener event handlers
        // handle event when user moves mouse
        public void mouseMoved(MouseEvent event){
            mousePos.setText(String.format("%d, %d", event.getX(), event.getY()));
        }
        // handle event when mouse clicked
        public void mouseClicked(MouseEvent event){
            if(event.isMetaDown())
                mouseBtn.setText("RMB clicked");
            else if(event.isAltDown())
                mouseBtn.setText("MMB clicked");
            else
                mouseBtn.setText("LMB clicked");
            centerInfo.setText(event.toString());
        }
        // handle event when mouse pressed
        public void mousePressed(MouseEvent event){
            if(event.isMetaDown())
                mouseBtn.setText("RMB pressed");
            else if(event.isAltDown())
                mouseBtn.setText("MMB pressed");
            else
                mouseBtn.setText("LMB pressed");
            centerInfo.setText(event.toString());
        }
        // handle event when mouse released
        public void mouseReleased(MouseEvent event){
            if(event.isMetaDown())
                mouseBtn.setText("RMB released");
            else if(event.isAltDown())
                mouseBtn.setText("MMB released");
            else
                mouseBtn.setText("LMB released");
            centerInfo.setText(event.toString());
        }
        // handle event when mouse dragged
        public void mouseDragged(MouseEvent event){
            if(event.isMetaDown())
                mouseBtn.setText("RMB dragged");
            else if(event.isAltDown())
                mouseBtn.setText("MMB dragged");
            else
                mouseBtn.setText("LMB dragged");
            mousePos.setText(String.format("%d, %d", event.getX(), event.getY()));
            centerInfo.setText(event.toString());
        }
        // handle event when mouse enters area
        public void mouseEntered(MouseEvent event){
            mousePos.setText(String.format("%d, %d", event.getX(), event.getY()));
        }
        // handle event when mouse exits area
        public void mouseExited(MouseEvent event){
            mousePos.setText("");
            mouseBtn.setText("");
        }
    }
    // CHECKBOX EVENTS
    private class CheckBoxHandler implements ItemListener{
        // respond to checkbox events
        public void itemStateChanged(ItemEvent event){
            centerInfo.setText(event.toString());
        }
    }
    // KEYPRESS EVENTS
    public void keyPressed(KeyEvent event){
        centerInfo.setText(event.toString());
    }
    public void keyReleased(KeyEvent event){
        centerInfo.setText(event.toString());
    }
    public void keyTyped(KeyEvent event){
        centerInfo.setText(event.toString());
    }
}
