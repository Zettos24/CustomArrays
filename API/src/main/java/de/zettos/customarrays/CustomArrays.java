package de.zettos.customarrays;

import org.apache.commons.lang3.ArrayUtils;

public class CustomArrays {

    public static String[] addArray(String[] currentArray, String value) {

        if(currentArray != null) {
            currentArray = ArrayUtils.add(currentArray, value);
            return currentArray;
        }else {
            String[] array = new String[0];
            array = ArrayUtils.add(array, value);
            return array;
        }
    }

    public static String[] removeArray(String[] currentarray, String value) {

        if(currentarray != null) {

            String[] array = currentarray;
            String[] temp = null;

            for(int i = 0; i<array.length; i++) {
                if(array[i].equals(value)) {
                    temp =  ArrayUtils.remove(array, i);
                }
            }
            array = temp;

            return array;
        }

        return null;
    }
}
