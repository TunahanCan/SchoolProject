
package com.example.restcontroller;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author tunahan
 */

@RestController
@RequestMapping(value = "/Student")
@CrossOrigin( origins = "*" , allowedHeaders = "*"  , maxAge = 3600)
public class StudentController {
    
   
}
