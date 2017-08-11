package edu.ucla.ex.java.summer.DIYStack;

public class DIYStackElement {
    private DIYStackElement next;
    private String value;

    public DIYStackElement(String _value, DIYStackElement _next) {
        value = _value;
        next = _next;
    }

    public DIYStackElement getNext(){
        return next;
    }

    public String getValue(){
        return value;
    }

}
