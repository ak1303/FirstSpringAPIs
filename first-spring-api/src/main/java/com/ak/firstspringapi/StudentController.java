package com.ak.firstspringapi;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
//@RequestMapping("/student/") to give common end point to all APIs of the controller
public class StudentController {

    HashMap<Integer, Student> db = new HashMap<>();

    /**
     * add student to database
     * @param student
     * @return request msg
     */
    @PostMapping("/add")
    public String addStudent(@RequestBody Student student){
        db.put(student.getRegNo(), student);
        return "Student Added Successfully";
    }

    /**
     * retrieve student details
     * @param regNo
     * @return
     */
    @GetMapping("/get")
    public Student getStudent(@RequestParam("regNo") int regNo){
        return db.get(regNo);
    }
    @GetMapping("/getByPath/{id}")
    public Student getStudentUsingPath(@PathVariable("id") int regNo){
        return db.get(regNo);
    }

    /**
     * Delete Student from database
     * @param regNo
     * @return
     */
    @DeleteMapping("/del")
    public String deleteStudent(@RequestParam("regNo") int regNo){
        db.remove(regNo);
        return "Student Deleted from database successfully";
    }
    @DeleteMapping("/del/{id}")
    public String deleteStudentByPath(@PathVariable("id") int regNo){
        db.remove(regNo);
        return "Student details deleted from database";
    }
    /**
     * Update age
     * @param regNo
     * @param age
     * @return
     */
    @PutMapping("/update-age/{id}")
    public String updateAge(@PathVariable("id") int regNo, @RequestParam("age") int age){
        db.get(regNo).setAge(age);
        return "Student age updated successfully";
    }
    /*Update of Courses*/
    @PutMapping("/update-course")
    public String updateCourseUsingReqParam(@RequestParam("id") int regNo, @RequestParam("course") String course){
        db.get(regNo).setCourse(course);
        return "Student age updated successfully";
    }
    @PutMapping("/update-course/{id}/{course}")
    public String updateCourseUsingPathVar(@PathVariable("id") int regNo, @PathVariable("course") String course){
        db.get(regNo).setCourse(course);
        return "Student age updated successfully";
    }
    @PutMapping("/update-course/{id}")
    public String updateCourse(@PathVariable("id") int regNo, @RequestParam("course") String course){
        db.get(regNo).setCourse(course);
        return "Student age updated successfully";
    }

    /*Change Course and age with regNo=ReqParam and Course=ReqBody*/

    @PutMapping("/updateAgeCourse")
    public String updateAgeAndCourse(@RequestParam("regNo") int regNo, @RequestBody Student student){
        db.put(regNo, student);
        return "Course and Age of student updated successfully";
    }
}
