package com.eidiko.springboot_with_swagger.student;

import io.swagger.v3.oas.annotations.Hidden;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/student")
public class StudentController {

    @GetMapping("/getStudent")
    @Operation(
           tags = "getStudentApi ",
            description = "get student demo app",
            responses = {
                   @ApiResponse(responseCode = "200",
                   description = "Success"),

                    @ApiResponse(responseCode = "401",
                            description = "unAuthorized"),
                    @ApiResponse(responseCode = "404",
                            description = "NotFound"),


            }
    )
    public String getStudent(){
        return "student...." ;
    }

    @GetMapping("/getAllStudent")

    @Operation(
            tags = "getAllStudentApi ",
            description = "get Allstudent demo app",
            responses = {
                    @ApiResponse(responseCode = "200",
                            description = "Success"),

                    @ApiResponse(responseCode = "401",
                            description = "unAuthorized"),
                    @ApiResponse(responseCode = "404",
                            description = "NotFound"),


            }
    )
    public String getAllStudent(){
        return "studentALL...." ;
    }

    @DeleteMapping ("/deleteStudent")
    @Hidden

    @Operation(
            tags = "deleteStudentApi ",
            description = "delete student demo app",
            responses = {
                    @ApiResponse(responseCode = "200",
                            description = "Success"),

                    @ApiResponse(responseCode = "401",
                            description = "unAuthorized"),
                    @ApiResponse(responseCode = "404",
                            description = "NotFound"),


            }
    )
    public String deleteStudent(){
        return "student deleted...." ;
    }

    @PostMapping("/saveStudent")
    @Operation(
            tags = "saveStudentApi ",
            description = "save student demo app",
            responses = {
                    @ApiResponse(responseCode = "200",
                            description = "Success"),

                    @ApiResponse(responseCode = "401",
                            description = "unAuthorized"),
                    @ApiResponse(responseCode = "404",
                            description = "NotFound"),


            }
    )
    public String saveStudent(){
        return "student saved ...." ;
    }

    @PutMapping("/updateStudent")
    @Operation(
            tags = "updateStudentApi ",
            description = "update student demo app",
            responses = {
                    @ApiResponse(responseCode = "200",
                            description = "Success"),

                    @ApiResponse(responseCode = "401",
                            description = "unAuthorized"),
                    @ApiResponse(responseCode = "404",
                            description = "NotFound"),


            }
    )
    public String updateStudent(){
        return "student updated ...." ;
    }


}
