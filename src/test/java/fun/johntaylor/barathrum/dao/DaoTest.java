package fun.johntaylor.barathrum.dao;

import fun.johntaylor.barathrum.dao.entity.user.User;
import fun.johntaylor.barathrum.dao.mapper.user.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DaoTest {

    @Autowired
    private UserMapper userMapper;

    //    @Before
    @Test
    public void before() {
        Long uid = 1L;
        User user = new User();
        user.setUserName(String.format("%s's userName", uid));
        user.setPhoneNumber(String.format("%s's phoneNumber", uid));
        user.setPassword(String.format("%s's password", uid));
        user.setEmail(String.format("%s's email", uid));
        user.setType(1);
        user.setRole(1);
        user.setCreateTime(System.currentTimeMillis());
        user.setUpdateTime(System.currentTimeMillis());
        user.setStatus(1);
        userMapper.save(user);
    }

    @Test
    public void searchByUid() {
        Optional<User> userOptional = userMapper.findById(1L);
        User user = userOptional.orElse(new User());
        System.out.println(user.getUserName());
    }

    @Test
    public void searchAll() {
        List<User> userList = userMapper.findAll();
        for (User user : userList) {
            System.out.println(user.getEmail());
        }
    }

    @Test
    public void searchByName() {
        System.out.println("query");
        List<User> userList = userMapper.findByName("2");
        for (User user : userList) {
            System.out.println(user.getEmail());
        }
    }

}
