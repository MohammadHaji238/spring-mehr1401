package com.example.files;

import com.example.files.entity.Image;
import com.example.files.repository.ImageRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

@SpringBootTest
class FilesApplicationTests {

    @Autowired
    private ImageRepository imageRepository;
    @Test
    void contextLoads() {
    }


    @Test
    public void saveImage() throws IOException {

        Image image=new Image();
        image.setId(2l);
        image.setName("test.png");

        File file=new File("C:\\Users\\Admin\\OneDrive\\spring\\DevOps RoadMap 2.png");
        byte[] filecontent = new byte[(int) file.length()];
        FileInputStream fileInputStream = new FileInputStream(file);
        fileInputStream.read(filecontent);
        image.setData(filecontent);
        imageRepository.save(image);
        fileInputStream.close();

    }
}
