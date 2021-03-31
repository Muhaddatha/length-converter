/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem2;


public class FootConversionHandler extends ConversionHandler{
    @Override
    public Double handleConversionRequest(Double kilometers, String conversionType) {
        
        if(conversionType.equalsIgnoreCase("Foot")){
            this.convertedKilometers = 3280.84 * kilometers;
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
