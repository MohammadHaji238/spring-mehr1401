package com.example._01batchprocessing.config;

import com.example._01batchprocessing.processor.FirstProcessor;
import com.example._01batchprocessing.reader.FirstReader;
import com.example._01batchprocessing.writer.FirstWriter;
import lombok.AllArgsConstructor;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@AllArgsConstructor
public class SampleJob {

    @Autowired
    private JobBuilderFactory jobBuilderFactory;
    @Autowired
    private StepBuilderFactory stepBuilderFactory;


    @Autowired
    private FirstReader reader;
    @Autowired
    private FirstProcessor processor;
    @Autowired
    private FirstWriter writer;

/*
    @Bean
    public Job firstJob() {

        return jobBuilderFactory.get("my Job")
                .start(firstStep())
                .incrementer(new RunIdIncrementer())
                .next(secondStep())
                .incrementer(new RunIdIncrementer())
                .build();
    }
    @Bean
    public Step  firstStep()
    {
        return stepBuilderFactory.get("first step")
                .tasklet(firstTasklet()).build();
    }
    @Bean

    public Tasklet firstTasklet()
    {
        return (stepContribution, chunkContext) -> {
            System.out.println("first tasklet step");
            return RepeatStatus.FINISHED;
        };
    }
    //2
    @Bean
    public Step  secondStep()
    {
        return stepBuilderFactory.get("second step")
                .tasklet(secondTasklet()).build();
    }
    @Bean

    public Tasklet secondTasklet()
    {
        return (stepContribution, chunkContext) -> {
            System.out.println("second tasklet step");
            return RepeatStatus.FINISHED;
        };
    }
*/

    //chunk oriented processing



    @Bean
    public Job secondJob(){
        return jobBuilderFactory.get("second Job")
                .incrementer(new RunIdIncrementer())
                .start(firstChunkStep())
                .build();
    }

    @Bean
    public Step firstChunkStep()
    {
        return stepBuilderFactory.get("first chunk step")
                .<Integer,Long>chunk(3)
                .reader(reader)
                .processor(processor)
                .writer(writer)
                .build();
    }

}
