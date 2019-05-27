
/*
 * User:liveGreen
 * Date: 2019/5/26
 */

package com.green.lc.controller;

import com.green.lc.entity.Emp;
import com.green.lc.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class EmpController {

    @Autowired
    private EmpService empService;

    /**
     * 通过ID删除对象
     *
     * @param empId
     * @return
     */
    @RequestMapping(value = "/emp/{empId}", method = RequestMethod.DELETE)
    public int deleteByPrimaryKey(@PathVariable("empId") Integer empId) {
        return empService.deleteByPrimaryKey(empId);
    }

    /**
     * 添加一个对象
     *
     * @param record
     * @return
     */
    @RequestMapping(value = "/emp", method = RequestMethod.POST)
    public int insert(Emp record) {
        return empService.insert(record);
    }

    /**
     * 根据ID查询数据
     *
     * @param empId
     * @return
     */
    @RequestMapping(value = "/emp/{empId}", method = RequestMethod.GET)
    public Emp selectByPrimaryKey(@PathVariable("empId") Integer empId) throws Exception {
        throw new Exception("kkkkkk");
//        Emp emp = empService.selectByPrimaryKey(empId);
//        return emp;
    }

    /**
     * 查询所有数据
     *
     * @return
     */
    @RequestMapping(value = "/emp", method = RequestMethod.GET)
    public List<Emp> selectAll() throws Exception{
        List<Emp> emps = empService.selectAll();
        return emps;
    }

    /**
     * 修改对象
     *
     * @param record
     * @return
     */
    @RequestMapping(value = "/emp", method = RequestMethod.PUT)
    public int updateByPrimaryKey(Emp record) {
        return empService.updateByPrimaryKey(record);
    }

    /**
     * 查询大于传入ID的数据
     *
     * @param empId
     * @return
     */
    @RequestMapping(value = "/emp/greater/{empId}", method = RequestMethod.GET)
    public List<Emp> selectByIdGreater(@PathVariable("empId") Integer empId) {
        return empService.selectByIdGreater(empId);
    }

    /**
     * 根据名字查询单个对象，返回HashMap类型
     *
     * @return
     */
    @RequestMapping(value = "/emp/map/{empName}", method = RequestMethod.GET)
    public Map<String, Object> getByIdToHashMap(@PathVariable("empName") String empName) {
        Map<String, Object> result = empService.getByEmpNameToHashMap(empName);
        System.out.println(result);
        return result;
    }

}
