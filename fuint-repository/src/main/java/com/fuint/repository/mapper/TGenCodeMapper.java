package com.fuint.repository.mapper;

import com.fuint.repository.model.TGenCode;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

/**
 * 代码生成 Mapper 接口
 *
 * Created by FSQ
 * CopyRight https://www.fuint.cn
 */
public interface TGenCodeMapper extends BaseMapper<TGenCode> {

    TGenCode findGenCodeByTableName(@Param("tableName") String tableName);

}
