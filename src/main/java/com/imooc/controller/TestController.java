package java.com.imooc.controller;


@Controller
public class TestController {


    @RequestMapping(value="baseType.do")
    @ResponseBody
    public String baseType(int age){


        return "age:"+age;

    }
}
