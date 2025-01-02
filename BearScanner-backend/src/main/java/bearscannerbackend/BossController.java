package bearscannerbackend;

import bearscannerbackend.BossService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BossController {

    private final BossService bossService;

    public BossController(BossService bossService) {
        this.bossService = bossService;
    }

    @GetMapping("/create-boss")
    public String createBoss() {
        bossService.createBossAndVillage();
        return "Boss and Village created successfully!";
    }
}
