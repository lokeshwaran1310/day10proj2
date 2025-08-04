package com.example.day10proj2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.example.day10proj2.dto.PriorityCountDto;
import com.example.day10proj2.dto.ProjectBugCountDto;
import com.example.day10proj2.dto.StatusCountDto;
import com.example.day10proj2.repository.BugRepository;

@Service
public class AnalyticServiceImpl implements AnalyticService {
    @Autowired
    private BugRepository bugRepository;

    public List<ProjectBugCountDto> getBugCountByProject() {
        return bugRepository.getBugCountByProject();
    }

    public List<StatusCountDto> getBugCountByStatus() {
        return bugRepository.getBugCountByStatus();
    }

    public List<PriorityCountDto> getBugCountByPriority() {
        return bugRepository.getBugCountByPriority();
    }

    public List<ProjectBugCountDto> getTop3ProjectsByBugCount() {
        return bugRepository.getTop3ProjectsByBugCount(PageRequest.of(0, 3));
    }
}
