
package problem2;

public abstract class ConversionHandler {
    
    protected ConversionHandler successor;
    public Double convertedKilometers;
    public String conversionMethod;
    public String scientificNotation;
    public String finalAnswer;
    
    public void setSuccessor(ConversionHandler successor){
        this.successor = successor;
    }
    
    public abstract Double handleConversionRequest(Double kilometers, String conversionType);
}
