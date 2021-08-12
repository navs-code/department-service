package com.dailycode.department.repository;

import com.dailycode.department.entity.Department;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

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
@Repository
public interface DepartmentRepository  extends JpaRepository<Department, Long> {

    Department findByDepartmentId(Long departmentId);
}
