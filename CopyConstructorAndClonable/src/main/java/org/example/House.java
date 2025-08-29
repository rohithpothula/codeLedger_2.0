package org.example;

public class House implements Cloneable{
    String area;
    int price;
    String House_no;

    House(String area,int price,String house_no){
        this.area=area;
        this.price=price;
        this.House_no=house_no;
    }

    public House clone() throws CloneNotSupportedException {
        return (House) super.clone();
    }
}
