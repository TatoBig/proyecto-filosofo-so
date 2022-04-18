/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filosofos;

import static java.lang.Thread.sleep;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tato
 */
public class Monitor {

    private static Monitor instance;
    private static int estaCom=0;
    public Monitor() {
    }

    static {
        instance = new Monitor();
    }

    public static Monitor getInstance() {
        return instance;
    }
    
    public static int getEsta() {
        return estaCom;
    }
    
    private ArrayList<Tenedor> listaTenedores = new ArrayList();
    private ArrayList<Filosofo> listaFilosofos = new ArrayList();

    public void addFilosofos(Integer quantity) {
        for (int i = 0; i < quantity; i++) {
            Filosofo filosofo = new Filosofo(i);
            listaFilosofos.add(filosofo);
            Tenedor tenedor = new Tenedor(i);
            listaTenedores.add(tenedor);
        }
        for (int i = 0; i < listaFilosofos.size(); i++) {
            listaFilosofos.get(i).start();
            listaFilosofos.get(i).setActive(true);
            listaTenedores.get(i).setIsActive(false);
        }
    }
    
    public void eliminarFilosofos(){
        for (int i = 0; i < listaFilosofos.size(); i++) {
            listaFilosofos.get(i).stop();
        }
        listaFilosofos.removeAll(listaFilosofos);
        listaTenedores.removeAll(listaTenedores);
    }

    public ArrayList<Tenedor> getListaTenedores() {
        return listaTenedores;
    }

    public void setListaTenedores(ArrayList<Tenedor> listaTenedores) {
        this.listaTenedores = listaTenedores;
    }

    public ArrayList<Filosofo> getListaFilosofos() {
        return listaFilosofos;
    }

    public void setListaFilosofos(ArrayList<Filosofo> listaFilosofos) {
        this.listaFilosofos = listaFilosofos;
    }

    public synchronized void eat(Integer id) {
        if (id == 0) {
            if (!listaTenedores.get(id).getIsActive() && !listaTenedores.get(listaTenedores.size() - 1).getIsActive()) {
                System.out.println("Filosofo: " + id + " come con los tenedores: " + id + " y " + (listaTenedores.size() - 1));
                listaTenedores.get(id).setIsActive(true);
                listaTenedores.get(listaTenedores.size() - 1).setIsActive(true);
                listaFilosofos.get(id).setComiendo(true);
            }
        } else {
            if (!listaTenedores.get(id).getIsActive() && !listaTenedores.get(id - 1).getIsActive()) {
                System.out.println("Filosofo: " + id + " come con los tenedores: " + id + " y " + (id - 1));
                listaTenedores.get(id).setIsActive(true);
                listaTenedores.get(id - 1).setIsActive(true);
                listaFilosofos.get(id).setComiendo(true);
            }
        }
    }
    
    public void devolverTenedores(Integer id) {
        if (id == 0) {
            listaTenedores.get(id).setIsActive(false);
            listaTenedores.get(listaTenedores.size() - 1).setIsActive(false);

        } else {
            listaTenedores.get(id).setIsActive(false);
            listaTenedores.get(id - 1).setIsActive(false);

        }
    }
    
}
