/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hsh.se3.client;

import java.util.Scanner;

/**
 *
 * @author mindau
 */
public class Main {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        ClientFactory factory = new ClientFactory();
        while (true) {
            System.out.print("Enter from 1 to "+factory.CLIENTS.size() +" ('z' to exit):");
            String str = scanner.nextLine();
            int input = Integer.parseInt(str);

            Client demo = factory.getClient(input);

            System.out.println("\n************** BEGIN " + factory.CLIENTS.get(input) + "DEMONSTRATION **************\n");

            demo.demonstrate();

            System.out.println("\n************** END " + factory.CLIENTS.get(input) + "DEMONSTRATION **************\n");

            if ("z".equalsIgnoreCase(str)) {
                System.out.println("Bye!");
                break;
            }
        }
    }
}
