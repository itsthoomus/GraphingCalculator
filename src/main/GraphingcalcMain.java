package main;

public class GraphingcalcMain {
        
        public static Thread GraphingcalcThread;
        
        public static void main(String[] args) {

                //this creates an error and runs the thread object that starts the GUI frame
                GraphingcalcThread= new Thread(new GraphingcalcThread());
                GraphingcalcThread.start();
        }

}
