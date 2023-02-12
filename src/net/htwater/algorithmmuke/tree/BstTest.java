package net.htwater.algorithmmuke.tree;

public class BstTest {
    public static void main(String[] args) {
        Bst<Integer> bst = new Bst<>();
        int[] nums = {5, 3, 6, 8, 4, 2};

        for (int i = 0; i < nums.length; i++) {
            bst.add(nums[i]);
        }

//        System.out.println(bst);
//        bst.preOrder();
//        bst.preOrderByStack();
//        bst.levelOrderByQueue();

//        bst.inOrder();
//
//        System.out.println(bst.minimum());
//        System.out.println(bst.maximum());

//        bst.levelOrderByQueue();
//        System.out.println("===============================");
//        bst.deleteMaximum();
//        bst.levelOrderByQueue();
//        System.out.println("===============================");
//        bst.deleteMaximum();
//        bst.levelOrderByQueue();
//        System.out.println("===============================");
//        bst.deleteMaximum();
//        bst.levelOrderByQueue();
//        System.out.println("===============================");
//        bst.deleteMaximum();
//        bst.levelOrderByQueue();

        bst.levelOrderByQueue();
        System.out.println("===============================");
        bst.delete(2);
        bst.levelOrderByQueue();
        System.out.println("===============================");
        bst.delete(6);
        bst.levelOrderByQueue();
        System.out.println("===============================");
    }
}
