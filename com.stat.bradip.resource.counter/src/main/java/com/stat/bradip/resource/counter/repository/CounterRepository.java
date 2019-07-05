package com.stat.bradip.resource.counter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stat.bradip.resource.counter.entity.Counter;

@Repository
public interface CounterRepository extends JpaRepository<Counter, Integer> {

}
