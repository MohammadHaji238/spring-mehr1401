package com.example._01batchprocessing.service;

import org.springframework.batch.core.*;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

//@Service
public class MyJobScheduler {


    @Autowired
    private JobLauncher jobLauncher;
    @Autowired
    @Qualifier("secondJob")
    private Job secondJob;

    @Scheduled(cron = "0 0/1 * 1/1 * ?")
    public void startJob() throws JobInstanceAlreadyCompleteException, JobExecutionAlreadyRunningException, JobParametersInvalidException, JobRestartException {

        Map<String, JobParameter> params=new HashMap<>();
        params.put("current",new JobParameter(System.currentTimeMillis()));
        JobParameters jobParameters=new JobParameters(params);
        JobExecution   jobExecution = jobLauncher.run(secondJob, jobParameters);
        System.out.println("job execution id"+ jobExecution.getId());
    }
}
