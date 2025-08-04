package com.example.day10proj2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import com.example.day10proj2.dto.PriorityCountDto;
import com.example.day10proj2.dto.ProjectBugCountDto;
import com.example.day10proj2.dto.StatusCountDto;

public interface AnalyticService {

List<ProjectBugCountDto> getBugCountByProject();
List<StatusCountDto> getBugCountByStatus();
List<PriorityCountDto> getBugCountByPriority();
List<ProjectBugCountDto> getTop3ProjectsByBugCount();
    
    
}
