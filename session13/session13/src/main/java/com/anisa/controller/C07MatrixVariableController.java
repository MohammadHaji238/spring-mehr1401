package com.anisa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class C07MatrixVariableController {




    @GetMapping("/matrix/{name}")
    public String matrixVariable(@PathVariable String name, @MatrixVariable int id, Model model)
    {
        System.out.println(id);
        return "product";
    }
    @GetMapping("/matrix2/{name}")
    public String twoMatrixVariable(
            @PathVariable String name,
            @MatrixVariable(name = "id",pathVar = "name") int id,
            @MatrixVariable(name = "code",pathVar = "name") int code,
            @MatrixVariable(name = "year",pathVar = "name") int year,
                                    Model model)
    {
        System.out.println(id);
        System.out.println(code);
        System.out.println(year);
        return "product";
    }
}
