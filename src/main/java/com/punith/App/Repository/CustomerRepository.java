package com.punith.App.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.punith.App.Domain.CustomerDetails;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerDetails, Long> {

}
