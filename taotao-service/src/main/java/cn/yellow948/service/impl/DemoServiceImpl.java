package cn.yellow948.service.impl;

import cn.yellow948.mapper.UserMapper;
import cn.yellow948.pojo.User;
import cn.yellow948.service.DemoService;
import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


@Service
public class DemoServiceImpl implements DemoService{

    @Autowired
    private UserMapper userMapper;

    @Override
    public String demo() {
        return "hhhhhh---service";
    }

    @Override
    public List<User> getUser(){
        return null;
    }

    @Override
    public PageInfo<User> findByPage(int now, int size) {
        PageHelper.startPage(now, size);
        List<User> list = userMapper.select(null);
        return new PageInfo<User>(list);
    }

}
