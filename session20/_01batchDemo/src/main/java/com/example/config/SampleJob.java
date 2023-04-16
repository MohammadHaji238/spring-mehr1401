package com.example.config;

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

import java.lang.annotation.Repeatable;

@Configuration
@AllArgsConstructor
public class SampleJob {

    @Autowired
    private JobBuilderFactory jobBuilderFactory;
    @Autowired
    private StepBuilderFactory stepBuilderFactory;


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
}
