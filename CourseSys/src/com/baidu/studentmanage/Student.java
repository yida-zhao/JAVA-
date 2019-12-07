package com.baidu.studentmanage;

import java.sql.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Student {
    private int stuNum;//学号
    private String stuName;//姓名
    private String stuClass;//班级
    private String stuProfessional;//选课
   // prviate String courses;
    public Student() {
    }
    public List<Student> liststudent= new LinkedList();
    public Student(int stuNum, String stuName, String stuClass,
                   String stuProfessional) {
        super();
        this.stuNum = stuNum;
        this.stuName = stuName;
        this.stuClass = stuClass;
        this.stuProfessional = stuProfessional;
    }

    public int getStuNum() {
        return stuNum;
    }

    public void setStuNum(int stuNum) {
        this.stuNum = stuNum;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStuClass() {
        return stuClass;
    }

    public void setStuClass(String stuClass) {
        this.stuClass = stuClass;
    }

    public String getStuProfessional() {
        return stuProfessional;
    }

    public void setStuProfessional(String stuProfessional) {
        this.stuProfessional = stuProfessional;
    }

    public void addStuInfo(int sNum, String sName, String sClass, String sProfessional) {
    Student student=new Student(sNum, sName, sClass, sProfessional);
    liststudent.add(student);
    }

    public boolean deleteStuInfo(int sNum) {
        int i=0;
        for(i=0;i<liststudent.size();i++){
           if( liststudent.get(i).stuNum==sNum){
               liststudent.remove(i);
           }
        }
        return true;
    }

    public Student queryStuInfo(int sNum) {
        int i=0;
        Student stu=new Student();
        for(i=0;i<liststudent.size();i++){
            if( liststudent.get(i).stuNum==sNum){
                return liststudent.get(i);
            }
        }
        return stu;
    }

    //修改学生信息
    public void modifyStuInfo(Student stu, int sNum, String sName, String sClass, String sProfessional) {

        int i=0;
       // Student stu=new Student();
        for(i=0;i<liststudent.size();i++){
            if( liststudent.get(i).stuNum==sNum){
                 liststudent.get(i).stuNum=sNum;
                liststudent.get(i).stuName=sName;
                liststudent.get(i).stuClass=sClass;
                liststudent.get(i).stuProfessional=sProfessional;
            //s    liststudent.get(i)

            }
        }
    }

    public List<Student> queryAllStuInfo() {
        return liststudent;
    }
}
