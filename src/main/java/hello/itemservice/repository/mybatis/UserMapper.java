package hello.itemservice.repository.mybatis;

import hello.itemservice.domain.User;
import java.util.List;
import java.util.Optional;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    long save(User user);

    Optional<User> findById(long id);

    List<User> findAll();

}
