/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filosofos;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tato
 */
public class Filosofo extends Thread {

    private Integer processId;
    private Boolean active;
    private Integer quantum;
    private Monitor monitor;
    private Boolean comiendo;

    public Filosofo(Integer processId) {
        this.processId = processId;
        this.active = true;
        this.quantum = 1000;
        this.monitor = Monitor.getInstance();
        this.comiendo = false;
    }

    public Integer getProcessId() {
        return processId;
    }

    public void setProcessId(Integer processId) {
        this.processId = processId;
    }

    public Integer getQuantum() {
        return quantum;
    }

    public void setQuantum(Integer quantum) {
        this.quantum = quantum;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Boolean getComiendo() {
        return comiendo;
    }

    public void setComiendo(Boolean comiendo) {
        this.comiendo = comiendo;
    }

    @Override
    public void run() {
        System.out.println("Filosofo run");
        while (this.active == true) {
            monitor.eat(this.processId);
            if (comiendo) {
                try {
                    System.out.println("Filosofo: " + this.processId + " - Comiendo");
                    sleep(5000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Filosofo.class.getName()).log(Level.SEVERE, null, ex);
                }
                this.comiendo = false;
                monitor.devolverTenedores(this.processId);
            }
        }
    }
}
