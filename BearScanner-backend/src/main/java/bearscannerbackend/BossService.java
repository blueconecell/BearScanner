package bearscannerbackend;

import bearscannerbackend.job.CraftJob;
import bearscannerbackend.job.LifeJob;
import bearscannerbackend.user.Boss;
import bearscannerbackend.village.Village;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class BossService {

    @PersistenceContext
    private EntityManager em;

    @Transactional
    public void createBossAndVillage() {
        // Boss 객체 생성
        Boss Biryu39 = new Boss();
        Biryu39.setName("Biryu39");
        Biryu39.setLifeJobs(Arrays.asList(LifeJob.FISHER));
        Biryu39.setCraftingJobs(Arrays.asList(CraftJob.BLACKSMITH));

        // Village 객체 생성
        Village vil = new Village();
        vil.setName("소환사협곡");

        // 관계 설정
        Biryu39.setVillage(vil);
        vil.setBosses(Arrays.asList(Biryu39));

        // 영속화
        em.persist(Biryu39);
        em.persist(vil);
    }
}
