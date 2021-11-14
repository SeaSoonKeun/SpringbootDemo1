package com.studentDemo.controller;

import com.studentDemo.bean.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.*;

/**
 * @Auther: xucg
 * @Date: 2021/11/13 - 11 - 13 - 2:52 下午
 * @Description: com.studentDemo.controller
 */
@RestController
public class StudentController {
    private int id = 1;

    // 增加：存学生姓名，年龄，电话 --> 拿到数据如何存,暂时用文件进行存储
    @RequestMapping("save")
    public String save(Student student) throws IOException {
        System.out.println(student);
        // 默认为覆盖写，追加写加true。
        FileWriter fileWriter = new FileWriter("stu.txt",true);
        // 自增id添加
        fileWriter.write(id++ + "\t" + student.toString());
        fileWriter.close();
        return "添加成功";
    }

    // 删除：
    @RequestMapping("delete")
    public String delete(int id) throws IOException{
        // 不能把某一行删除，把每一行读出来，匹配到那一行就不写，拼出新文件
        // 1、读出所有学生 2、遍历匹配要删除的学生 3、拼接没有被删除的学生 4、写入文件
        FileReader fileReader = new FileReader("stu.txt");

        StringBuilder sb = new StringBuilder();
        // 按照行读取
        BufferedReader br = new BufferedReader(fileReader);
        String line = null;
        while ((line = br.readLine()) != null){
            // 判断逻辑：是否是要删除的行
            String sid = line.split("\t")[0];
            // 匹配到要删除的行
            if (Integer.parseInt(sid) != id){
//                System.out.println(line);
                sb.append(line + "\r\n");
            }
        }
        FileWriter fw = new FileWriter("stu.txt");
        fw.write(sb.toString());
        fw.close();
        fileReader.close();
        return ("delete sucess");

    }

    // 修改：
    @RequestMapping("update")
    public String update(int id, int age) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("stu.txt"));
        String line = null;
        StringBuilder sb = new StringBuilder();
        while ((line = br.readLine()) != null){
            int sid = Integer.parseInt(line.split("\t")[0]);
            if (sid == id){
                // 第一种
//                String sage = line.split("\t")[2];
//                line.replace()
                // 第二种 拼接
                String newLine = sid + "\t" + line.split("\t")[1] + "\t" + age + "\t" + line.split("\t")[3];
                sb.append(newLine + "\r\n");
            }else {
                sb.append(line + "\r\n");
            }
        }
        br.close();
        FileWriter fileWriter = new FileWriter("stu1.txt");
        fileWriter.write(sb.toString());
        fileWriter.close();
        return ("update success");
    }

    // 查找
    @RequestMapping("query")
    public String findById(int id) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("stu.txt"));
        String line = null;
        String result = null;
        while ((line = br.readLine())!= null){
            int sid = Integer.parseInt(line.split("\t")[0]);
            if (sid == id){
                result = line.toString();
                System.out.println();
            }
        }
        br.close();
        return ("query sucess\t" + result);
    }
}
