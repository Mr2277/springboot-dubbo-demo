package com.sao.prototype.person;

public abstract class AbstractPerson implements Cloneable {

    public AbstractPerson clone() throws CloneNotSupportedException {

        return (AbstractPerson) super.clone();

    }

}
