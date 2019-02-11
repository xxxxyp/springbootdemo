package com.example.springbootdemo.TestController;

import com.example.springbootdemo.CommonUtil.ExportExcelUtils;
import com.example.springbootdemo.TestPojo.ExcelData;
import com.example.springbootdemo.TestPojo.TestPojo;
import com.example.springbootdemo.TestService.TestService;
import com.example.springbootdemo.TestVo.Dog;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.DisabledAccountException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Controller
public class HelloWorld {

//    @Resource
//    private TestService testService;
//
//    @RequestMapping("/hello")
//    @ResponseBody
//    public String hello(){
//        return "hello world，hello intellij idea，hello springBoot";
//    }
//
//    @RequestMapping("/dog")
//    @ResponseBody
//    public Dog dogInfo(){
//        List list = new ArrayList();
//        Dog dog = new Dog();
//        dog.setAge(4);
//        dog.setKind("二哈");
//        dog.setVoice("汪汪汪");
//        testService.run1();
//        return dog;
//    }
//
//    @RequestMapping("/test")
//    @ResponseBody
//    public TestPojo findByPrimarykey(Integer id){
//        return testService.findByPrimarkey(id);
//    }
//
//    @RequestMapping("/excel")
//    public void excel(HttpServletResponse response) throws Exception {
//        ExcelData data = new ExcelData();
//        //文件名
//        data.setName("hello");
//        //列名
//        List<String> titles = new ArrayList();
//        titles.add("a1");
//        titles.add("a2");
//        titles.add("a3");
//        data.setTitles(titles);
//        //数据
//        List<List<Object>> rows = new ArrayList();
//        List<Object> row = new ArrayList();
//        row.add("11111111111");
//        row.add("22222222222");
//        row.add("3333333333");
//        rows.add(row);
//
//        data.setRows(rows);
//
//
//        //生成本地
//        /*File f = new File("c:/test.xlsx");
//        FileOutputStream out = new FileOutputStream(f);
//        ExportExcelUtils.exportExcel(data, out);
//        out.close();*/
//        ExportExcelUtils.exportExcel(response,"hello.xlsx",data);
//    }
//
//    @RequestMapping("/itemsPage")
//    @ResponseBody
//    public List<TestPojo> itemsPage(int currentPage,int pageSize){
//         return testService.findItemByPage(currentPage, pageSize);
//    }
//


}
