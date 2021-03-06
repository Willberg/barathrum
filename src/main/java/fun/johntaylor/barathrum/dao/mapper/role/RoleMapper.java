package fun.johntaylor.barathrum.dao.mapper.role;

import fun.johntaylor.barathrum.dao.entity.role.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleMapper extends JpaRepository<Role, Long> {
}
