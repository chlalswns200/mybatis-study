package hello.itemservice.controller;

import hello.itemservice.domain.User;
import hello.itemservice.dto.UserDto;
import hello.itemservice.service.UserService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    @PostMapping("/join")
    @ResponseBody
    public long join(@RequestBody UserDto userDto) {
        return userService.save(userDto);
    }

    @GetMapping("/{id}")
    public String findOne(@PathVariable long id) {
        User findUser = userService.findById(id);
        return findUser.getUsername();
    }

    @GetMapping("")
    public List<User> allUsers() {
        return userService.findAll();
    }
}