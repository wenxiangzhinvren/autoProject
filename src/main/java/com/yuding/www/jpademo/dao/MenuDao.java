/**
 * 
 */
package com.yuding.www.jpademo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.yuding.www.jpademo.pojo.Menu;

/**
 * @description <功能详细描述、说明>
 * @author wangjihong
 * @version [version 1.0, 2019年3月1日]
 */

public interface MenuDao extends JpaRepository<Menu, String>,JpaSpecificationExecutor<Menu>{

}
