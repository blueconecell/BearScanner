package bearscannerbackend;

import bearscannerbackend.job.CraftJob;
import bearscannerbackend.job.LifeJob;
import bearscannerbackend.user.Boss;
import bearscannerbackend.village.Village;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Arrays;

@SpringBootApplication
public class BearScannerBackendApplication {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("bearScanner");
        EntityManager em = emf.createEntityManager();

        EntityTransaction ts = em.getTransaction();
        ts.begin();

        try {
            Boss Biryu39 = new Boss("Biryu39", Arrays.asList(LifeJob.FISHER), Arrays.asList(CraftJob.BLACKSMITH));
            Village lol = new Village("소환사협곡");
            Biryu39.setVillage(lol);
            lol.setBosses(Arrays.asList(Biryu39));

            em.persist(Biryu39);
            em.persist(lol);
            ts.commit();


        } catch (Exception e) {
            ts.rollback();
        }
        finally {
            em.close();
        }
        emf.close();
    }
}
