package hello.itemservice.service;

import hello.itemservice.domain.User;
import hello.itemservice.dto.UserDto;
import hello.itemservice.repository.mybatis.UserRepository;
import java.util.List;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public long save(UserDto userDto) {

        User user = new User(userDto.getUsername(), UUID.randomUUID().toString()+userDto.getPassword());
        return userRepository.save(user);
    }

    public User findById(long id) {
        User user = userRepository.findById(id).orElseThrow();
        return user;
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }
}
