/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab13;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.event.ChangeListener;
import javafx.beans.value.ObservableValue;
import javax.swing.JOptionPane;
import javax.swing.event.ChangeEvent;
import lab13.KelvinConvertModel.TempUnits;

/**
 *
 * @author as063
 */
public class KelvinConvertController implements ActionListener, ChangeListener{
    private KelvinConvertModel theModel;
    private MainView theView;

    public KelvinConvertController(KelvinConvertModel theModel, MainView theView) {
        this.theModel = theModel;
        this.theView = theView;
        updateViewFromModel();
        theView.getSliderTemp().addChangeListener(this);
        theView.getSliderTemp().addChangeListener(this);
        theView.getTextMaxTemp().addActionListener(this);
        theView.getTextMinTemp().addActionListener(this);
        theView.getRdbtnCelTemp().addActionListener(this);
        theView.getRdbtnFahTemp().addActionListener(this);     
    }

    private void updateViewFromModel() {
        if (theModel.getTempUnits() == TempUnits.FAH_TEMP) {
            theView.getRdbtnFahTemp().setSelected(true);
            theView.getTextTempKelvin().setText(String.format("%.2f",KelvinConvertUtility.convertFtoK(theModel.getTempToConvert())));
        } else {
            theView.getRdbtnCelTemp().setSelected(true);
            theView.getTextTempKelvin().setText(String.format("%.2f",KelvinConvertUtility.convertCtoK(theModel.getTempToConvert())));
        }
        theView.getSliderTemp().setModel(theModel.getTempRange());
        theModel.setTempToConvert(theView.getSliderTemp().getValue());
        theView.getTextMaxTemp().setText(String.valueOf(theModel.getTempRange().getMaximum()));
        theView.getTextMinTemp().setText(String.valueOf(theModel.getTempRange().getMinimum()));
        theView.getLblCurTemp().setText(String.valueOf(theModel.getTempRange().getValue()));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource() == theView.getTextMaxTemp()) {
                theModel.getTempRange().setMaximum(Integer.valueOf(theView.getTextMaxTemp().getText()));
                updateViewFromModel();
            }
            if (e.getSource() == theView.getTextMinTemp()) {
                theModel.getTempRange().setMinimum(Integer.valueOf(theView.getTextMinTemp().getText()));
                updateViewFromModel();
            }
            
            } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(theView, "Number Format Error!", theView.getTextMinTemp().getText() + "is not a numer!", JOptionPane.ERROR_MESSAGE);
                    }
        
            if (e.getSource() == theView.getLblCurTemp()) {
                theView.getLblCurTemp().setText(Integer.toString(theModel.getTempRange().getValue()));
            }
            if (e.getSource() == theView.getRdbtnCelTemp()) {
                theModel.setTempUnits(TempUnits.CEL_TEMP);
                updateViewFromModel();
            }
            if (e.getSource() == theView.getRdbtnFahTemp()) {
                theModel.setTempUnits(TempUnits.FAH_TEMP);
                updateViewFromModel();
    }

        
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        if (e.getSource() == theView.getSliderTemp()) {
            theModel.setTempRange(theView.getSliderTemp().getModel());
            updateViewFromModel();
        }
        
    }

}
