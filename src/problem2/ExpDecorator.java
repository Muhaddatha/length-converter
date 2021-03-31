
package problem2;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class ExpDecorator extends ConversionDecorator {

    private final ConversionHandler conversionHandler;
    private final Double kilometers;
    public String scientificNotation;
    

    //constructor 
    public ExpDecorator(ConversionHandler conversionHandler){
        this.conversionHandler = conversionHandler;
        this.kilometers = conversionHandler.convertedKilometers;
        scientificNotation = "";
    }
    
    @Override
    public Double decorate() {
        
        NumberFormat numFormat = new DecimalFormat();
        numFormat = new DecimalFormat("0.#####E0");
        scientificNotation = numFormat.format(kilometers);
        return kilometers;
    }

    @Override
    public Double handleConversionRequest(Double kilometers, String conversionType) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
