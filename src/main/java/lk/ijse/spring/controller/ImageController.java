package lk.ijse.spring.controller;

import lk.ijse.spring.service.ImageDataService;
import lk.ijse.spring.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.awt.*;
import java.io.IOException;

/**
 * author  Yasith C Bandara
 * created 2/8/2023 - 9:12 AM
 * project spring-image-uploader
 */

@RestController
@RequestMapping("/image")
@CrossOrigin
public class ImageController {

    @Autowired
    ImageDataService service;

    @PostMapping
    public ResponseUtil uploadImage(@RequestParam("img")MultipartFile file) throws IOException {
        String msg = service.uploadImage(file);
        return new ResponseUtil("200",msg,null);
    }

    @GetMapping(value = "/{fileName}", consumes = {MediaType.IMAGE_PNG_VALUE})
    public ResponseUtil downloadImage(@PathVariable String fileName){
        byte[] bytes = service.downloadImage(fileName);
        return new ResponseUtil("200","success",bytes);
    }
}
