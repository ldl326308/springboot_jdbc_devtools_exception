
/*
 * User:liveGreen
 * Date: 2019/5/26
 */

package com.green.lc.service;

import com.green.lc.entity.Emp;

import java.util.List;
import java.util.Map;

public interface EmpService {

    int deleteByPrimaryKey(Integer empId);

    int insert(Emp record);

    Emp selectByPrimaryKey(Integer empId);

    List<Emp> selectAll();

    int updateByPrimaryKey(Emp record);

    List<Emp> selectByIdGreater(Integer empId);

    Map<String, Object> getByEmpNameToHashMap(String empName);
}
