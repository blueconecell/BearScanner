package bearscannerbackend.village;

import bearscannerbackend.base.BaseEntity;
import bearscannerbackend.stock.Stock;
import bearscannerbackend.user.Boss;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
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

    public Village(String name) {
        this.name = name;
    }

    public Village() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Boss> getBosses() {
        return bosses;
    }

    public void setBosses(List<Boss> bosses) {
        this.bosses = bosses;
    }

    public List<Stock> getStocks() {
        return stocks;
    }

    public void setStocks(List<Stock> stocks) {
        this.stocks = stocks;
    }
}
