package problem2;


public abstract class ConversionDecorator extends ConversionHandler {
    
    ConversionHandler conversionHandler;
    Double kilometers;
    public String scientificNotation;
    
    public abstract Double decorate();
}
