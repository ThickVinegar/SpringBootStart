package com.keivn.start.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.keivn.start.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 *
 * @author huang jiahui
 * @date 2021/11/20 15:51
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
