package ir.digixo.entity;

import lombok.*;

import javax.persistence.*;

@Entity(name = "product")
@Table(name = "product")
@Setter
@Getter
@RequiredArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NonNull
    private String name;
    @NonNull
    private String description;
    @NonNull
    private int price;



}
