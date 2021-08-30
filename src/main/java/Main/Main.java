/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import static java.awt.Frame.MAXIMIZED_BOTH;

/**
 *
 * @author qayin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Login tela = new Login();
        tela.setVisible(true);
        tela.setExtendedState(MAXIMIZED_BOTH);
    }
    
}
