package ir.digixo.springdata.transactionmanagement.repos;

import ir.digixo.springdata.transactionmanagement.entities.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface BankAccountRepository extends JpaRepository<BankAccount,Long> {
    BankAccount findByAccno(Long accNo);
    void deleteByAccno(Long id);
}
