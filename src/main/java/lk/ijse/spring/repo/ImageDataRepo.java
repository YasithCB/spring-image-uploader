package lk.ijse.spring.repo;

import lk.ijse.spring.entity.ImageData;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * author  Yasith C Bandara
 * created 2/8/2023 - 8:33 AM
 * project spring-image-uploader
 */

public interface ImageDataRepo extends JpaRepository<ImageData,Long> {

    Optional<ImageData> findByName(String name);
}
