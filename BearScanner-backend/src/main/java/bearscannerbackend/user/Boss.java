package bearscannerbackend.user;

import bearscannerbackend.job.CraftJob;
import bearscannerbackend.job.LifeJob;
import bearscannerbackend.village.Village;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
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

    public Boss( String name, List<LifeJob> lifeJobs, List<CraftJob> craftingJobs) {
        this.name = name;
        this.lifeJobs = lifeJobs;
        this.craftingJobs = craftingJobs;
    }

    public Boss() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<LifeJob> getLifeJobs() {
        return lifeJobs;
    }

    public void setLifeJobs(List<LifeJob> lifeJobs) {
        this.lifeJobs = lifeJobs;
    }

    public List<CraftJob> getCraftingJobs() {
        return craftingJobs;
    }

    public void setCraftingJobs(List<CraftJob> craftingJobs) {
        this.craftingJobs = craftingJobs;
    }

    public Village getVillage() {
        return village;
    }

    public void setVillage(Village village) {
        this.village = village;
    }
}
