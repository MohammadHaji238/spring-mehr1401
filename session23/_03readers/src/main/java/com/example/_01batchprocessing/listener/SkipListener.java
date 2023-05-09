package com.example._01batchprocessing.listener;

import org.springframework.batch.core.annotation.OnSkipInProcess;
import org.springframework.batch.core.annotation.OnSkipInRead;
import org.springframework.batch.item.file.FlatFileParseException;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

@Component
public class SkipListener {

    @OnSkipInRead
    public void skip(Throwable th)  {

        if (th instanceof FlatFileParseException) {
            System.out.println(" In error");
            FileWriter fileWriter = null;
            try {
                fileWriter = new FileWriter(new File("C:\\Users\\Admin\\IdeaProjects\\spring\\5\\session23\\_03readers\\skip\\students.txt"), true);
                fileWriter.write(((FlatFileParseException) th).getInput());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }


        }
    }
}
