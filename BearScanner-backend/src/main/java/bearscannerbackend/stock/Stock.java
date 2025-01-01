package bearscannerbackend.stock;

import bearscannerbackend.base.BaseEntity;
import bearscannerbackend.item.Item;
import bearscannerbackend.village.Village;
import jakarta.persistence.*;

@Entity
public class Stock extends BaseEntity {

    @Id
    @GeneratedValue
    @Column(name = "STOCK_ID")
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "VILLAGE_ID")
    private Village village;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ITEM_ID")
    private Item item;


    public Stock( Village village, Item item) {
        this.village = village;
        this.item = item;
    }

    public Stock() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Village getVillage() {
        return village;
    }

    public void setVillage(Village village) {
        this.village = village;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
}
