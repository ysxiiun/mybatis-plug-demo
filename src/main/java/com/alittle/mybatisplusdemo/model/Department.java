package com.alittle.mybatisplusdemo.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author ysx
 * @since 2019-11-26
 */
@TableName("tb_department")
public class Department implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String deptName;

    private Integer deptManage;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public Integer getDeptManage() {
        return deptManage;
    }

    public void setDeptManage(Integer deptManage) {
        this.deptManage = deptManage;
    }

    @Override
    public String toString() {
        return "Department{" +
        "id=" + id +
        ", deptName=" + deptName +
        ", deptManage=" + deptManage +
        "}";
    }
}
