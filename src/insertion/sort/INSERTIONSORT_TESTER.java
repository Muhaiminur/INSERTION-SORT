/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insertion.sort;

/**
 *
 * @author ITCLANBD
 */
public class INSERTIONSORT_TESTER {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Object[] b = {5, 7, 15, 20, 13};

        System.out.println("Insertion Sort Printing");
        INSERTION_SORT abir5 = new INSERTION_SORT();
        abir5.print(abir5.Insertionsort(b));

    }

}
