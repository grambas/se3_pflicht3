/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hsh.se3.soap.client;


public class DiceRollerServiceClient {
    
    public void demonstrate() throws Exception {
        System.out.println("Rolling dice: " + rollDice());
        Thread.sleep(1000);
        System.out.println("Rolling dice: " + rollDice());
        Thread.sleep(1000);
        System.out.println("Rolling dice: " + rollDice());
        Thread.sleep(1000);
        System.out.println("Rolling dice: " + rollDice());
        Thread.sleep(1000);
        System.out.println("Rolling dice: " + rollDice());
    }
    
    public static void main(String[] args) throws Exception {
        DiceRollerServiceClient drsc = new DiceRollerServiceClient();
        drsc.demonstrate();
    }

    private static int rollDice() {
        de.hsh.se3.soap.client.generated.DiceRollerService_Service service = new de.hsh.se3.soap.client.generated.DiceRollerService_Service();
        de.hsh.se3.soap.client.generated.DiceRollerService port = service.getDiceRollerServicePort();
        return port.rollDice();
    }
 
}
