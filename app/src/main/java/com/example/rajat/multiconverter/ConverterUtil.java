package com.example.rajat.multiconverter;

/**
 * Created by Rajat on 26-Feb-15.
 */
public class ConverterUtil {
    // converts to celsius
    public static double convertKMToM(float km) {
        return ((km )* 1.61);
    }

    // converts to kilometer
    public static double convertMToKM(float m) {
        return ((m)/1.61 );
    }
    public static double convertKGToP(float kg) {
        return ((kg )*2.2);
    }
    public static double convertPToKG(float p) {
        return ((p)/2.2 );
    }
    public static float convertFToC(float f) {
        return ((f - 32) * 5 / 9);
    }

    // converts to fahrenheit
    public static float convertCToF(float c) {
        return ((c * 9) / 5) + 32;
    }

    public static double convertCToK(float c) {
        return (c + 273.15);
    }
    public static double convertKToC(float k) {
        return (k - 273.15);
    }
}
