/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filosofos;

/**
 *
 * @author Tato
 */
public class Tenedor {

    private Boolean isActive;
    private Integer tenedorId;

    public Tenedor(Integer tenedorId) {
        this.tenedorId = tenedorId;
        this.isActive = false;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public Integer getTenedorId() {
        return tenedorId;
    }

    public void setTenedorId(Integer tenedorId) {
        this.tenedorId = tenedorId;
    }

}
