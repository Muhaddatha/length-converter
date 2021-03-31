
package problem2;

public class RoundDecorator extends ConversionDecorator{

    private final ConversionHandler conversionHandler;
    private final Double kilometers;
    

    //constructor 
    public RoundDecorator(ConversionHandler conversionHandler){
        this.conversionHandler = conversionHandler;
        this.kilometers = conversionHandler.convertedKilometers;
    }
    
    @Override
    public Double handleConversionRequest(Double kilometers, String conversionType) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Double decorate() {
        return Math.round(kilometers * 100.00) / 100.00;
    }
    
}
