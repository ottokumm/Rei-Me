/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javatest;
/**
 *
 * @author rei
 */
class Mass {
    Mass(){
    System.out.println("Echo array content");
    }
    public void simpleMassEcho(int[] arr){
      int i;
        for (i=0; i<arr.length;i++) {
            System.out.println(arr[i]);
        } 
    }
   }
public class JavaTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[]f= {8,11,10,12};
        Mass m= new Mass();
        m.simpleMassEcho(f);
    }
}
