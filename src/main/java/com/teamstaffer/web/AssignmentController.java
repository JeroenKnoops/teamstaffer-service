package com.teamstaffer.web;

import com.teamstaffer.model.Assignment;
import com.teamstaffer.service.AssignmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/staff/assignment")
public class AssignmentController {

    @Autowired
    private AssignmentService assignmentService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<Assignment[]> getAssignments() {
        return ResponseEntity.ok(this.assignmentService.getAssignments());
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<String> createAssignment(@RequestBody Assignment assignment) {

        return ResponseEntity.ok(this.assignmentService.createAssignment(assignment).getAssignmentName());
    }

}
