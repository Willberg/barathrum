package fun.johntaylor.barathrum.dao.entity.user;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "t_user")
public class User {
    @Id
    private Long uid;

    @Column(name = "user_name", length = 64)
    private String userName;

    @Column(name = "phone_number", length = 20)
    private String phoneNumber;

    @Column(length = 64)
    private String password;

    @Column(length = 64)
    private String email;

    @Column(length = 4)
    private Integer type;

    @Column(length = 10)
    private Integer role;

    @Column(length = 20)
    private Long createTime;

    @Column(length = 20)
    private Long updateTime;

    @Column(length = 4)
    private Integer status;
}
