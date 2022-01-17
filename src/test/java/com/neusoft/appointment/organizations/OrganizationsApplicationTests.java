package com.neusoft.appointment.organizations;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.neusoft.appointment.organizations.entity.BaseHospital;
import com.neusoft.appointment.organizations.service.BaseHospitalQto;
import com.neusoft.appointment.organizations.service.BaseHospitalService;
import com.neusoft.appointment.organizations.service.BaseHospitalTo;
import com.neusoft.mybatis.expand.expression.JsonGridResult;
import com.neusoft.mybatis.expand.expression.SimpleExpression;
import com.neusoft.mybatis.expand.jdbc.JdbcTemplateUtils;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.beans.Expression;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Consumer;

@SpringBootTest
class OrganizationsApplicationTests {

    @Autowired
    private BaseHospitalService baseHospitalService;

    @Test
    void test2() {
        JdbcTemplateUtils jdbcTemplateUtils = new JdbcTemplateUtils();
        String sql = "SELECT * FROM BASE_HOSPITAL WHERE spell_code = '0010' ORDER BY CODE ASC";
        JsonGridResult jsonGridResult = jdbcTemplateUtils.queryPage(sql, BaseHospitalTo.class,null );
        System.out.println(jsonGridResult);
    }

    @Test
    void test1() throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        Runnable task = new Runnable() {
            @Override
            public void run() {
                try {
                    // @Lock4j(keys = "#code")
                    baseHospitalService.selectById("1122");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        for (int i = 0; i < 1000; i++) {
            executorService.submit(task);
        }
        Thread.sleep(30000);
    }

    @Test
    void contextLoads() {
//        Date date = new Date();
//        date.setHours(7);
//        date.setMinutes(0);
//        date.setSeconds(0);
//
//        BaseHospitalQto qto = new BaseHospitalQto();
//        qto.getCreateTime().setValue(date);
//        qto.getCreateTime().setOperator(SimpleExpression.eq);
//        IPage<BaseHospital> pages =  baseHospitalService.selectPage(qto.getPage(), qto.getWrapper());
//        System.out.println(pages);
//
//        qto = new BaseHospitalQto();
//        qto.getCreateTime().setLowValue(date);
//        qto.getCreateTime().setHighValue(new Date());
//        qto.getCreateTime().setOperator(SimpleExpression.between);
//        pages =  baseHospitalService.selectPage(qto.getPage(), qto.getWrapper());
//        System.out.println(pages);

        QueryWrapper<BaseHospital> queryWrapper = new QueryWrapper();
        queryWrapper.eq("code", "123");
        queryWrapper.and(item -> item.eq("name", "1").or().eq("enabled",true ));
        IPage<BaseHospital> pages =  baseHospitalService.selectPage(new Page(), queryWrapper);
        System.out.println(pages);

//        QueryWrapper queryWrapper = new QueryWrapper();
//        queryWrapper.between("create_time", new Date(), new Date());
//        IPage<BaseHospital> pages =  baseHospitalService.selectPage(new Page(), queryWrapper);
//        System.out.println(pages);
    }

}
