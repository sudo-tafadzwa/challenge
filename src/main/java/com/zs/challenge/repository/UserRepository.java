package com.zs.challenge;

import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;

public interface UserRepository extends JpaRepository<Users, BigInteger> {
}
