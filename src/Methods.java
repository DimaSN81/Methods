import java.util.Random;

public class Methods {
    public static void main(String[] args) {
        testPrintAnArray();
        testToCharArray();
        testMAX();
        testMAX3();
        testMAX5();
        testToString();
        testFirstIndexOfTheArray();
        testLastIndexOfTheArray();
        testGetFactorial();
        testLeapYear();
        testMultipleNumbers();
        testSortArray();
        testCheckDuplicate();
        testMultiplyArrays();
        testUniqueNumbers();
        testReversArray();
        testGetRandomeArray();
        testSearchSubsequence();
        //2
        testAmountDiagonal();
        testGetActiveLongArray();
        testPrintArray();
    }


    static void testPrintAnArray(){
        char[] array = {'A', 'B', 'C', 'D', 'E'};
        System.out.println("Test #01");
        printLn(array);
    }

    static void testToCharArray(){
        int[] array = {70, 71, 72};
        char[] expected = {'F', 'G', 'H'};
        char[] actual = toChar(array);
        assertEquals("#02", expected, actual);
    }

    static void testMAX(){
        int a = 45;
        int b = 25;
        int actual = a;
        int expected = max(a, b);
        assertEquals("#03", expected, actual);
    }

    static void testMAX3(){
        int a = 45;
        int b = 25;
        int c = 35;
        int actual = a;
        int expected = max(a, b, c);
        assertEquals("#04", expected, actual);
    }

    static void testMAX5(){
        int a = 45;
        int b = 25;
        int c = 35;
        int d = 55;
        int e = 48;
        int actual = d;
        int expected = max(a, b, c, d, e);
        assertEquals("#05", expected, actual);
    }

    static void testToString(){
        char[] array = {'a', 'b', 'c', 'd', 'e'};
        String actual = "abcde";
        String expected = toString(array);
        assertEquals("#06", expected, actual);
    }

    static void testFirstIndexOfTheArray(){
        int[] array = {1, 7, 10, 15, 25, 4, 7, 9, 33};
        int secondaryValue = 7;
        int actual = indexOf(array, secondaryValue);
        int expected = 1;
        assertEquals("#08", expected, actual);
    }

    static void testLastIndexOfTheArray(){
        int[] array = {1, 7, 10, 15, 25, 4, 7, 9, 33};
        int secondaryValue = 7;
        int actual = lastIndexOf(array, secondaryValue);
        int expected = 6;
        assertEquals("#09", expected, actual);
    }

    static void testGetFactorial(){
        int value = 12;
        int actual = 479001600;
        int expected = factorial(value);
        assertEquals("#10", expected, actual);
    }

    static void testLeapYear(){
        int year = 2000;
        boolean expected = isLeapYear(year);
        boolean actual = true;
        assertEquals("#11", expected, actual);
    }

    static void testMultipleNumbers(){
        int[] array = {1, 3, 5, 7, 9, 13, 15};
        int multipleNumber = 3;
        System.out.println("Test #12");
        multiple(array, multipleNumber);
    }

    static void testSortArray(){
        int[] array = {2, 3, 1, 7, 5};
        int[] expected = sort(array);
        int[] actual = {1, 2, 3, 5, 7};
        assertEquals("#13", expected, actual);
    }//метод принимает массив интов сортирует его по возрастанию

    static void testCheckDuplicate(){
        byte[] array = {11, 13, 15, 25, 43, 16, 26, 15};
        boolean expected = hasDuplicates(array);
        boolean actual = true;
        assertEquals("#14", expected, actual);
    }

    static void testMultiplyArrays(){
        int[] array_1 = {1, 2, 3, 4, 5};
        int[] array_2 = {2, 3, 4, 5, 6};
        int[] expected = multiplication(array_1, array_2);
        int[] actual = {2, 6, 12, 20, 30};
        assertEquals("#15", expected, actual);
    }

    static void testUniqueNumbers(){
        int[] array_1 = {1, 12, 23, 4, 55};
        int[] array_2 = {2, 23, 4, 15, 16};
        int[] expected = getUnique(array_1, array_2);
        int[] actual = {1, 2, 12, 15, 16, 55};
        assertEquals("#16", expected, actual);
    }

    static void testReversArray(){
        int[] array = {1, 3, 2, 5, 4};
        int[] expected = revers(array);
        int[] actual = {4, 5, 2, 3, 1};
        assertEquals("#17", expected, actual);
    }

    static void testGetRandomeArray(){
        int arrayLenght = 10;
        int lowerBorder = 5;
        int upperBorder = 75;
        int[] expected = randome(arrayLenght, lowerBorder, upperBorder);

        System.out.print("Test #18: ");
        String expectedString = "";
        for (int value : expected) {
            expectedString = expectedString.concat(String.valueOf(value)) + " ";
        }
        System.out.println(expectedString);
    }

    static void testSearchSubsequence(){
        char[] array_1 = {'a', 'b', 'c', 'd', 'h'};
        char[] array_2 = {'c', 'd', 'h'};
        boolean expected = subsequence(array_1, array_2);
        boolean actual = true;
        assertEquals("#19", expected, actual);
    }

    //2--------------------------------------------------------------
    static void testAmountDiagonal(){
        int[][] array = {{1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9, 10, 11, 12},
                        {13, 14, 15, 16}};
        int expected = amountDiagonal(array);
        int actual = 68;
        assertEquals("#2-1", expected, actual);
    }

    static void testGetActiveLongArray(){
        long[][] arrayLong = {{75, 89, 65},
                            {34, 48, 67},
                            {27, 99, 154}};
        boolean[][] arrayBoolean = {{true, false, true},
                                    {false, false, true},
                                    {true, false, true}};
        long[] expected = getActiveLongArray(arrayLong, arrayBoolean);
        long[] actual = {75, 65, 67, 27, 154};
        assertEquals("#2-2", expected, actual);
    }

    static void testPrintArray(){
        char[][] array = {{'a', 'b', 'c'},
                        {'d', 'e', 'f'},
                        {'g', 'h', 'i'}};
        System.out.println("Test #2-3: ");
        printLn(array);
    }

    //---------------------------------------------------------------

    //01) принимает массив чаров, выводит его на экран
    static void printLn(char[] array){
        for (int elementOfArray = 0; elementOfArray < array.length; elementOfArray++){
            System.out.print(" " + array[elementOfArray]);
        }
        System.out.println();
    }

    //02) принимает массив интов, возвращает массив чаров, каждый символ в позиции массива соответствует коду символа передаваемого инта
    static char[] toChar(int[] array){
        char[] charArray = new char[array.length];

        for (int counter = 0; counter < array.length; counter++){
            charArray[counter] = (char) array[counter];
        }
        return charArray;
    }

    //03) приминает 2 инта, а и б, возвращает большее их этих 2х чисел
    static int max(int a, int b){
        return a > b ?  a : b;
    }

    //04) принимает 3 инта, возвращает большее из них
    static int max(int a, int b, int c){
        return max(max(a, b), c);
    }

    //05) приминает 5 интов, возвращает большее из них
    static int max(int a, int b, int c, int d, int e){
        return max(max(max(a, b), max(c, d)), e);
    }

    //06) принимает массив чаров, возвращает строку состоящую из символов массива
    static String toString(char[] array){
        return new String(array);
    }
    
    //08) принимает массив интов, и значение типа инт, возвращает индекс массива в котором значение совпадает с передаваемым, начиная с начала массива. Если значения в массиве нет возвращает -1
    static int indexOf(int[] array, int value){
        int returnVelue = -1;
        for (int counter = 0; counter < array.length; counter++)
        {
            if (array[counter] == value) {
                returnVelue = counter;
                break;
            }
        }
        return returnVelue;
    }

    //09) принимает массив интов, и значение типа инт, возвращает индекс массива в котором значение совпадает с передаваемым, начиная с конца массива. Если значения в массиве нет возвращает -1
    static int lastIndexOf(int[] array, int value){
        int returnVelue = -1;
        for (int counter = array.length - 1; counter >= 0; counter--)
        {
            if (array[counter] == value) {
                returnVelue = counter;
                break;
            }
        }
        return returnVelue;
    }

    //10) метод принимает инт, и возвращает факториал от заданого инта
    public static int factorial(int value){
        if (value > 1) {
            return value * factorial(value - 1);
        } else {
            return 1;
        }
    }

    //11) принимает инт год, и возвращает тру если год высокосный
    static boolean isLeapYear(int value){
        return value % 4 == 0 && ((value <= 1582) || (value > 1582 && ((value % 100 == 0 && value % 400 == 0) || (value % 100 != 0))));
    }

    //12) приминает массив интов и число, выводит на екран только елементы массива которые кратны этому числу
    static void multiple(int[] array, int value){
        for (int counter = 0; counter < array.length; counter++){
            if (array[counter] % value == 0){
                System.out.println(array[counter]);
            }
        }
    }

    //13) метод принимает массив интов сортирует его по возрастанию
    static int[] sort(int[] array){
        for (int counter = 1; counter < array.length; counter++){
            int value = array[counter];
            int counterNew = counter - 1;
            while (counterNew >= 0 && value < array[counterNew]){
                array[counterNew + 1] = array[counterNew];
                counterNew--;
            }
            array[counterNew + 1] = value;
        }
        return array;
    }

    //14) принимает массив байт, если в массиве есть повторяющиеся елементы, возвращает тру
    static boolean hasDuplicates(byte[] array){
        boolean[] hasDuplicates = new boolean[256];
        for (byte value : array) {
            int index = value + 128;
            if (hasDuplicates[index]){
                return true;
            }else {
                hasDuplicates[index] = true;
            }
        }
        return false;
    }

    //15) принимает два массива интов одинаковых по длинне, возращает массив интов который состоит из перемноженных елементов входящих массивов
    static int[] multiplication(int[] array, int[]subArray){
        int[] arrayOut = new int[array.length];
        for (int counter = 0; counter < array.length; counter++){
            arrayOut[counter] = array[counter] * subArray[counter];
        }
        return arrayOut;
    }

    //16) принимает два массива интов, возвращает массив из елементов которые не совпадают в массивах
    static int[] getUnique(int[] array, int[] subArray){
        int[] arrayOut = new int[countUnique(array, subArray)];
        int counterNew = 0;
        for (int counter = 0; counter < array.length; counter++){
            boolean isFinding = false;
            for (int subCounter = 0; subCounter < subArray.length; subCounter++){
                if (array[counter] == subArray[subCounter]){
                    isFinding = true;
                }
            }
            if (isFinding == false){
                arrayOut[counterNew] = array[counter];
                counterNew++;
            }
        }
        for (int subCounter = 0; subCounter < subArray.length; subCounter++){
            boolean isFinding = false;
            for (int counter = 0; counter < array.length; counter++){
                if (subArray[subCounter] == array[counter]){
                    isFinding = true;
                }
            }
            if (isFinding == false){
                arrayOut[counterNew] = subArray[subCounter];
                counterNew++;
            }
        }
        sort(arrayOut);
        return arrayOut;
    }

    static int countUnique(int[] array, int[] subArray){
        int counterOut = 0;
        for (int counter = 0; counter < array.length; counter++){
            boolean isFinding = false;
            for (int subCounter = 0; subCounter < subArray.length; subCounter++){
                if (array[counter] == subArray[subCounter]){
                    isFinding = true;
                    break;
                }
            }
            if (isFinding == false){
                counterOut++;
            }
        }
        for (int subCounter = 0; subCounter < subArray.length; subCounter++){
            boolean isFinding = false;
            for (int counter = 0; counter < array.length; counter++){
                if (subArray[subCounter] == array[counter]){
                    isFinding = true;
                    break;
                }
            }
            if (isFinding == false){
                counterOut++;
            }
        }
        return counterOut;
    }

    //17) принимает масив интов, возвращает его же но в реверсном порядке
    static int[] revers(int[] array){
        int counterRevers = (int) (array.length / 2);
        for (int counter = 0; counter <= counterRevers; counter++){
            int value = array[counter];
            array[counter] = array[array.length - 1 - counter];
            array[array.length - 1 - counter] = value;
        }
        return array;
    }

    //18) принимает 3 инта:
    //- размер выходного массива
    //- нижняя граница
    //- верхняя граница
    //    возвращает массив интов заданой длинный, который содержит случайные числа от нижней границы до верхней границы"
    static int[] randome(int lenghtArray, int lower, int upper){
        int[] array = new int[lenghtArray];
        int difference = upper - lower;
        for (int counter = 0; counter < array.length; counter++){
            array[counter] = new Random().nextInt(difference) + lower;
        }
        return array;
    }

    //19) принимает 2 массива чаров, проверяет есть ли в 1 массиве, такая же последовательность символов которую представляет собой второй массив. Возвращает булеан
    static boolean subsequence(char[] array, char[] subArray){
        for (int counter = 0; counter < array.length; counter++) {
            int counterMin = 0;
            if (array[counter] == subArray[counterMin]) {
                for (int subCounter = 0; subCounter < subArray.length; subCounter++) {
                    if (array[counter + subCounter] == subArray[subCounter] && subCounter == subArray.length - 1) {
                        return true;
                    } else if (array[counter + subCounter] != subArray[subCounter]) {
                        break;
                    }

                }
            }
        }
        return false;
    }

    //2-1. Принимает двумерный (квадратный) массив интов, возвращает сумму диалогалей
    static int amountDiagonal(int[][] array){
        int summ = 0;
        for (int counterX = 0; counterX < array.length; counterX++){
            for (int counterY = 0; counterY < array[counterX].length; counterY++){
                if (counterX == counterY){
                    summ += array[counterX][counterY];
                }
            }
        }
        for (int counterX = array.length - 1; counterX >= 0; counterX--){
            for (int counterY = 0; counterY < array[counterX].length; counterY++){
                if (counterX == counterY){
                    summ += array[counterX][counterY];
                }
            }
        }
        if (array.length % 2 != 0){
            int counterXY = (int) (array.length / 2);
            summ -= array[counterXY][counterXY];
        }
        return summ;
    }

    //2-2. Принимает двумерный массив long и двумерный массив булеан, возвращает одномерный массив лонгов который состоит из элементов первого массива.
    // По индексам по которым в массиве булеан хранятся значения тру.
    static long[] getActiveLongArray(long[][] array, boolean[][] subArray){
        int newCounter = 0;
        for (int counterX = 0; counterX < array.length; counterX++){
            for (int counterY = 0; counterY < array[counterX].length; counterY++){
                if (subArray[counterX][counterY] == true){
                    newCounter++;
                }
            }
        }
        long[] newArray = new long[newCounter];
        newCounter = 0;
        for (int counterX = 0; counterX < array.length; counterX++){
            for (int counterY = 0; counterY < array[counterX].length; counterY++){
                if (subArray[counterX][counterY] == true){
                    newArray[newCounter] = array[counterX][counterY];
                    newCounter++;
                }
            }
        }
        return newArray;
    }

    //2-3. Принимает двумерный массив символов - выводит его на экран.
    static void printLn(char[][] array){
        for (int counterX = 0; counterX < array.length; counterX++){
            for (int counterY = 0; counterY < array[counterX].length; counterY++){
                System.out.print(array[counterX][counterY] + " ");
            }
            System.out.println();
        }
    }


    //Equality of values
    static void assertEquals(String methodID, boolean expected, boolean actual){
        if (expected == actual) {
            System.out.println("Test " + methodID + " Passed!");
        } else {
            System.out.println("Test " + methodID + " Failed! Expected: " + expected + ", Actual: " + actual);
        }
    }
    //Equality of values
    static void assertEquals(String methodID, char expected, char actual){
        if (expected == actual) {
            System.out.println("Test " + methodID + " Passed!");
        } else {
            System.out.println("Test " + methodID + " Failed! Expected: " + expected + ", Actual: " + actual);
        }
    }
    //Equality of values
    static void assertEquals(String methodID, String expected, String actual){
        if (expected.equals(actual)) {
            System.out.println("Test " + methodID + " Passed!");
        } else {
            System.out.println("Test " + methodID + " Failed! Expected: " + expected + ", Actual: " + actual);
        }
    }
    //Equality of values
    static void assertEquals(String methodID, int expected, int actual){
        if (expected == actual) {
            System.out.println("Test " + methodID + " Passed!");
        } else {
            System.out.println("Test " + methodID + " Failed! Expected: " + expected + ", Actual: " + actual);
        }
    }
    //Equality of values
    static void assertEquals(String methodID, char[] expected, char[] actual) {
        boolean isEqual = false;
        if(expected.length == actual.length) {
            isEqual = true;
            for(int i = 0; i < expected.length; i++) {
                if(expected[i] != actual[i]){
                    isEqual = false;
                    break;
                }
            }
        }

        if(isEqual) {
            System.out.println("Test " + methodID + " Passed!");
        } else {
            System.out.print("Test " + methodID + " Failed!");
            System.out.print("Expected: " + toString(expected));
            System.out.println(", actual: " + toString(actual));
        }

    }
    //Equality of values
    static void assertEquals(String methodID, int[] expected, int[] actual) {
        boolean isEqual = false;
        if(expected.length == actual.length) {
            isEqual = true;
            for(int i = 0; i < expected.length; i++) {
                if(expected[i] != actual[i]){
                    isEqual = false;
                    break;
                }
            }
        }

        String expectedString = "";
        String actualString = "";
        for (int value : expected) {
            expectedString = expectedString.concat(String.valueOf(value)) + " ";
        }

        for (int value : actual) {
            actualString = actualString.concat(String.valueOf(value)) + " ";
        }

        if(isEqual) {
            System.out.println("Test " + methodID + " Passed!");
        } else {
            System.out.print("Test " + methodID + " Failed!");
            System.out.print("Expected: " + expectedString);
            System.out.println(", actual: " + actualString);
        }

    }
    //Equality of values
    static void assertEquals(String methodID, long[] expected, long[] actual) {
        boolean isEqual = false;
        if(expected.length == actual.length) {
            isEqual = true;
            for(int i = 0; i < expected.length; i++) {
                if(expected[i] != actual[i]){
                    isEqual = false;
                    break;
                }
            }
        }

        String expectedString = "";
        String actualString = "";
        for (long value : expected) {
            expectedString = expectedString.concat(String.valueOf(value));
        }

        for (long value : actual) {
            actualString = actualString.concat(String.valueOf(value));
        }

        if(isEqual) {
            System.out.println("Test " + methodID + " Passed!");
        } else {
            System.out.print("Test " + methodID + " Failed!");
            System.out.print("Expected: " + expectedString);
            System.out.println(", actual: " + actualString);
        }

    }
}
