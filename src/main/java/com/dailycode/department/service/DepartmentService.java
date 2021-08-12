package com.dailycode.department.service;

import com.dailycode.department.entity.Department;
import com.dailycode.department.repository.DepartmentRepository;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * File Info {@link }.
 *
 * <b><pre>
 * //==========================================================================
 * //
 * //       Copyright 2020-2020, Blue Yonder Group, Inc.
 * //                   All Rights Reserved
 * //
 * //       THIS IS UNPUBLISHED PROPRIETARY SOURCE CODE OF
 * //                   BLUE YONDER GROUP, INC.
 * //
 * //       The copyright notice above does not evidence any actual
 * //                   or intended publication of such source code.
 * //
 * //===========================================================================
 * </pre></b>
 *
 * @author Naveen Palankar
 */
@Service
@Slf4j
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    Logger log = LoggerFactory.getLogger(DepartmentService.class);

    public Department saveDepartment(Department department) {
        log.info(" In save department of Department Service ");
        return departmentRepository.save(department);
    }

    public Department findDepartmentById(Long departmentId) {
        log.info("In find department by Id of Department Service");
        return departmentRepository.findByDepartmentId(departmentId);
    }
}
