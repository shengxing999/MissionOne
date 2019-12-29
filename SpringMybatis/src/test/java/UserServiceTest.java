import com.wp.sm.beans.User;
import com.wp.sm.service.UserService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class UserServiceTest {
    private ApplicationContext applicationContext;

    // 在执行测试方法之前首先获取 Spring 配置文件对象
    // 注解@Before在执行本类所有测试方法之前先调用这个方法
    @Before
    public void setup() throws Exception {
        applicationContext = new
                ClassPathXmlApplicationContext("classpath:applicationContext.xml");
    }

    @Test
    public void selectUserByName() throws Exception {
        // 通过配置资源对象获取 userService 对象
        UserService userService = (UserService) applicationContext.getBean("UserServiceImpl");
        // 调用 UserService 的方法
        User user = new User();
        user.setStudent_id(12);
        user.setName("九九");
        String link = userService.selectUserByName(user);
        // 输出报名贴地址
        System.out.println(link);
    }

    @Test
    public void selectUserById() throws Exception {
        // 通过配置资源对象获取 userService 对象
        UserService userService = (UserService) applicationContext.getBean("UserServiceImpl");
        // 调用 UserService 的方法
        User user = userService.selectUserById(1);
        // 输出用户信息
        System.out.println(user.toString());
    }

    @Test
    public void selectAllUser() throws Exception {
        // 通过配置资源对象获取 userService 对象
        UserService userService = (UserService) applicationContext.getBean("UserServiceImpl");
        // 调用 UserService 的方法
        List<User> user = userService.selectAllUser();
        // 输出用户信息
        System.out.println(user.toString());
    }

    @Test
    public void deleteUser() throws Exception {
        // 通过配置资源对象获取 userService 对象
        UserService userService = (UserService) applicationContext.getBean("UserServiceImpl");
        boolean b = userService.deleteUser(13);
        if (b == true) {
            System.out.println("删除成功！");
        } else {
            System.out.println("删除失败！");
        }
    }

    @Test
    public void updateUser() throws Exception {
        // 通过配置资源对象获取 userService 对象
        UserService userService = (UserService) applicationContext.getBean("UserServiceImpl");
        User user = new User();
        user.setName("万万");
        user.setCreate_at(System.currentTimeMillis());
        user.setUpdate_at(System.currentTimeMillis());
        user.setQq(1197178284);
        user.setJob("java");
        user.setArrive_time(System.currentTimeMillis());
        user.setSchool("黑龙江科技大学");
        user.setStudent_id(121212);
        user.setLink("http://www.jnshu.com/school/39867/daily");
        user.setWish("加油！");
        user.setKnown_ways("朋友介绍");
        user.setBro("张恒");
        user.setId(3);
        boolean b = userService.updateUser(user);
        if (b == true) {
            System.out.println("更新成功！");
        } else {
            System.out.println("更新失败！");
        }
    }

    @Test
    public void insertUser() throws Exception {
        // 通过配置资源对象获取 userService 对象
        UserService userService = (UserService) applicationContext.getBean("UserServiceImpl");
        User user = new User();
        user.setName("peter");
        user.setCreate_at(System.currentTimeMillis());
        user.setUpdate_at(System.currentTimeMillis());
        user.setQq(1197178284);
        user.setJob("java");
        user.setArrive_time(System.currentTimeMillis());
        user.setSchool("黑龙江科技大学");
        user.setStudent_id(121212);
        user.setLink("http://www.jnshu.com/school/39867/daily");
        user.setWish("加油！");
        user.setKnown_ways("朋友介绍");
        user.setBro("张恒");
        userService.insertUser(user);
        System.out.println("id:" + user.getId());
    }
}
