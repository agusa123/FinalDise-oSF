package org.yourcompany.yourproject;

public class Cliente implements Observer {

    private String nombre;

    @Override
    public void actualizar(String producto, int stock) {
        System.out.println("Se avisa al cliente " + nombre + " que se actualizo el stock del producto " + producto + " a: " + stock + " unidades");
    }

    public void setName(String name) {
        this.nombre = name;
    }

}
