
package problem2;

public class MileConversionHandler extends ConversionHandler {
    @Override
    public Double handleConversionRequest(Double kilometers, String conversionType) {
        if(conversionType.equalsIgnoreCase("Mile")){
            this.convertedKilometers = 0.621371 * kilometers;
            return  convertedKilometers;
            //conversionType = "Something else";
        }
        else{
            if(successor != null){
                return successor.handleConversionRequest(kilometers, conversionType);
            }
        }
        return null;
    }
}
