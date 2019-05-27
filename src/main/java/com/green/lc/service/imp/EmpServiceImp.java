
/*
 * User:liveGreen
 * Date: 2019/5/26
 */

package com.green.lc.service.imp;

import com.green.lc.dao.EmpDAO;
import com.green.lc.entity.Emp;
import com.green.lc.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class EmpServiceImp implements EmpService {

    @Autowired
    private EmpDAO empDAO;

    @Override
    public int deleteByPrimaryKey(Integer empId) {
        return empDAO.deleteByPrimaryKey(empId);
    }

    @Override
    public int insert(Emp record) {
        return empDAO.insert(record);
    }

    @Override
    public Emp selectByPrimaryKey(Integer empId) {
        return empDAO.selectByPrimaryKey(empId);
    }

    @Override
    public List<Emp> selectAll() {
        return empDAO.selectAll();
    }

    @Override
    public int updateByPrimaryKey(Emp record) {
        return empDAO.updateByPrimaryKey(record);
    }

    @Override
    public List<Emp> selectByIdGreater(Integer empId) {
        return empDAO.selectByIdGreater(empId);
    }

    @Override
    public Map<String, Object> getByEmpNameToHashMap(String empName) {
        return empDAO.getByEmpNameToHashMap(empName);
    }
}
