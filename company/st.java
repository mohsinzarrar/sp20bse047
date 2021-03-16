package com.company;

class HotDogStand {
    int ID;
    int hotdogs_sold;
    HotDogStand(){
        System.out.println("constructor without arguments");
    }
    HotDogStand(int i,int HDS){
        this.ID=i;
        this.hotdogs_sold=HDS;
        System.out.println("the id is"+ID);


    }
    void justSold(){

        hotdogs_sold=+1;
        System.out.println("the number of hotdog sold is equal to "+hotdogs_sold);


    }

}
class runner {
    public static void main(String[] args) {
        HotDogStand i = new HotDogStand(1020, 20);
        i.justSold();
    }
}
