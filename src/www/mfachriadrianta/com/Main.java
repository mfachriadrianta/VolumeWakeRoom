package www.mfachriadrianta.com;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] arrgs) throws IOException {

        Scanner choiceMenu = new Scanner(System.in);
        String inputChoiceMenu;
        boolean next = true;

        while (next){
            clearScreen();
            System.out.println("===========");
            System.out.println("1. Calculation Large Room");
            System.out.println("2. Caclculation Cube");
            System.out.println("3. Calculation Beam");
            System.out.println("4. Calculation Ball");
            System.out.println("5. Calculation Tube");
            System.out.println("6. Calculation Cone");
            System.out.println("7. Calculation Pyramid");
            System.out.println("8. Calculation Prims");

            System.out.print("Your choice ! : ");
            inputChoiceMenu = choiceMenu.next();
            switch (inputChoiceMenu){
                case "1":
                    System.out.println("== Calculation Large Room ==");
                    calculationLargeRoom();
                    break;
                case "2":
                    System.out.println("== Calculation Cube ==");
                    calculationCube();
                    break;
                case "3":
                    System.out.println("== Calculation Beam ==");
                    calculationBeam();
                    break;
                case "4":
                    System.out.println("== Calculation Ball ==");
                    calculationBall();
                    break;
                case "5":
                    System.out.println("== Calculation Tube ==");
                    calculationTube();
                    break;
                case "6":
                    System.out.println("== Calculation Cone ==");
                    calculationCone();
                    break;
                case "7":
                    System.out.println("== Calculation Pyramid ==");
                    calculationPyramid();
                    break;
                case "8":
                    System.out.println("== Calculation Prism ==");
                    calculationPrism();
                    break;
                default:
                    System.err.println("Not found input your insert!");
            }
        next = getYesorNo("Your want to next ?");
        }

    }

    private static void calculationLargeRoom() {
        // Large
        System.out.print("Input value Wide : ");
        Scanner inputValueWide = new Scanner(System.in);
        Integer valueWide = inputValueWide.nextInt();

        // Panjang
        System.out.print("Input value Lenght : ");
        Scanner inputValueLenght = new Scanner(System.in);
        Integer valueLenght = inputValueLenght.nextInt();

        // Hasil
        System.out.print("Result value : " + valueWide * valueLenght);
    }

    public static void calculationCube(){
        System.out.print("Edittext : ");
        Scanner lenghtLateralCube = new Scanner(System.in);
        Double inputLenghtLateralCube = lenghtLateralCube.nextDouble();
        System.out.print(inputLenghtLateralCube * inputLenghtLateralCube * inputLenghtLateralCube);

    }

    public static void calculationBeam(){
        Scanner inputValue = new Scanner(System.in);
        Integer inputLenght, inputWeight, inputHeight;
        System.out.print("Insert value Lenght : ");
        inputLenght = inputValue.nextInt();
        System.out.print("Insert value Weight : ");
        inputWeight = inputValue.nextInt();
        System.out.print("Insert value Height : ");
        inputHeight = inputValue.nextInt();
        System.out.println("Hasilnya : " + inputLenght * inputWeight * inputHeight);
    }

    public static void calculationBall(){
        System.out.print("Input value Fingers : ");
        Scanner inputValue = new Scanner(System.in);
        Integer valueFingers = inputValue.nextInt();
        Integer valueFingersRank = valueFingers * valueFingers * valueFingers;
        Double valueProduct = 3.14;
        Double valueOther = 1.3;
        Double resultValue = valueOther * valueProduct * valueFingersRank;
        System.out.println("Hasilnya : " + resultValue);
    }

    public static void calculationTube(){
        Scanner inputValue = new Scanner(System.in);
        Double valueProduct = 3.14;

        System.out.print("Input value Fingers Circle : ");
        Integer valueFingersCircle = inputValue.nextInt();
        Integer valueFingersCircleRank = valueFingersCircle * valueFingersCircle;

        System.out.print("Input value Height : ");
        Integer valueHeight = inputValue.nextInt();

        Double resultValue = valueProduct * valueFingersCircleRank * valueHeight;
        System.out.print("Hasilnya : " + resultValue);
    }

    public static void calculationCone(){
        Scanner inputValue = new Scanner(System.in);
        float valueProductOne = 1;
        float valueProductTwo = 3;
        double valueProductThree = (valueProductOne / valueProductTwo) * 3.14;

        System.out.print("Input value Lenght Fingers : ");
        int inputValueLenghtFingers = inputValue.nextInt();
        int inputValueLenghtFingersRank = inputValueLenghtFingers * inputValueLenghtFingers;

        System.out.print("Input value Height Cone : ");
        int inputValueHeightCone = inputValue.nextInt();

        Double resultValue = valueProductThree * inputValueLenghtFingersRank * inputValueHeightCone;
        System.out.println("Hasilnya :  " + resultValue);
    }

    public static void calculationPyramid(){
        Scanner inputValue = new Scanner(System.in);
        float valueProductOne, valueProductTwo;
        int valueBase, valueBaseRank, valueHeight;
        System.out.print("Input value Base : ");
        valueBase = inputValue.nextInt();
        System.out.print("Input value Height : ");
        valueHeight = inputValue.nextInt();
        valueProductOne = 1;
        valueProductTwo = 3;
        valueBaseRank = valueBase * valueBase;

        System.out.println("Result value : " + (valueProductOne / valueProductTwo) * valueBaseRank * valueHeight);
    }

    public static void calculationPrism(){
        Scanner inputValue = new Scanner(System.in);
        float valueProductOne, valueProductTwo, valueProductThree;
        valueProductOne = 1;
        valueProductTwo = 2;
        valueProductThree = valueProductOne / valueProductTwo;
        Integer valueLenght, valueLarge, valueHeight, resultValue;
        System.out.print("Input value Length : ");
        valueLenght = inputValue.nextInt();
        System.out.print("Input value Large : ");
        valueLarge = inputValue.nextInt();
        System.out.print("Input value Height : ");
        valueHeight = inputValue.nextInt();
        resultValue = valueLenght * valueLarge * valueHeight;
        System.out.print("Result value : " + valueProductThree * resultValue + " cm");
    }

    public static boolean getYesorNo(String message){
        System.out.print("\n"+message+" (Yes or No) ?");
        Scanner inputUser = new Scanner(System.in);
        String inputChoiceMenu = inputUser.next();

        if(!inputChoiceMenu.equalsIgnoreCase("Yes") && !inputChoiceMenu.equalsIgnoreCase("No")){
            System.err.println("Your choice only Yes Or No!");
            System.out.print("\n"+message+" (Yes or No) ?");
            inputChoiceMenu = inputUser.next();
        }
     return inputChoiceMenu.equalsIgnoreCase("Yes");
    }

    public static void clearScreen(){
        try {
            if (System.getProperty("os.name").contains("Windows")){
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        }
        }catch (Exception e){
            System.err.println("Cannot clear screen");
        }
    }
}
