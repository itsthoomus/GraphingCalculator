package main;

import javax.swing.*;

public class GraphingcalcThread implements Runnable {

        public GraphingcalcThread() {
                
        }
        
        public void run() {
                GraphingcalcFrame frame1 = new GraphingcalcFrame("Graphing Calculator");
                frame1.setSize(800,600);
                frame1.setVisible(true);
                frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
        
}
