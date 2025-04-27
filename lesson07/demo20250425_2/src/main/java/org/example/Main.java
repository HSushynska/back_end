package org.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        ObjectMapper mapper = new ObjectMapper();
        Person p = new Person("Jack", 18);
        Person[] people = {
                new Person("john", 22),
                new Person("lena", 23),
                new Person("igor", 25),
                new Person("mike", 21),
        };
        /********************************************************
         получить из объекта JSON - необходимы геттеры
         получить из  JSON объект - необходим пустой конструктор
         ************************************************************/

        // получить из объекта строку - JSON
        String json = mapper.writeValueAsString(p);
        System.out.println(json); // {"name":"Jack","age":18}

        // получить из объекта файл - JSON
        mapper.writeValue(new File("p1.json"), p);
        mapper.writeValue(new File("p2.json"), people);

//-----------------------------------------------------------------------------------
        // прочитать JSON -> в объект
        Person person = mapper.readValue(new File("p1.json"), Person.class);
        Person[] people1 = mapper.readValue(new File("p2.json"), Person[].class);
        System.out.println("person:" + person);  // person:Person{name='Jack', age=18}
        System.out.println(Arrays.toString(people1));  // [Person{name='john', age=22}, Person{name='lena', age=23}, Person{name='igor', age=25}, Person{name='mike', age=21}]
    }
}
