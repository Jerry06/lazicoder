package com.lazi.coder.web;

import com.lazi.coder.dao.OfficeRepository;
import com.lazi.coder.domain.OfficeFile;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@RestController
public class FileUploadController {
    private static final Logger LOGGER = LoggerFactory
            .getLogger(FileUploadController.class);

    @Autowired
    private OfficeRepository officeRepository;

    @RequestMapping("api/getfile")
    public OfficeFile getFile() throws Exception {
        OfficeFile officeFile = officeRepository.findAll().get(0);
        FileUtils.writeByteArrayToFile(new File("C:\\AAA\\test.docx"), officeFile.getContent());
        return officeFile;
    }

    //    @Autowired
//    private StorageService storageService;  //custom class to handle upload.
    @PostMapping("/api/upload")
    public ResponseEntity<?> uploadFile(
            @RequestParam("file") MultipartFile uploadfile) {

        LOGGER.debug("Single file upload!");

        if (uploadfile.isEmpty()) {
            return new ResponseEntity("please select a file!", HttpStatus.OK);
        }

        try {
//            System.out.println(uploadfile);
            saveUploadedFiles(Arrays.asList(uploadfile));

        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        return new ResponseEntity("Successfully uploaded - " +
                uploadfile.getOriginalFilename(), new HttpHeaders(), HttpStatus.OK);

    }

    //save file
    private void saveUploadedFiles(List<MultipartFile> files) throws IOException {

        for (MultipartFile file : files) {

            if (file.isEmpty()) {
                continue; //next pls
            }

            byte[] bytes = file.getBytes();
            OfficeFile officeFile = new OfficeFile();
            officeFile.setContent(bytes);
            officeFile.setName(file.getOriginalFilename());
            officeRepository.save(officeFile);
        }

    }
}