// © KONINKLIJKE PHILIPS N.V., 2016
// All rights are reserved. Reproduction in whole or in part is prohibited without the prior
// written consent of the copyright holder.
//
// This source code and any compilation or derivative thereof is the proprietary information
// of KONINKLIJKE PHILIPS N.V. and is confidential in nature. Under no circumstances is this
// software to be combined with any Open Source Software in any way or placed under an Open
// Source License of any type without the express written permission of KONINKLIJKE PHILIPS N.V.

package com.teamstaffer.service;

import com.teamstaffer.model.StaffMember;

import org.springframework.data.repository.CrudRepository;

public interface StaffMemberRepository extends CrudRepository<StaffMember, Long> {

    StaffMember findById(Long id);

    StaffMember findByName(String name);
}
