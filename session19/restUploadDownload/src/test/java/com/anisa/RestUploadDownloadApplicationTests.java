package com.anisa;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.*;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

@SpringBootTest
class RestUploadDownloadApplicationTests {



	private final  static  String DOWNLOAD_PATH="C:\\Users\\Admin\\IdeaProjects\\spring\\5\\session19\\restUploadDownload\\download";
	@Autowired
	private RestTemplate restTemplate;
	@Test
	void testUpload() {

		HttpHeaders headers=new HttpHeaders();
		headers.setContentType(MediaType.MULTIPART_FORM_DATA);

		MultiValueMap<String,Object> body=new LinkedMultiValueMap<>();
		body.add("file",new ClassPathResource("mypic.png"));


		//

		HttpEntity<MultiValueMap<String,Object>> httpEntity=new HttpEntity<>(body,headers);


		ResponseEntity<Boolean> response=restTemplate.postForEntity("http://localhost:8080/upload",httpEntity,Boolean.class);

		System.out.println(response.getBody());

	}

	@Test
	void testDownload() throws IOException {
		HttpHeaders headers=new HttpHeaders();
		headers.setAccept(List.of(MediaType.IMAGE_JPEG));


		HttpEntity<String> httpEntity=new HttpEntity<>(headers);

		String fileName="mypic.png";

		ResponseEntity<byte[]> response=restTemplate.exchange("http://localhost:8080/download/"+fileName, HttpMethod.GET,httpEntity,byte[].class);

		Files.write(Paths.get(DOWNLOAD_PATH+"\\"+fileName),response.getBody());
	}

}
