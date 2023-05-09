package Exercises.Exercises_1;



import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class AnotherNewController {
    @GetMapping("/random2")
    public ResponseEntity<String> exercise4B(){
        if (new Random().nextBoolean() == true) {
            return ResponseEntity.status(200).body("Ayy okay!");
        }
        return ResponseEntity.status(400).body("Not great!");
    }
}
