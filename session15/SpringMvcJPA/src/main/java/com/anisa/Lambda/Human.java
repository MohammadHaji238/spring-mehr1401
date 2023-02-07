package com.anisa.Lambda;
//sam
@FunctionalInterface
public interface Human {
    void talk();

    default  void  speak(){}
    default  void  speak2(){}
    default  void  speak3(){}
}
