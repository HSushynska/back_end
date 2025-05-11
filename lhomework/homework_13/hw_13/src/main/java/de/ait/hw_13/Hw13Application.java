package de.ait.hw_13;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
Создать новый Spring-проект (не забудьте подключить Spring Web) Допустим у нас система
 учета задач. Каждая задача Task {id, description (описание), priority (приоритет)}
 По образу и подобию кода, написанного на занятие вам необходимо реализовать следующие
 endpoint:

получить список всех задач
получить задачу по id
создать новую задачу
удалить задачу № ...

2 (по желанию)
Добавим в нашу систему программистов. Естественно у программистов могут быть задачи.
 Реализуйте следующие возможности:

получить список программистов
получить программиста по его id
получить список задач заданного программиста (GET programmers/id/tasks)
поручить программисту задачу (PUT programmers/programmerId/tasks/taskId)
создать программиста
удалить задачу у программиста (DELETE programmers/programmerId/tasks/taskId)
 */

@SpringBootApplication
public class Hw13Application {

    public static void main(String[] args) {
        SpringApplication.run(Hw13Application.class, args);
    }

}
