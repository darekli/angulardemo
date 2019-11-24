package angular.angulardemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@RestController
public class HelloWorldController {

    //@RequestMapping(method = RequestMethod.GET, path = "/hw")
    @GetMapping(path = "/hello")
//    public Collection<String> helloWorld(){
//        return IntStream.range(0,10)
//        .mapToObj(i -> "Hello number "+ i)
//                .collect(Collectors.toList());
    public String helloWorld() {
        return "Hello World";
    }

    @GetMapping(path = "/hello-world-bean")
    public HelloWorldBean helloWorldBean() {
        return new HelloWorldBean("Hello World");
    }
}
