package com.stat.bradip.resource.counter.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stat.bradip.resource.counter.entity.DifferenceCounter;

public interface DifferenceRepository extends JpaRepository<DifferenceCounter, Integer> {

}
