package bearscannerbackend.base;

import jakarta.persistence.MappedSuperclass;

import java.time.LocalDateTime;

@MappedSuperclass
public class User {
    private LocalDateTime createdDate;
    private LocalDateTime lastModifiedDate;
}
