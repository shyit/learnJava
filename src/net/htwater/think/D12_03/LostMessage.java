package net.htwater.think.D12_03;

/**
 * Created by cambrian on 2019/5/4.
 */
public class LostMessage {
}

class VeryImportantException extends Exception{
    @Override
    public String toString() {
        return "A very import exception";
    }
}

class NormalException extends Exception{
    @Override
    public String toString() {
        return "A normal exception";
    }
}
