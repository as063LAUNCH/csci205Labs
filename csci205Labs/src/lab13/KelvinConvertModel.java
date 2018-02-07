/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab13;

import javax.swing.BoundedRangeModel;
import javax.swing.DefaultBoundedRangeModel;

/**
 *
 * @author as063
 */
public class KelvinConvertModel {
    public static enum TempUnits{
        FAH_TEMP, CEL_TEMP;
    }
    
    private double tempToConvert;
    private TempUnits tempUnits;
    private BoundedRangeModel tempRange;
    
    public KelvinConvertModel() {
        this.tempToConvert = 25.0;
        this.tempUnits = TempUnits.FAH_TEMP;
        this.tempRange = new DefaultBoundedRangeModel((int)tempToConvert, 0, 0, 100);
    }

    public double getTempToConvert() {
        return tempToConvert;
    }

    public void setTempToConvert(double tempToConvert) {
        this.tempToConvert = tempToConvert;
    }

    public TempUnits getTempUnits() {
        return tempUnits;
    }

    public void setTempUnits(TempUnits tempUnits) {
        this.tempUnits = tempUnits;
    }

    public BoundedRangeModel getTempRange() {
        return tempRange;
    }

    public void setTempRange(BoundedRangeModel tempRange) {
        this.tempRange = tempRange;
    }
    
}
