package com.example.day10proj2.repository;

import com.example.day10proj2.domain.Bug;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

import com.example.day10proj2.dto.PriorityCountDto;
import com.example.day10proj2.dto.ProjectBugCountDto;
import com.example.day10proj2.dto.StatusCountDto;

@Repository
public interface BugRepository extends JpaRepository<Bug, Long> {

    @Query("SELECT new com.example.day10proj2.dto.ProjectBugCountDto(b.project.name, COUNT(b)) FROM Bug b GROUP BY b.project.name")
    List<ProjectBugCountDto> getBugCountByProject();

    @Query("SELECT new com.example.day10proj2.dto.StatusCountDto(b.status, COUNT(b)) FROM Bug b GROUP BY b.status")
    List<StatusCountDto> getBugCountByStatus();

    @Query("SELECT new com.example.day10proj2.dto.PriorityCountDto(b.priority, COUNT(b)) FROM Bug b GROUP BY b.priority")
    List<PriorityCountDto> getBugCountByPriority();

    @Query("SELECT new com.example.day10proj2.dto.ProjectBugCountDto(b.project.name, COUNT(b)) FROM Bug b GROUP BY b.project.name ORDER BY COUNT(b) DESC")
    List<ProjectBugCountDto> getTop3ProjectsByBugCount(Pageable pageable);
}
