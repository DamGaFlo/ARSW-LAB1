/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.threads;

/**
 *
 * @author hcadavid
 */
public class CountThreadsMain {
    private static final CountThread primerSegmento = new CountThread(0,99);
    private static final CountThread segundoSegmento = new CountThread(100,199);
    private static final CountThread tercerSegmento = new CountThread(200,299);

    public static void main(String a[]){

        primerSegmento.run();
        segundoSegmento.run();
        tercerSegmento.run();

        primerSegmento.start();
        segundoSegmento.start();
        tercerSegmento.start();

        
    }
    
}
