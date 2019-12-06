package fun.johntaylor.barathrum.dao.entity.role;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "t_role_resource")
public class RoleResource {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(length = 20)
    private Long id;

    @Column(length = 256)
    private String name;

    @Column(length = 512)
    private String resource;

    @Column(name = "create_time", length = 20)
    private Long createTime;

    @Column(name = "update_time", length = 20)
    private Long updateTime;

    @Column(length = 4)
    private Long type;

    @Column(length = 4)
    private Integer status;
}
