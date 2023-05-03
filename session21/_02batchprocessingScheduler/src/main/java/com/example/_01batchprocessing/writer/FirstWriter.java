package com.example._01batchprocessing.writer;

import org.springframework.batch.item.ItemWriter;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class FirstWriter  implements ItemWriter<Long> {
    @Override
    public void write(List<? extends Long> list) throws Exception {
        System.out.println("item writer");
        list.stream().forEach(System.out::println);
    }
}
