package bearscannerbackend.village;

import bearscannerbackend.base.BaseEntity;
import bearscannerbackend.stock.Stock;
import bearscannerbackend.user.Boss;
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
public class Village extends BaseEntity {

    @Id
    @GeneratedValue
    @Column(name = "VILLAGE_ID")
    private long id;
    private String name;
    @OneToMany(mappedBy = "village")
    private List<Boss> bosses = new ArrayList<>();

    @OneToMany(mappedBy = "village")
    private List<Stock> stocks = new ArrayList<>();

}
