/**
 * @author: Juan Pablo Reyes González
 * Write a function to find the longest common prefix string amongst an array of strings.
 * If there is no common prefix, return an empty string "".
 * https://leetcode.com/problems/longest-common-prefix/
 */
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        int lengthArray = strs.length;
        int lengthWord = strs[0].length(); //Valor inicial que no impacta en nada.
        String prefix = "";
        char alternPrefix;
        boolean x = false;


        //Revisa el tamaño de las palabras, para tomar en cuenta al menor.
        for (int i = 0; i<lengthArray; i++){
            if(strs[i].length() <= lengthWord){
                lengthWord = strs[i].length();
            }
        }
        //Si el array es "", entonces rompe el ciclo y manda prefix vacío para evitar excepciones en el siguiente do-while
        if (lengthWord == 0){
            return prefix;
        }

        int i=0, j=0;
        do {
            //alternPrefix almacena cada caracter de la primer palabra para compararlo con las demás.
            alternPrefix = strs[0].charAt(i);
            j=0;
            do {
                if ((strs[j].charAt(i)) != alternPrefix) {
                    x = true;
                    alternPrefix = ' ';
                }
                j++;
            } while (j < lengthArray && x != true);
            i++;
            if(x!=true){
                //Solamente guardo cuando el booleano no se ha visto afectado, así evito espacios vacíos " ".
                prefix += alternPrefix;
            }
        } while (i<lengthWord && x != true);
        return prefix;
    }
}