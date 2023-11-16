import org.junit.Test;

public class TestsClass {
    @Test
    public void numberTest() {
        int expectedNumber = 7;
        int inputNumber = 10;
        if(inputNumber > expectedNumber){
            System.out.println("Привет");
        }
    }

    @Test
    public void nameTest() {
        String expectedName = "Вячеслав";
        String inputName = "Николай";

        if(expectedName.equals(inputName)){
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }
    }

    @Test
    public void arrayElementsMultiplesOf3() {
        int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int number : numbers) {
            if ((number % 3) == 0) {
                System.out.println(number);
            }
        }
    }
}
