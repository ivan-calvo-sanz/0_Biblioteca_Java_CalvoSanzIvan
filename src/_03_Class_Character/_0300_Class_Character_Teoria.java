package _03_Class_Character;

/**
 *
 * @author Iván Calvo Sanz
 *
 */
public class _0300_Class_Character_Teoria {

    // https://www.w3schools.in/java/characters?utm_content=cmp-true
    // CONCEPTOS BASICOS CLASE Character
    // 
    public static void main(String[] args) {

        // METODOS CLASE Character
        // isAlphabetic(int codePoint)  Determines whether the given character is an alphabet or not.
        Character.isAlphabetic(caracter)
                
        System.out.println(Character.isLetter('g')); // true
        System.out.println(Character.isLetter('6')); // false
        System.out.println(Character.isDigit('8')); // true
        System.out.println(Character.isWhitespace('\t')); // true
        System.out.println(Character.isUpperCase('k')); // false
        System.out.println(Character.isLowerCase('G')); // false
        System.out.println(Character.toUpperCase('d')); // C
        System.out.println(Character.toLowerCase('K')); // c
        System.out.println(Character.toString('S')); // C

        // cambiar de Char a int mediante Tabla ASI
        int d = (char) ('a' + 3);

    }

}
