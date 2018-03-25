package br.com.workshopmongo.resources;

import br.com.workshopmongo.domain.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
    @RequestMapping(method = RequestMethod.GET)/*Outra solução seria colocar @GetMapping*/
    public ResponseEntity<List<User>> findAll() {
        User maria = new User("1", "Maria Silva", "maria@gmail.com");
        User Augusto = new User("2", "Augusto Mathias", "luispiske2@gmail.com");
        List<User> list = new ArrayList<>();
        list.addAll(Arrays.asList(Augusto, maria));
        return ResponseEntity.ok().body(list);
    }

}
