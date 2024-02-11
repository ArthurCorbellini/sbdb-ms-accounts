package com.corbellini.accounts.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.corbellini.accounts.entity.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {

  Optional<Account> findByCustomerId(Long customerId);
}