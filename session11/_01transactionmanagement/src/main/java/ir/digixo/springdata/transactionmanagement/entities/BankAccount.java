package ir.digixo.springdata.transactionmanagement.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "bankaccount")
public class BankAccount {
    @Id
    @Column(name = "account_number")
    private Long accno;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    private BigDecimal balance;
}
