/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package org.yourcompany.yourproject;

/**
 *
 * @author agustin
 */
public class Final {

    public static void main(String[] args) {
        Tienda tienda = new Tienda();
        Cliente nacho = new Cliente();
        Cliente aguss = new Cliente();

        tienda.addObserver(nacho);
        tienda.addObserver(aguss);
        aguss.setName("Agustin");
        nacho.setName("Ignacio");

        tienda.setStock("Samsung galaxy", 45);
        tienda.setStock("Samsung galaxy", 20);

    }

}
