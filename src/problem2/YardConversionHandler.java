
package problem2;

public class YardConversionHandler extends ConversionHandler {
    @Override
    public Double handleConversionRequest(Double kilometers, String conversionType) {
        
        if(conversionType.equalsIgnoreCase("Yard")){
             this.convertedKilometers = 1093.61 * kilometers;
             return convertedKilometers;
        }
        else{
            if(successor != null){
                return successor.handleConversionRequest(kilometers, conversionType);
            }
        }
        return null;
    }
}
