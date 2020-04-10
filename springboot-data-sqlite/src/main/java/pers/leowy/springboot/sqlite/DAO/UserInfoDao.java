package pers.leowy.springboot.sqlite.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import pers.leowy.springboot.sqlite.entity.UserInfo;

import java.util.List;

public interface UserInfoDao extends JpaRepository<UserInfo, Integer> {
    @Override
    List<UserInfo> findAll();

    @Override
    UserInfo save(UserInfo userInfo);
}
