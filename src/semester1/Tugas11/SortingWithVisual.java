package semester1.Tugas11;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class SortingWithVisual {
    JFrame frame = new JFrame();
    JLabel greenLabel = new JLabel();

    ArrayList<Integer> array = new ArrayList<>();
    Random random = new Random();
    int arraySize = 200;
    int barHeight;
    int frameX = 1020;
    int frameY = 550;

    public static void main(String[] args) throws InterruptedException {
        SortingWithVisual arr = new SortingWithVisual();
        arr.createFrame();

        arr.BubbleAsc();
        arr.BubbleDsc();

        arr.SelectionAsc();
        arr.SelectionDsc();
    }

    public void createFrame() {
        frame.setTitle("Sorting test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(frameX, frameY);
        frame.getContentPane().setBackground(Color.BLACK);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public void generateBar() throws InterruptedException {
        Thread.sleep(5);
        frame.getContentPane().removeAll();

        for (int i = 0; i < array.size(); i++) {
            barHeight = array.get(i);

            JLabel label = new JLabel();
            label.setBounds(0 + (5 * i), frameY - barHeight - 45, 5, barHeight);
            label.setBackground(Color.WHITE);
            label.setOpaque(true);

            frame.add(label);
        }
        frame.repaint();
    }

    public void greenBar(int i) throws InterruptedException {
        Thread.sleep(5);

        barHeight = frameY;

        greenLabel.setBounds((i * 5) - 5, frameY - barHeight - 45, 5, barHeight);
        greenLabel.setBackground(Color.GREEN);
        greenLabel.setOpaque(true);

        frame.add(greenLabel);
        greenLabel.repaint();
    }

    public void BubbleAsc() throws InterruptedException {
        frame.setTitle("Ascending Bubble Sorting");
        System.out.println("Ascending Array");
        array.removeAll(array);
        generateArray();
        showArray();
        sortBubbleAsc();
        showArray();
        System.out.println();
    }

    public void BubbleDsc() throws InterruptedException {
        frame.setTitle("Descending Bubble Sorting");
        System.out.println("Descending Array");
        array.removeAll(array);
        generateArray();
        showArray();
        sortBubbleDsc();
        showArray();
        System.out.println();
    }

    public void SelectionAsc() throws InterruptedException {
        frame.setTitle("Ascending Selection Sorting");
        System.out.println("Descending Array");
        array.removeAll(array);
        generateArray();
        showArray();
        sortSelectionAsc();
        showArray();
        System.out.println();
    }

    public void SelectionDsc() throws InterruptedException {
        frame.setTitle("Descending Selection Sorting");
        System.out.println("Descending Array");
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

            generateBar();
            for (int j = i; j < array.size(); j++) {
                if (array.get(j) < array.get(hold)) {
                    hold = j;
                    greenBar(j);
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
                    greenBar(j);
                }
            }
            int temp = array.get(hold);
            array.set(hold, array.get(i));
            array.set(i, temp);
            generateBar();
        }
    }

    public void sortBubbleAsc() throws InterruptedException {
        for (int i = 0; i < array.size() - 1; i++) {
            generateBar();
            for (int j = array.size() - 1; j > 0; j--) {
                if (array.get(j) < array.get(j - 1)) {
                    int temp = array.get(j);
                    array.set(j, array.get(j - 1));
                    array.set(j - 1, temp);
                    greenBar(array.size() - j + i + 2);
                }
            }
        }
    }

    public void sortBubbleDsc() throws InterruptedException {
        for (int i = 0; i < array.size(); i++) {
            generateBar();
            for (int j = array.size() - 1; j > 0; j--) {
                if (array.get(j) > array.get(j - 1)) {
                    int temp = array.get(j);
                    array.set(j, array.get(j - 1));
                    array.set(j - 1, temp);
                    greenBar(array.size() - j + i + 2);
                }
            }
        }
    }

    public void generateArray() {
        for (int i = 1; i <= arraySize; i++) {
            array.add(random.nextInt(500));
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