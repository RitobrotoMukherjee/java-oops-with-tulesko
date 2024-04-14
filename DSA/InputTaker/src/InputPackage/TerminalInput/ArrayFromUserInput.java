package src.InputPackage.TerminalInput;

public class ArrayFromUserInput {

    private int arr[];
    private int size;

    public ArrayFromUserInput(int size) {
        this.size = size;
        this.arr = new int[size];
    }


    // public int[] create(int ...elements) {
    //     for(int i = 0; i < this.size; i++) {
    //         this.arr[i] = elements[i];
    //     }

    //     return this.arr;
    // }

    public int[] create(int[] inpArr) {
        for(int i = 0; i < inpArr.length; i++) {
            this.arr[i] = inpArr[i];
        }

        return this.arr;
    }

    public void show() {
        System.out.println("Printing the newly created array");

        System.out.print('{');
        for(int i: this.arr) {
            System.out.println(' ' + i + ' ');
        }
        System.out.print('}');
    }

    public int[] updateElementAt(int index, int newValue) {
        this.arr[index] = newValue;

        return this.arr;
    }

    public int[] deleteElement(int value) {
        int[] temp = new int[this.size - 1];
        int i = 0;
        while(i < this.size) {
            if(this.arr[i] == value) {
                continue;
            }
            temp[i] = this.arr[i];
            i++;
        }

        return temp;
    }
    
}
