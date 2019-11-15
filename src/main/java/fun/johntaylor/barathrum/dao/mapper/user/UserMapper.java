package fun.johntaylor.barathrum.dao.mapper.user;

import fun.johntaylor.barathrum.dao.entity.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper extends JpaRepository<User, Long> {
    /**
     * like不友好，nativeQuery采用sql语法，不适用nativeQuery，将使用PQL语法
     */
    @Query(nativeQuery = true, value = "select * from t_user where user_name like concat('%', :name, '%')")
    List<User> findByName(@Param("name") String name);
}
