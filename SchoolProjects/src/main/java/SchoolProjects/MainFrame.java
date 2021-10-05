/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SchoolProjects;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JFrame;
/**
 *
 * @author man_e
 */
public class MainFrame extends JFrame{
    
    public MainFrame(){
        initUI();
    }
    
    private void initUI(){
        var quitButton = new JButton("Quit");
        var coords = new JLabel("");

        quitButton.addActionListener((event) -> System.exit(0));
        
        createLayout(quitButton);
        createLayout(coords);
        
        addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseMoved(MouseEvent e) {
                super.mouseMoved(e);
                
                int x = e.getX();
                int y = e.getY();
                var text = String.format("x: %d, y: %d", x, y);
                coords.setText(text);
            }
        });
        
        setSize(300,300);
        setTitle("Main Frame");
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    private void createLayout(JComponent... arg) {

        var pane = getContentPane();
        var gl = new GroupLayout(pane);
        pane.setLayout(gl);
        
        //so cria espaços entre componentes
        gl.setAutoCreateContainerGaps(true);

        gl.setHorizontalGroup(gl.createSequentialGroup()
                .addComponent(arg[0])
        );

        gl.setVerticalGroup(gl.createSequentialGroup()
                .addComponent(arg[0])
        );
    }

}
