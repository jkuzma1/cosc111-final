import java.util.Random;

/**
 * Helper class for the final
 */
public class Helper
{
    /*
     * Converts from one unit to another, depending on the mode.
     * For mode 1, converts kilometers to miles
     * For mode 2, converts miles to kilometers
     */
    public static double Converter(double value, int mode)
    {
        if(mode==1){
        	return value * .621;  
        }
        if(mode==2){
        	return value * 1.61;
        }
        return value;
    }
    
    /*
     * Generate random numbers between min and max (with min and
     * max included). It should generate count random numbers and
     * return an array
     */
    public static int[] generateRandom(int count, int min, int max)
    {
    	int array[] = new int[count];
    	//int range = rand.nextInt(max + 1 -min)+ min;
    	for(int i= 0; i<array.length; i ++){
    		array[i] = (int)(Math.random() * count);
    	}
    	return array;
    }
    
    /*
     * Find the smallest number greater than 1 that divides both n1 and n2
     */
    public static int findSmallestNumberThatDivides (int n1, int n2)
    {
	int i = 2;
    	while (true)
    	{
    		if ((n1 % i == 0) && (n2 % i == 0))
    			return i;
    		i++;
    	}
    }
    
    /*
     * Find the mean of the numbers in values
     */
    public static double findMean(double[] values)
    {
    	double sum =0;
    	for(int i =0; i< values.length; i++){
    		sum += values[i];
    	}
    	return sum/values.length;
    }
    
    /*
     * Check if the SSN was issued in Michigan. 
     * The first three digits of the SSN are between 
     * 362 and 386.
     */
    public static boolean isMichiganSSN(long ssn)
    {
    	int FirstThree = (int) ssn/1000000;
    	if(FirstThree > 362 && FirstThree < 386){
    		return true;
    	}
    	return false;
    }
    
    /*
     * Given a rate r, calculate the doubling time.
     * https://en.wikipedia.org/wiki/Doubling_time
     */
    public static double calculateDoublingTime(double r)
    {
    	return 0;
    }
    
    /*
     * Create a new Product object.
     * The ID has the following rule:
     * offset is added to from 222000
     * Color code 1 is R, code two is B
     * Revision is added to the end
     * So, offset of 111, colorCode of 2 and revision 3 has id 222111B3 
     */
    public static Product makeProduct(int offset, int colorCode, int revision)
    {
    	char code ='A';
    	int TrueOffset = offset + 222000;
    	if(colorCode==1){
    		 code = 'R';
    	}
    	if(colorCode==2){
    		 code = 'B';
    	}
    	return null;
    }
    
    /*
     * Return the NetworkInterface with the given MAC_address. If not found,
     * return null
     */
    public static WirelessAdapter findbyMACAddress(WirelessAdapter[] nics, String MAC_address)
    {
    	return null;
    }
    
	/*
	 * Helper function to generate a random MAC address
	 */
	public static String randomMACAddress(int seed)
	{
	    Random rand = new Random();
	    rand.setSeed(seed);
	    
	    byte[] macAddr = new byte[6];
	    rand.nextBytes(macAddr);

	    macAddr[0] = (byte)(macAddr[0] & (byte)254);  //zeroing last 2 bytes to make it unicast and locally administered

	    StringBuilder sb = new StringBuilder(18);
	    for(byte b : macAddr)
	    {
	        if(sb.length() > 0)
	            sb.append(":");
	        sb.append(String.format("%02x", b));
	    }

	    return sb.toString().toUpperCase();
	}
}
