package com.example._01batchprocessing.writer;

import com.example._01batchprocessing.mode.Student;
import org.springframework.batch.item.ItemWriter;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class FirstWriter  implements ItemWriter<Student> {
    @Override
    public void write(List<? extends Student> list) throws Exception {
        System.out.println("item writer");
        list.stream().forEach(System.out::println);
    }
}
