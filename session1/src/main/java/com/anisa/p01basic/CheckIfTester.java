package com.anisa.p01basic;

public class CheckIfTester implements CheckProgrammer{
    @Override
    public boolean test(Programmer programmer) {
        return programmer.canTest();
    }
}
