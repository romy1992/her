package com.stat.bradip.resource.counter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stat.bradip.resource.counter.entity.CounterYear;

@Repository
public interface CounterYearRepository extends JpaRepository<CounterYear, Integer> {

}
