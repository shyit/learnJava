package net.htwater.think.D11.D11_02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by 96955 on 2019/4/3.
 */
public class AsListInference {

    public static void main(String[] args) {
        List<Snow> snowList = Arrays.asList(new Snow(), new Powder(), new Light(), new Heavy(), new Crusty(), new Slush());
        List<Snow> snowArrayList=new ArrayList<>();
        snowArrayList.add(new Snow());
        snowArrayList.add(new Light());
        snowList.toArray();
    }
}

class Snow {

}

class Powder extends Snow {

}

class Light extends Powder {

}

class Heavy extends Powder {

}

class Crusty extends Snow {

}

class Slush extends Snow {

}

