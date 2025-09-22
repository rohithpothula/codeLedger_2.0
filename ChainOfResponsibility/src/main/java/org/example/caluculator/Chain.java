package org.example.caluculator;

public interface Chain {

    public void setNextChain(Chain nextChain);

    public void caluculate(Numbers Request);
}
