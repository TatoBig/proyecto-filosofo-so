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

    public Monitor() {
    }

    static {
        instance = new Monitor();
    }

    public static Monitor getInstance() {
        return instance;
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
        }
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
        listaFilosofos.get(id).setComiendo(true);
        try {
            System.out.println("El filosofo que esta comiendo es el: " + id);
            sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Filosofo.class.getName()).log(Level.SEVERE, null, ex);
        }
        listaFilosofos.get(id).setComiendo(false);
    }
}
