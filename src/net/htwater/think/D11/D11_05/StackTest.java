package net.htwater.think.D11.D11_05;

/**
 * Created by 96955 on 2019/4/16.
 */
public class StackTest {
    public static void main(String[] args) {
//        Stack<String> stack = new Stack<>();
//
//        for (String s : "My dog has fleas".split(" ")) {
//            stack.push(s);
//        }
//
//        System.out.println(stack);
//
        java.util.Stack<String> stackDef=new java.util.Stack<>();

        for (String s : "your cat is die".split(" ")) {
            stackDef.push(s);
        }

        System.out.println(stackDef);

        while (!stackDef.isEmpty()){
            System.out.print(stackDef.pop()+"  ");
        }
//
//        System.out.println(stackDef);
    }
}
