package com.example._01batchprocessing.config;

import com.example._01batchprocessing.mode.Student;
import com.example._01batchprocessing.processor.FirstProcessor;
import com.example._01batchprocessing.reader.FirstReader;
import com.example._01batchprocessing.writer.FirstWriter;
import lombok.AllArgsConstructor;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.database.JdbcCursorItemReader;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.batch.item.json.JacksonJsonObjectReader;
import org.springframework.batch.item.json.JsonItemReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.batch.BatchProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.FileSystemResource;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;
import java.io.File;
import java.sql.ResultSet;
import java.sql.SQLException;

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



    @Autowired
    @Qualifier("dataSource2")
    private DataSource dataSource;



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
                .<Student, Student>chunk(3)
                .reader(studentJdbcCursorItemReader())
                //.processor(processor)
                .writer(writer)
                .build();
    }

    //



  /*  @Bean
    public FlatFileItemReader<Student> flatFileItemReader()
    {

        FlatFileItemReader<Student> flatFileItemReader=new FlatFileItemReader();
        //1-location of csv file
        flatFileItemReader.setResource(new FileSystemResource(new File("C:\\Users\\Admin\\IdeaProjects\\spring\\5\\session21\\_03readers\\inputs\\students.csv")));

        //2-line Mapper
        flatFileItemReader.setLineMapper(new DefaultLineMapper<Student>(){
            {
                setLineTokenizer(new DelimitedLineTokenizer(){
                    {
                       // setDelimiter("|");
                        setNames("ID","First Name" ,"Last Name" , "Email");
                    }
                });
                setFieldSetMapper(new BeanWrapperFieldSetMapper<Student>(){
                    {
                        setTargetType(Student.class);
                    }
                });
            }
        });

        flatFileItemReader.setLinesToSkip(1);
        return flatFileItemReader;
    }
*/

 /*   @Bean
    public JsonItemReader<Student> jsonItemReader()
    {

       JsonItemReader<Student>  jsonItemReader=new JsonItemReader<>();
        //1-location of csv file
        jsonItemReader.setResource(new FileSystemResource(new File("C:\\Users\\Admin\\IdeaProjects\\spring\\5\\session21\\_03readers\\inputs\\students.json")));

        //2-line Mapper
        jsonItemReader.setJsonObjectReader(new JacksonJsonObjectReader<>(Student.class));

        return jsonItemReader;
    }*/


    //jdbc
    @Bean
    public JdbcCursorItemReader<Student> studentJdbcCursorItemReader()
    {
        JdbcCursorItemReader<Student>  jdbcCursorItemReader=new JdbcCursorItemReader<>();
        jdbcCursorItemReader.setDataSource(dataSource);
        jdbcCursorItemReader.setSql("select id,first_name as firstName,last_name as lastName,email from students");
       // jdbcCursorItemReader.setRowMapper(new BeanPropertyRowMapper<Student>());
     jdbcCursorItemReader.setRowMapper(new BeanPropertyRowMapper<Student>(){
         {
             setMappedClass(Student.class);
         }
     });
        return jdbcCursorItemReader;
    }

}
