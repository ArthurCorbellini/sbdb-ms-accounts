package com.artcorb.accounts.entity;

import com.artcorb.accounts.entity.base.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Account extends BaseEntity {

  @Id
  private Long accountNumber;
  private Long customerId;
  private String accountType;
  private String branchAddress;
}
