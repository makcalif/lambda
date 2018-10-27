package com.thread;

public class AsyncCall {
    public static void main(String[] args) {


        Thread t = new Thread( () -> {

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                //e.printStackTrace();
            }
            System.out.println("in thread async") ;
        } );

        t.start();
        System.out.println("sync call");
    }
}
