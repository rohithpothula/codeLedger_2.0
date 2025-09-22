package org.example;

public class SubNumbers implements Chain{

    private Chain nextChain;

    @Override
    public void setNextChain(Chain nextChain) {
        this.nextChain=nextChain;
    }

    @Override
    public void caluculate(Numbers request) {
        if(request.getCaluculationWanted().equals("sub")){
            System.out.println("SubractNumbers:" + (request.getNumber1()-request.getNumber2()));
        }
        else{
            if (nextChain != null) {
                nextChain.caluculate(request);
            } else {
                System.out.println("Operation not supported.");
            }
        }
    }
}
