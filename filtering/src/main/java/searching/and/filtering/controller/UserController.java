package searching.and.filtering.controller;


import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import searching.and.filtering.service.FilterService;

@RestController
@RequestMapping("api/")
public class UserController {
    private final FilterService userService ;

    public UserController(FilterService userService) {
        this.userService = userService;
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
}
