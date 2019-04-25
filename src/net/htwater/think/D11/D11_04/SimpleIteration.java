package net.htwater.think.D11.D11_04;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by 96955 on 2019/4/12.
 */
public class SimpleIteration {

    public static void main(String[] args){
        List<String> strs=new ArrayList<>();
        strs.add("a");
        strs.add("bb");
        strs.add("ccc");
        strs.add("D");
        strs.add("EE");
        strs.add("FFF");

        System.out.println(strs);

//        Iterator iterator=strs.iterator();
//        while (iterator.hasNext()){
//            iterator.next();
//            iterator.remove();
//        }

        ListIterator listIterator=strs.listIterator(2);

        while (listIterator.hasNext()){
            System.out.print(listIterator.nextIndex()+"."+listIterator.next()+"  ");
        }
        System.out.println();

        while (listIterator.hasPrevious()){
            System.out.print(listIterator.previousIndex()+"."+listIterator.previous()+"  ");
        }
        System.out.println();


//        System.out.println(strs);

    }

}
