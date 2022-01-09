package com.company.properties.encapsulation.accessModifiers;

public class ObjectDemo {
    int num ;
    String name;

    public ObjectDemo(int num, String name) {
        this.num = num;
        this.name = name ;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return this.num == ((ObjectDemo)obj).num;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "you call the Overridden toString() in ObjectDemo class";
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
