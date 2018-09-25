package cn.yellow948.service;


import cn.yellow948.pojo.User;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface DemoService {
    String demo();

    List<User> getUser();

    PageInfo<User> findByPage(int now, int size);
}
