package main;

//import main.model.Task;
//import main.model.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
        // System.out.println("Hello world!");
    }

//    @RestController
//    public static class TaskController {
//
//        @Autowired//аннотация - автоматическое создание репозитория
//        private TaskRepository taskRepository;
//
//        @GetMapping("/todos")//ссылка относительно главной страницы
//        public List<Task> list(){
//            Iterable<Task> taskIterable = taskRepository.findAll();
//            ArrayList<Task> tasks = new ArrayList<>();
//            for (Task task : taskIterable){
//                tasks.add(task);
//            }
//            return tasks;//возвращает список задач
//        }
//
//        @PostMapping("/todos")
//        public int add(Task task){//добавление задачи
//            SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yy HH.mm");
//            task.setDate(dateFormat.format(new Date()));//назначение задаче даты и времени создания
//            Task newTask = taskRepository.save(task);
//            return newTask.getId();
//        }
//
//        @GetMapping("/todos/{id}")
//        public ResponseEntity get(@PathVariable int id){//раскрытие отдельной задачи
//            Optional<Task> optionalTask = taskRepository.findById(id);
//            if (!optionalTask.isPresent()) {
//                return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
//            }
//            return new ResponseEntity(optionalTask.get(), HttpStatus.OK);
//        }
//
//        @DeleteMapping("/todos")//удаление всех задач
//        public int delete(){
//            taskRepository.deleteAll();
//            return (int) taskRepository.count();
//        }
//
//        @DeleteMapping("/todos/{id}")//удаление отдельной задачи
//        public int deleteOne(@PathVariable int id){
//            taskRepository.deleteById(id);
//            return (int) taskRepository.count();
//        }
//
//        @PutMapping("/todos/{id}")//обновление отдельной задачи
//        public int Put(@PathVariable int id, @RequestBody Task t){
//            Task task = new Task();
//            task.setId(t.getId());
//            task.setName(t.getName());
//            task.setTasktext(t.getTasktext());
//            SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yy HH.mm");
//            task.setDate(dateFormat.format(new Date()));//обновляем дату-время задачи
//            taskRepository.save(task);
//            return task.getId();
//        }
//
//        @GetMapping("/todos/count")//общее количество задач
//        public int get(){
//            return (int) taskRepository.count();
//        }
//    }
}