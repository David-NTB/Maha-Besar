package semester1.Tugas11;

import java.util.ArrayList;
import java.util.Random;

public class Sorting {
    ArrayList<Integer> array = new ArrayList<>();
    Random random = new Random();
    int arraySize = 10;

    public static void main(String[] args) throws InterruptedException {
        Sorting arr = new Sorting();

        arr.BubbleAsc();
        arr.BubbleDsc();

        arr.SelectionAsc();
        arr.SelectionDsc();
    }

    public void BubbleAsc() throws InterruptedException {
        System.out.println("Ascending Bubble Array");
        array.removeAll(array);
        generateArray();
        showArray();
        sortBubbleAsc();
        showArray();
        System.out.println();
    }

    public void BubbleDsc() throws InterruptedException {
        System.out.println("Descending Bubble Array");
        array.removeAll(array);
        generateArray();
        showArray();
        sortBubbleDsc();
        showArray();
        System.out.println();
    }

    public void SelectionAsc() throws InterruptedException {
        System.out.println("Ascending Selection Array");
        array.removeAll(array);
        generateArray();
        showArray();
        sortSelectionAsc();
        showArray();
        System.out.println();
    }

    public void SelectionDsc() throws InterruptedException {
        System.out.println("Descending Selection Array");
        array.removeAll(array);
        generateArray();
        showArray();
        sortSelectionDsc();
        showArray();
        System.out.println();
    }

    public void sortSelectionAsc() throws InterruptedException {
        for (int i = 0; i < array.size(); i++) {
            int hold = i;

            for (int j = i; j < array.size(); j++) {
                if (array.get(j) < array.get(hold)) {
                    hold = j;
                }
            }
            int temp = array.get(hold);
            array.set(hold, array.get(i));
            array.set(i, temp);
        }
    }

    public void sortSelectionDsc() throws InterruptedException {
        for (int i = 0; i < array.size(); i++) {
            int hold = i;

            for (int j = i; j < array.size(); j++) {
                if (array.get(j) > array.get(hold)) {
                    hold = j;
                }
            }
            int temp = array.get(hold);
            array.set(hold, array.get(i));
            array.set(i, temp);
        }
    }

    public void sortBubbleAsc() throws InterruptedException {
        for (int i = 0; i < array.size() - 1; i++) {
            for (int j = array.size()-1; j > 0; j--) {
                if (array.get(j) < array.get(j - 1)) {
                    int temp = array.get(j);
                    array.set(j, array.get(j - 1));
                    array.set(j - 1, temp);
                }
            }
        }
    }

    public void sortBubbleDsc() throws InterruptedException {
        for (int i = 0; i < array.size(); i++) {
            for (int j = array.size() - 1; j > 0; j--) {
                if (array.get(j) > array.get(j - 1)) {
                    int temp = array.get(j);
                    array.set(j, array.get(j - 1));
                    array.set(j - 1, temp);
                }
            }
        }
    }

    public void generateArray() {
        for (int i = 1; i <= arraySize; i++) {
            array.add(random.nextInt(100));
        }
    }

    public void showArray() {
        System.out.print("Array : ");
        for (int i = 0; i < array.size(); i++) {
            System.out.print(array.get(i) + " ");
        }
        System.out.println();
    }
}