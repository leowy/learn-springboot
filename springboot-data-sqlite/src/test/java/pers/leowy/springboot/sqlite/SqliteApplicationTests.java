package pers.leowy.springboot.sqlite;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pers.leowy.springboot.sqlite.DAO.UserInfoDao;
import pers.leowy.springboot.sqlite.entity.UserInfo;

import java.util.List;

@SpringBootTest
class SqliteApplicationTests {
    @Autowired
    UserInfoDao userInfoDao;

    @Test
    void contextLoads() {
        UserInfo userInfo = new UserInfo();
        userInfo.setName("zhangw");
        userInfo.setGender("male");
        userInfo.setAge(18);

        UserInfo info = userInfoDao.save(userInfo);
        System.out.println(info);

        List<UserInfo> infos = userInfoDao.findAll();
        for (UserInfo user : infos) {
            System.out.println(user);

        }

    }

}
