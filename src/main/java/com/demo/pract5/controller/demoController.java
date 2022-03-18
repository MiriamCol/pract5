package com.demo.pract5.controller;

import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/*@RestController
public class demoController {
    @GetMapping("/api/demo")

    public @ResponseBody ResponseEntity<List<String>> getDatos()
    {
        List<String> datos = List.of(
                "Dato 1",
                "Dato 2",
                "Dato 3",
                "Dato mil"
        );

        return ResponseEntity.ok().body(datos);
    }
}

@RestController
public class demoController{

    @ResponseBody
    @RequestMapping(value = "/search/api/getSearchResult/{id}")
    public String getSearchResultViaAjax(@PathVariable(value = "id") Integer id)
    {
        return String.valueOf(id);
    }
}
*/

@RestController
@RequestMapping("/demoController")
public class demoController {


    @RequestMapping("/formularioPeticiones")
    public String formulario(Model modelo) {

        return "formularioPeticiones";

    }
    @RequestMapping("/resultadoPeticiones")
    public String formularioPeticiones(Model modelo) {

        modelo.addAttribute("mensaje","peticion GET");
        return "resultadoPeticiones";

    }
}
