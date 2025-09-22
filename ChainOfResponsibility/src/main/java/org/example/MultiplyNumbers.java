package org.example;

public class MultiplyNumbers implements Chain{

    private Chain nextChain;

    @Override
    public void setNextChain(Chain nextChain) {
        this.nextChain=nextChain;
    }

    @Override
    public void caluculate(Numbers request) {
        if(request.getCaluculationWanted().equals("mult")){
            System.out.println(request.getNumber1()*request.getNumber2());
        }
        else {
            if (nextChain != null) {
                nextChain.caluculate(request);
            } else {
                System.out.println("Operation not supported.");
            }
        }
    }
}
