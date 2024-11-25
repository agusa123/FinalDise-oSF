package org.yourcompany.yourproject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Tienda implements Subject {

    private Map<String, Integer> stockProductos;
    private List<Observer> observadores;

    public Tienda() {
        stockProductos = new HashMap<>();
        observadores = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer o) {
        observadores.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observadores.remove(o);
    }

    @Override
    public void notificar() {
        for (Observer observador : observadores) {
            for (Map.Entry<String, Integer> entry : stockProductos.entrySet()) {
                observador.actualizar(entry.getKey(), entry.getValue());
            }
        }
    }

    public void setStock(String producto, int stock) {
        stockProductos.put(producto, stock);
        notificar();
    }

}
