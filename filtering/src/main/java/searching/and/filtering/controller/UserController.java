package searching.and.filtering.controller;


import org.apache.coyote.Response;
import org.hibernate.mapping.Map;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import searching.and.filtering.model.User;
import searching.and.filtering.repository.UserRepostory;
import searching.and.filtering.service.FilterService;

import java.util.HashMap;
import java.util.Objects;
import java.util.Optional;

@RestController
@RequestMapping("api/")
public class UserController {
    private final FilterService userService ;
    private final UserRepostory userRepostory;

    public UserController(FilterService userService, UserRepostory userRepostory) {
        this.userService = userService;
        this.userRepostory = userRepostory;
    }
    @GetMapping("/ping")
    public String getPing() {
        System.out.println("--------------------------------- iiiii am pinging");
        return "hi ping" ;
    }
    @GetMapping("filter/user")
    public ResponseEntity<?> getDataOfUserService(@RequestParam(required = false , name = "name" )String name , @RequestParam(required = false , name = "gender") String gender , @RequestParam(required = false , name = "country") String country , @RequestParam(required = false , name = "page") Integer page) {
        return ResponseEntity.ok(userService.listOfFilteredData(name , gender, country, page));
    }

    @PostMapping("add/user")
    public ResponseEntity<User> addUser(@RequestBody User user) {
        return ResponseEntity.ok(userRepostory.save(user));
    }

    @PatchMapping("update/user/{id}")
    public ResponseEntity<?> updateUser(@PathVariable("id") String id , @RequestBody HashMap<String, String> userData) {
        Optional<User> userOptional = userRepostory.findById(Integer.valueOf(id));
        User user = userOptional.get();
        user.setName(userData.get("name"));
        return ResponseEntity.ok(userRepostory.save(user));
    }
}
