package com.anisa.p01basic;

import java.util.ArrayList;
import java.util.List;

public class Test4 {
    public static void main(String[] args) {
        var programmers=new ArrayList<Programmer>();
        programmers.add(new Programmer("ali",true,true));
        programmers.add(new Programmer("neda",true,false));
        programmers.add(new Programmer("mahsa",false,false));
        programmers.add(new Programmer("reza",false,true));
        programmers.add(new Programmer("ashkan",false,true));
        
        show(programmers,(Programmer programmer)-> ! programmer.canDoc());
    }

    static void show(List<Programmer> programmerList,CheckProgrammer checkProgrammer)
    {
        for (Programmer programmer:programmerList)
        {
            if (checkProgrammer.test(programmer))
                System.out.println(programmer);
        }
    }
}
