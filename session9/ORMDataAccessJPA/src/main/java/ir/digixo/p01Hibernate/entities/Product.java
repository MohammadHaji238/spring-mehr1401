package ir.digixo.p01Hibernate.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "product")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class Product implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    /*@Column(name = "product_name")*/
    @NonNull
    private String name;
    @NonNull
    private int price;


    @ManyToOne(fetch = FetchType.LAZY)
    @NonNull
   private Category category;


    public Product(@NonNull String name, @NonNull int price) {
        this.name = name;
        this.price = price;
    }
}
