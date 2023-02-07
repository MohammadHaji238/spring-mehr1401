package com.anisa.Lambda;

public class Test {
    public static void main(String[] args) {
        Human human=new MahsaHuman();



        //anonymous class
        Human ashkan=new Human() {
            @Override
            public void talk() {
                System.out.println("arabi");
            }
        };
        ashkan.talk();


        //->
        //::
        Human kiarash=()-> System.out.println("english");

        kiarash.talk();



    }
}
