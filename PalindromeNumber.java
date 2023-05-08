/**
 * author: Juan Pablo Reyes González.
 */
public class PalindromeNumber {
    public boolean isPalindromeNumber(int x){
        String[] value = String.valueOf(x).split("");
        String[] valueInvert = new String[value.length];
        int j=0;
        for (int i = value.length-1; i>=0;  i--){
            if (j < value.length){
                valueInvert[j] = value[i];
                j++;
            }
        }
        for (int i=0; i<value.length; i++){
            if(!value[i].equals(valueInvert[i])){
                return false;
            }
        }
        return true;
    }
}
