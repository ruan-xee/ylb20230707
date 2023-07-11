package com.rxee.dataservice.mapper;

import com.rxee.api.entity.User;
import org.apache.ibatis.annotations.*;

public interface UserMapper {

    // 统计注册人数
    int selectCountUser();
}
