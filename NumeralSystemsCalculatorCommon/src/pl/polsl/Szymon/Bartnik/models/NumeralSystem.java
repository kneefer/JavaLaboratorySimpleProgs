package pl.polsl.Szymon.Bartnik.models;

import pl.polsl.Szymon.Bartnik.models.exceptions.NegativeNumberException;

/**
 * Abstract class representing numeral system and implementing methods
 * used for computing representation of numeral systems in other systems.
 * 
 * @author Szymon Bartnik (grupa 2)
 * @version 1.0
 */
public abstract class NumeralSystem {
    
    /**
     * Gets numeral system full name
     * 
     * @return numeral system full name
     */
    protected abstract String getSystemName();
    
    /**
     * Converts passed number from numeral system identified by current type of this class.
     * to the NumeralSystem identified by passed NumeralSystem implementation object.
     * 
     * @param numberToConvert number to convert to other numeral system
     * @param outputNumeralSystem instance of NumeralSystem which represents output numeral system.
     * @return passed number representation in numeral system 
     * identified by outputNumeralSystem argument
     * 
     * @throws NumberFormatException when detected illegal characters in number to convert
     * @throws NullPointerException when any of parameters is null
     * @throws NegativeNumberException when number to convert is negative (not supported).
     */
    public abstract String convertToSpecifiedNumSystem(String numberToConvert, NumeralSystem outputNumeralSystem) 
            throws NumberFormatException, NullPointerException, NegativeNumberException;
    
    /**
     * Converts passed integer number (in decimal system) to the needed numeral system
     * (to the system identified by type of current implementation of the NumeralSystem class).
     * 
     * @param numberToConvert number in decimal system which we want to convert to other numeral system.
     * @return input integer number converted to the needed numeral system.
     */
    public abstract String convertFromDecimal(Long numberToConvert);

    @Override
    public String toString() {
        return getSystemName();
    }
}