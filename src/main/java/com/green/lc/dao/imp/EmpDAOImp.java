
/*
 * User:liveGreen
 * Date: 2019/5/26
 */

package com.green.lc.dao.imp;

import com.green.lc.dao.EmpDAO;
import com.green.lc.entity.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class EmpDAOImp implements EmpDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;  //自动注入JdbcTemplate对象

    @Override
    public int deleteByPrimaryKey(Integer empId) {
        //修改默认返回int
        return jdbcTemplate.update("delete emp where emp_id = ?", new Object[]{empId});
    }

    @Override
    public int insert(Emp record) {
        return 0;
    }

    @Override
    public Emp selectByPrimaryKey(Integer empId) {
        //第一个参数：SQL语句
        //第二个参数：object数组，用于放参数
        //第三个参数：返回的类型
        //方法queryForObject用于返回单个对象
        return jdbcTemplate.queryForObject("select * from emp where emp_id = ?", new Object[]{empId}, BeanPropertyRowMapper.newInstance(Emp.class));
    }

    @Override
    public List<Emp> selectAll() {
        return jdbcTemplate.query("select * from emp ", BeanPropertyRowMapper.newInstance(Emp.class));
    }

    @Override
    public int updateByPrimaryKey(Emp record) {
        return 0;
    }

    @Override
    public List<Emp> selectByIdGreater(Integer empId) {
        return jdbcTemplate.query("select * from emp where emp_id > ?", new Object[]{empId}, BeanPropertyRowMapper.newInstance(Emp.class));
    }

    @Override
    public Map<String, Object> getByEmpNameToHashMap(String empName) {
        return jdbcTemplate.queryForMap("select * from emp where emp_name = ?", new Object[]{empName});
    }
}
