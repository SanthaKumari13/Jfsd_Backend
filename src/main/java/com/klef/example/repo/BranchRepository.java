package com.klef.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.klef.example.entity.Branch;

public interface BranchRepository extends JpaRepository<Branch, Long> {}
