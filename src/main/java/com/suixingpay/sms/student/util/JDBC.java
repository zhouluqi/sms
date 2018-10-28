package com.suixingpay.sms.student.util;

import com.suixingpay.sms.student.model.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/**
 * 描述:
 * I/O的读写以及增删改查以及事务的提交
 *
 * @Author 吕金洋
 * @Create 2018-10-28 13:05
 * @Version 1.0
 */
public class JDBC {

    private static HashMap<String, Student> STUDENT_BOX = new HashMap<String, Student>();
    private static File FILE = new File("src/main/resources/static/Student.txt");
    private static JDBC JDBC = new JDBC();

    private JDBC(){}

    public static JDBC getInstance(){
        return JDBC;
    }

    //缓存文件信息到HashMap
    static {
        BufferedReader br = null;
        FileInputStream fis = null;
        BufferedInputStream bis = null;
            try {
                fis = new FileInputStream(FILE);
                bis = new BufferedInputStream(fis);
                br = new BufferedReader (new InputStreamReader(bis));
                String value = br.readLine();
                while (value!=null) {
                    String[] values = value.split("-");
                    Student stu = new Student();
                    stu.setId(values[0]);
                    stu.setName(values[1]);
                    stu.setSex(values[2]);
                    stu.setAge(new Integer(values[3]));
                    stu.setClassNumber(values[4]);
                    stu.setCreatDate(values[5]);
                    stu.setEnrollmentYear(values[6]);
                    stu.setStatus(values[7]);
                    STUDENT_BOX.put(values[0], stu);
                    value = br.readLine();
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }finally {
                try {
                    if (br != null) {
                        br.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    if (fis != null) {
                        fis.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    if (bis != null) {
                        bis.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
    }

    public void commitOne(Student student){
        BufferedWriter out = null;
        try {
            //开启FileWtriter的允许追加书写属性 否则会覆盖当前文档
            out = new BufferedWriter(new FileWriter(FILE, true));
            String newStudentString = this.splicer(student);
            out.write(newStudentString);
            out.newLine();
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    //FileWriter不开启追加 此commit是全部重写(覆盖)
    public void commit(){
        BufferedWriter out = null;
        try {
            out = new BufferedWriter(new FileWriter(FILE));
            Iterator<String> it = STUDENT_BOX.keySet().iterator();
            while (it.hasNext()) {
                String sname = it.next();
                Student student = STUDENT_BOX.get(sname);
                String newStudentString = this.splicer(student);
                out.write(newStudentString);
                out.newLine();
                out.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public ArrayList<Student> selectListByName(String name){
        ArrayList<Student> arr = new ArrayList<Student>();
        for (Student s : STUDENT_BOX.values()){
            if ( name.equals(s.getName())) {
                arr.add(s);
            }
        }
        return arr;
    }
    //id==0：查询所有；id==1：查询单个
    public ArrayList<Student> selectList(String... id){
        ArrayList<Student> arr;
        arr = new ArrayList<Student>();
        if ( id == null || id.length == 0) {
            for (Student s : STUDENT_BOX.values()){
                arr.add(s);
            }
            return arr;
        }
        arr.add(STUDENT_BOX.get(id));
        return arr;
    }

    public void update(Student student){
        STUDENT_BOX.put(student.getId(), student);
        this.commit();
    }
    //待优化
    public void insert(Student student){
        Student news = STUDENT_BOX.get(student.getId());
        // System.out.println(student.equals(news));
         if (news == null) {
            STUDENT_BOX.put(student.getId(), student);
            this.commitOne(student);
        } else if (news != null && !student.equals(news)) {
            STUDENT_BOX.put(student.getId(), student);
            this.commit();
        }
    }

    public void delete(Student student){
        Student newStudent = STUDENT_BOX.get(student.getId());
        newStudent.setStatus("deleted");
        this.update(newStudent);
    }

    public String splicer(Student student){
        StringBuilder sb = new StringBuilder();
        sb.append(student.getId());
        sb.append("-");
        sb.append(student.getName());
        sb.append("-");
        sb.append(student.getSex());
        sb.append("-");
        sb.append(student.getAge());
        sb.append("-");
        sb.append(student.getClassNumber());
        sb.append("-");
        sb.append(student.getCreatDate());
        sb.append("-");
        sb.append(student.getEnrollmentYear());
        sb.append("-");
        sb.append(student.getStatus());
        return sb.toString();
    }
}
