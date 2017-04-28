package com.teamstaffer.service;

import com.teamstaffer.model.Assignment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AssignmentService {

    @Autowired
    private AssignmentRepository assignmentRepository;

    public Assignment[] getAssignments() {

        List<Assignment> AssignmentList = new ArrayList<>();
        for (Assignment s : assignmentRepository.findAll()) {
            AssignmentList.add(s);
        }

        return AssignmentList.stream().toArray(Assignment[]::new);
    }

    public Assignment createAssignment(Assignment assignment) {

        return assignmentRepository.save(assignment);
    }

}
