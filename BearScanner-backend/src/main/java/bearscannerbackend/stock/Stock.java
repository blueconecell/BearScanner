package bearscannerbackend.stock;

import bearscannerbackend.base.BaseEntity;
import bearscannerbackend.item.Item;
import bearscannerbackend.village.Village;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
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


}
