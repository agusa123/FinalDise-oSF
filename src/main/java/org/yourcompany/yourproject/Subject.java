package org.yourcompany.yourproject;

public interface Subject {

    public void addObserver(Observer o);

    public void removeObserver(Observer o);

    public void notificar();

}
