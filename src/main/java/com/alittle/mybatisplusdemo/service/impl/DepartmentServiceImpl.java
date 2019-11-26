package com.alittle.mybatisplusdemo.service.impl;

import com.alittle.mybatisplusdemo.model.Department;
import com.alittle.mybatisplusdemo.dao.DepartmentMapper;
import com.alittle.mybatisplusdemo.service.IDepartmentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ysx
 * @since 2019-11-26
 */
@Service
public class DepartmentServiceImpl extends ServiceImpl<DepartmentMapper, Department> implements IDepartmentService {

}
