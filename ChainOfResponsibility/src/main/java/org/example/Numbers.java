package org.example;

public class Numbers {
    private int number1;
    private int number2;

    private String caluculationWanted;

    public Numbers(int newNumber1,int newNumber2,String calcwanted){
        this.number1=newNumber1;
        this.number2=newNumber2;
        this.caluculationWanted=calcwanted;
    }

    public int getNumber1(){
        return this.number1;
    }

    public int getNumber2(){
        return this.number2;
    }

    public String getCaluculationWanted(){
        return this.caluculationWanted;
    }
}
