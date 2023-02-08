package lk.ijse.spring.service;

import lk.ijse.spring.entity.ImageData;
import lk.ijse.spring.repo.ImageDataRepo;
import lk.ijse.spring.util.ImageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Optional;

/**
 * author  Yasith C Bandara
 * created 2/8/2023 - 8:37 AM
 * project spring-image-uploader
 */

@Service
public class ImageDataService {

    @Autowired
    private ImageDataRepo imageDataRepo;

    public String uploadImage(MultipartFile file) throws IOException {
        ImageData save = imageDataRepo.save(ImageData.builder()
                .name(file.getOriginalFilename())
                .type(file.getContentType())
                .imageData(ImageUtils.compressImage(file.getBytes())).build());

        return "Image upload successful "+ file.getOriginalFilename();
    }

    public byte[] downloadImage(String fileName){
        Optional<ImageData> imageData = imageDataRepo.findByName(fileName);
        return ImageUtils.decompressImage(imageData.get().getImageData());
    }
}
