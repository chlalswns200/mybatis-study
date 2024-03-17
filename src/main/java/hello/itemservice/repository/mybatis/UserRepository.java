package hello.itemservice.repository.mybatis;

import hello.itemservice.domain.User;
import java.util.List;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
@Repository
@RequiredArgsConstructor
public class UserRepository {
    private final UserMapper userMapper;

    public long save(User user) {
        return userMapper.save(user);
    }

    public Optional<User> findById(long id) {
        return userMapper.findById(id);
    }

    public List<User> findAll() {
        return userMapper.findAll();
    }

}
