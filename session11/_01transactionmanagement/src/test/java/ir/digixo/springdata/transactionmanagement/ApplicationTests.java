package ir.digixo.springdata.transactionmanagement;

import ir.digixo.springdata.transactionmanagement.entities.BankAccount;
import ir.digixo.springdata.transactionmanagement.repos.BankAccountRepository;
import ir.digixo.springdata.transactionmanagement.services.BankAccountService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.core.AutoConfigureCache;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

@SpringBootTest
class ApplicationTests {

    @Autowired
    BankAccountService service;

    @Autowired
    private BankAccountRepository repository;

    @Test
    void contextLoads() {
    }

    @Test
    void createAccounts() {
        BankAccount acc1 = new BankAccount();
        acc1.setAccno(1l);
        acc1.setFirstName("ali");
        acc1.setLastName("rahimi");
        acc1.setBalance(new BigDecimal("1000"));
        BankAccount acc2 = new BankAccount();
        acc2.setFirstName("mahsa");
        acc2.setLastName("naderi");
        acc2.setBalance(new BigDecimal("1000"));
        acc2.setAccno(2l);
        repository.save(acc1);
        repository.save(acc2);
    }
    @Test
    void updateAccounts()
    {

        BankAccount acc1 = repository.findByAccno(1l);
        acc1.setBalance(new BigDecimal("1000"));
        BankAccount acc2 = repository.findByAccno(2l);
        acc2.setBalance(new BigDecimal("1000"));

        repository.save(acc1);
        repository.save(acc2);
    }

    @Test
    void testTransfer() {


        BankAccount acc1 = repository.findByAccno(1l);
        BankAccount acc2 = repository.findByAccno(2l);
        service.transfer(acc1, acc2, 500d);






    }

}
