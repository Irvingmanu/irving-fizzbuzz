package mx.edu.utez.irving_fizzbuzz.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin({"*"}) //todos los origenes de peticion
@RequestMapping("/my-services")
public class MyController {

    @GetMapping("/fizz-buzz/{n}")
    public String fizzBuzz(@PathVariable int n) {

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("FizzBuzz ");
            } else if (i % 3 == 0) {
                System.out.print("Fizz ");
            } else if (i % 5 == 0) {
                System.out.print("Buzz ");
            } else {
                System.out.print(i + " ");
            }
        }

        return "Nombre del alumno: Irving Flores";
    }

    @GetMapping("/fibonacci/{n}")
    public String fibonacci(@PathVariable int n) {
        int a = 0;
        int b = 1;
        int siguiente;
        //6
        //0, 1, 1, 2, 3, 5
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            siguiente = a + b;
            a = b;
            b = siguiente;
        }

        return "Nombre del alumno: Irving Flores";

    }
}
