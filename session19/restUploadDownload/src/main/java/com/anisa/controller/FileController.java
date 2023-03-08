package com.anisa.controller;


import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

@RestController
@RequestMapping("/")
public class FileController {

    private static  final  String UPLOAD_DIR="C:\\Users\\Admin\\IdeaProjects\\spring\\5\\session19\\restUploadDownload\\upload";

    @PostMapping("/upload")
    public Boolean upload(@RequestParam("file") MultipartFile file) throws IOException {

        file.transferTo(new File(UPLOAD_DIR+"\\"+file.getOriginalFilename()));
        return true;
    }

    @GetMapping("/download/{fileName}")
    public ResponseEntity<byte[]> download(@PathVariable("fileName") String fileName) throws IOException {
        byte[] fileData = Files.readAllBytes(new File(UPLOAD_DIR + "\\" + fileName).toPath());


        HttpHeaders headers=new HttpHeaders();
        headers.setContentType(MediaType.IMAGE_JPEG);

        ResponseEntity<byte[]> responseEntity=new ResponseEntity<>(fileData,headers, HttpStatus.OK);
        return responseEntity;


    }
}
