package ir.digixo.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
@Entity
@Setter
@Getter
@AllArgsConstructor
@RequiredArgsConstructor
public class Product {
    @Id
    private Long id;
    private String name;
    private String description;
    private BigDecimal price;

}
