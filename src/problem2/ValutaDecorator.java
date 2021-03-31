
package problem2;

public class ValutaDecorator extends ConversionDecorator {
    private final ConversionHandler conversionHandler;
    private final Double kilometers;
    public String finalValue;
    

    //constructor 
    public ValutaDecorator(ConversionHandler conversionHandler){
        this.conversionHandler = conversionHandler;
        this.kilometers = conversionHandler.convertedKilometers;
    }

    @Override
    public Double decorate() {
        finalValue = conversionHandler.scientificNotation + " " + conversionHandler.conversionMethod;
        return kilometers;
    }

    @Override
    public Double handleConversionRequest(Double kilometers, String conversionType) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String getFinalValue(){
        return finalValue;
    }
}
