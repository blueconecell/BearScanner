package bearscannerbackend;

import bearscannerbackend.job.CraftJob;
import bearscannerbackend.job.LifeJob;
import bearscannerbackend.user.Boss;
import bearscannerbackend.village.Village;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class BearScannerBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(BearScannerBackendApplication.class, args);
    }
}
