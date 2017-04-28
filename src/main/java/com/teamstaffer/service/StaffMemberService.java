package com.teamstaffer.service;

import com.teamstaffer.model.StaffMember;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StaffMemberService {

    @Autowired
    private StaffMemberRepository staffMemberRepository;

    public StaffMember[] getStaffMembers() {

        List<StaffMember> staffMemberList = new ArrayList<>();
        for (StaffMember s : staffMemberRepository.findAll()) {
            staffMemberList.add(s);
        }

        return staffMemberList.stream().toArray(StaffMember[]::new);
    }

    public StaffMember createStaffMember(StaffMember staffMember) {

        return staffMemberRepository.save(staffMember);
    }

}
