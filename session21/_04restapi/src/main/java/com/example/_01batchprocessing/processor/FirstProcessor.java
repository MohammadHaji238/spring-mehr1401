package com.example._01batchprocessing.processor;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

@Component
public class FirstProcessor implements ItemProcessor<Integer,Long> {
    @Override
    public Long process(Integer integer) throws Exception {
        System.out.println("item processor");
        return Long.valueOf(integer+10);
    }
}
