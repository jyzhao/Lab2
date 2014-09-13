/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;
import Business.VitalSign;

/**
 *
 * @author zhaojiyuan
 */
public class VitalSignHistory {
    private ArrayList<VitalSign> vitalSignList;
    
    public VitalSignHistory() {
        vitalSignList = new ArrayList<>();
        
    }

    public ArrayList<VitalSign> getVitalSignList() {
        return vitalSignList;
    }

    public void setVitalSignList(ArrayList vitalSignList) {
        this.vitalSignList = vitalSignList;
    }
    
    public VitalSign addVitalSign() {
        VitalSign vitalSign = new VitalSign();
        this.vitalSignList.add(vitalSign);
        return vitalSign;
    }
    
    public void removeVitalSign(VitalSign vitalSign) {
        this.vitalSignList.remove(vitalSign);
    }
}
