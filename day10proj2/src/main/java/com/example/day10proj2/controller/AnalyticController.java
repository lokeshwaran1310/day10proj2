package com.example.day10proj2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.day10proj2.dto.PriorityCountDto;
import com.example.day10proj2.dto.ProjectBugCountDto;
import com.example.day10proj2.dto.StatusCountDto;
import com.example.day10proj2.service.AnalyticService;

@RestController
@RequestMapping("/api/analytics")
public class AnalyticController {
    @Autowired
    private AnalyticService analyticService;
    @GetMapping("/bugs-by-project")
    public List<ProjectBugCountDto> getBugCountByProject() {
        return analyticService.getBugCountByProject();
    }
    @GetMapping("/bugs-by-status")
    public List<StatusCountDto> getBugCountByStatus() {
        return analyticService.getBugCountByStatus();
    }
    @GetMapping("/bugs-by-priority")
    public List<PriorityCountDto> getBugCountByPriority() {
        return analyticService.getBugCountByPriority();
    }
    @GetMapping("/top-projects")
    public List<ProjectBugCountDto> getTop3ProjectsByBugCount() {
        return analyticService.getTop3ProjectsByBugCount();
    }
}
