/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mcm;
import javax.swing.JOptionPane;
/**
 *
 * @author DiegoN
 */
public class MCM {

    /**
     * @param args the command line arguments
     */
    public static void main(String [] args)  {
        int n1, n2;
        int maximo;
        int i;
 
        n1 = Integer.parseInt(JOptionPane.showInputDialog("digite primer numero"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("digite segundo numero"));
  
 
        maximo = n1;
 
        if ( n2 > maximo )
            maximo = n2;
 
     
 
        // Solo queda buscar a partir de ese valor
        i = maximo;
        while ((i % n1 != 0) || (i % n2 != 0) )
            i++;
 
        JOptionPane.showMessageDialog(null,"El minimo comun multiplo entre los dos  es " + i );
    }
    
}
