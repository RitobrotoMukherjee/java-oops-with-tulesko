package src;
// package ;

import java.util.Scanner;
import src.InputPackage.TerminalInput.ArrayFromUserInput;

class InputPackageClass {
    final static String DESCRIPTION = "Hello this is our input taker package";

    private int sizeOfArray;
    private Scanner sc;

    public InputPackageClass() {
        this.sizeOfArray = 0;
        this.sc = new Scanner(System.in);
    }

    private void takeArraySize() {
        
        while(this.sizeOfArray <= 0) {
            System.out.println("\nYou have entered: " + this.sizeOfArray + " which is less than or equals to zero\n");
            System.out.println("\tEnter Size Of Array > 0 ");
            System.out.print("\tYour Input: ");
            this.sizeOfArray = sc.nextInt();
            System.out.println();
        }
    }

    private int getArraySize() {
        return this.sizeOfArray;
    }

    public static void main (String args[]) {
        System.out.println(InputPackageClass.DESCRIPTION);

        InputPackageClass mainClassObj = new InputPackageClass();
        mainClassObj.takeArraySize();
        int userInputArraySize = mainClassObj.getArraySize();

        int operationalArray[] = new int[]{15, -2, -2, -8, 1, 7, 10, 23};

        if(operationalArray.length > userInputArraySize) {
            System.out.println("\n\nArray Size must be greater than or equals to: " + userInputArraySize);
            return;
        }

        System.out.println("\nThe Size Of Input Array Is: " + userInputArraySize);

        ArrayFromUserInput arrObj = new ArrayFromUserInput(userInputArraySize);

        System.out.println("\n Printing Non-Initialized Array ");

        arrObj.show();

        System.out.println("\n Adding Element to Array.... " );

        arrObj.create(operationalArray);

        System.out.println("\n Printing Updated Array.... " );
        arrObj.show();

    }
}