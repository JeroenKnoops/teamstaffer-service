package com.teamstaffer.web;

import com.teamstaffer.model.StaffMember;
import com.teamstaffer.service.StaffMemberService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/staff/member")
public class StaffMemberController {

    @Autowired
    private StaffMemberService staffMemberService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<StaffMember[]> getStaffMembers() {
        return ResponseEntity.ok(this.staffMemberService.getStaffMembers());
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Long> createStaffMember(@RequestBody StaffMember staffMember) {

        return ResponseEntity.ok(this.staffMemberService.createStaffMember(staffMember).getId());
    }

}
