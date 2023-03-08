package com.anisa.entity;

import com.anisa.customValidation.CouponCode;
import lombok.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;

@Entity(name = "product")
@Setter
@Getter
@RequiredArgsConstructor
@NoArgsConstructor
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NonNull
    @NotNull
    @Size(min = 1,message = "value must not empty")
   // @CouponCode(message = "Must start with OFF")
    private String name;
    @NonNull
    private String description;
    @NonNull
    @Min(value = 1000,message = "the value must be greater than 1000")
    @Max(value = 10000,message = "the value must be less than 10000")
    private BigDecimal price;
}
