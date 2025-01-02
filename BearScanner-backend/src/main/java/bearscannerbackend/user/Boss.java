package bearscannerbackend.user;

import bearscannerbackend.job.CraftJob;
import bearscannerbackend.job.LifeJob;
import bearscannerbackend.village.Village;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
public class Boss {
    @Id
    @GeneratedValue
    @Column(name = "BOSS_ID")
    private Long id;
    private String name;
    private List<LifeJob> lifeJobs= new ArrayList<>();
    private List<CraftJob> craftingJobs = new ArrayList<>();

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "VILLAGE_ID")
    private Village village;

}
