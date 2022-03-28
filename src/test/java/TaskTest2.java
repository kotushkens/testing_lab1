import org.junit.jupiter.api.Test;
import task2.AVLTree;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

public class TaskTest2 {
    @Test
    public void insertInTree() {
        AVLTree tree = new AVLTree();

        final int[] input = {17, 15, 16, 23};
        final int[] raw_exp = {16, 15, 17, 23};
        for (int j : input) tree.insertNode(j);


        ArrayList<Integer> expectedValue = new ArrayList<>();
        for (int j : raw_exp) expectedValue.add(j);

        ArrayList<Integer> receivedValue = new ArrayList<>();
        tree.printTree(tree.getRoot(), receivedValue);

        System.out.print("Received Tree: ");
        for (Integer i : receivedValue) {
            System.out.print(i + " ");
        }
        System.out.println();

        assertEquals(expectedValue, receivedValue);
    }

    @Test
    public void deleteFromTree() {
        AVLTree tree = new AVLTree();

        final int[] input = {17, 15, 16, 23};
        final int[] raw_exp = {16, 15, 23};
        for (int j : input) tree.insertNode(j);

        System.out.println("Deleted key 17");
        tree.deleteNode(17);
        tree.deleteNode(8);

        ArrayList<Integer> expectedValue = new ArrayList<>();
        for (int j : raw_exp) expectedValue.add(j);

        ArrayList<Integer> receivedValue = new ArrayList<>();
        tree.printTree(tree.getRoot(), receivedValue);

        System.out.print("Received Tree: ");
        for (Integer i : receivedValue) System.out.print(i + " ");
        System.out.println();

        assertEquals(expectedValue, receivedValue);
    }
}
