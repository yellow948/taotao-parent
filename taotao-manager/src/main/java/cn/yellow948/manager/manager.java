package cn.yellow948.manager;

import cn.yellow948.pojo.User;
import cn.yellow948.service.DemoService;
import com.alibaba.dubbo.config.annotation.Reference;
import com.github.pagehelper.PageInfo;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class manager {

    @Reference
    private DemoService demoService;

    @RequestMapping("/demo")
    public String demo(){
        System.out.println("hhhhhhhhh---1");
        return demoService.demo();
    }

    @RequestMapping("/findByPage")
    public PageInfo findByPage(int c, int size){
        PageInfo<User> pageInfo = demoService.findByPage(c,size);
        return pageInfo;
    }
}
