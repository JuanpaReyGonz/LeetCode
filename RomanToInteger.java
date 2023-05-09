/**
 * @author: Juan Pablo Reyes González
 * Roman number to Decimal numbers. [1, 3999] [I - MMMCMXCIX]
 * https://leetcode.com/problems/roman-to-integer/
 */
public class RomanToInteger {
    public int romanToInt(String s) {
        char[] numRoman = s.toCharArray();
        int suma=0, i =0;

        do {
            if(numRoman[i] == 'V'){
                suma += 5;
            }

            else if(numRoman[i] == 'L'){
                suma += 50;
            }

            else if(numRoman[i] == 'D'){
                suma += 500;
            }

            else if(numRoman[i] == 'M'){
                suma += 1000;
            }

            else if(numRoman[i] == 'I'){
                if(i+1 >= numRoman.length){
                    suma += 1;
                } else if(numRoman[i+1] == 'V'){
                    //Simplificar a que ese valor es 4
                    suma += 4;
                    i++;
                } else if (numRoman[i+1] == 'X') {
                    //Simplificar ese valor a 9
                    suma += 9;
                    i++;
                }
                else{
                    suma += 1;
                }
            }

            else if(numRoman[i] == 'X'){
                if(i+1 >= numRoman.length){
                    suma += 10;
                } else if (numRoman[i+1] == 'L'){
                    //Simplificar a 40
                    suma += 40;
                    i++;
                } else if (numRoman[i+1] == 'C') {
                    //Simplificar a 90
                    suma += 90;
                    i++;
                }
                else {
                    suma += 10;
                }
            }

            else if(numRoman[i] == 'C'){
                if(i+1 >= numRoman.length){
                    suma += 100;
                } else if (numRoman[i+1] == 'D'){
                    //Simplificar a 400
                    suma += 400;
                    i++;
                } else if (numRoman[i+1] == 'M') {
                    //Simplificar a 900
                    suma += 900;
                    i++;
                }
                else {
                    suma += 100;
                }
            }
            i++;
        } while (i <= numRoman.length-1);
        return suma;
    }
}
