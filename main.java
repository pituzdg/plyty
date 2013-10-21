/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

/**
 *
 * @author pituzdg
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CD cd1 = new CD();
        cd1.setTitle("jabuszko");
        cd1.setYear(1990);
        AudioCD cd = new AudioCD();
        System.out.println(cd1);
    }
}
