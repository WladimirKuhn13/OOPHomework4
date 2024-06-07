package less4;

import less4.controller.StudentController;
import less4.controller.TeacherController;
import less4.model.Student;
import less4.model.Teatcher;

import java.util.List;

public class Lesson4 {

    public static void main(String[] args) {

        new StudentController().sendOnConsole(List.of(new Student(1, "Sasha", "Ivanov"),new Student(1, "Ira", "Ivanova")));

        //Создание "Учителя"
        // new TeacherController().createTeatcher(1, "Svetlana", "Timofeeva"); 

        //Редактирование "Учителя"
        // new TeacherController().editTeatcher(new Teatcher(0, "Svetlana", "Timofeeva"), 99, "Svetlana", "Izmaylova");

        //Отображение списка "Учителей"
        // new TeacherController().sendOnConsole(List.of(new Teatcher(0, "Svetlana", "Timofeeva"), new Teatcher(1, "Anna", "Izmaylova")));
    }


}
