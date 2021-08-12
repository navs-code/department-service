package com.dailycode.department.controller;

import com.dailycode.department.entity.Department;
import com.dailycode.department.service.DepartmentService;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    Logger log = LoggerFactory.getLogger(DepartmentController.class);

    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department) {
        log.info(" In save department of Department Controller");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/{id}")
    public Department findDepartmentById(@PathVariable("id") Long departmentId) {
        log.info("In find department by id of Department Controller");
        return departmentService.findDepartmentById(departmentId);
    }

}
