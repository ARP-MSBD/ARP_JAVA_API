package com.org.arp.repositories;

import com.org.arp.entities.JobType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobTypeRepository extends JpaRepository<JobType, Integer> {}