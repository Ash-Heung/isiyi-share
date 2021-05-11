package com.isiyi.share.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.isiyi.share.entity.DbTestEntity;
import org.apache.ibatis.annotations.Param;

/**
 * 类描述
 * <p></p>
 *
 * @version 1.0.0
 * @description: 类描述
 * @author: siyi
 * @since: 2021/5/11
 */
public interface DbTestMapper extends BaseMapper<DbTestEntity> {

    Integer selectExpectedCount(@Param("f1") String f1);

    Integer selectCorrectCount(@Param("f1") String f1);


    Integer selectWrongCount(@Param("f1") String f1);


}
