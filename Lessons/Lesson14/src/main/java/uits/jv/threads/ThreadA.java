
package uits.jv.threads;

public class ThreadA extends Thread implements Runnable{

    @Override
    public void run() {
        while (App.counter > 0){
             App.counter -= 10;
            System.out.println("ThreadA "+App.counter);
        }
       /**& for(int i = 0; i < 10; i++){
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadA.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("ThreadA");
        }*/
    }
    
}


