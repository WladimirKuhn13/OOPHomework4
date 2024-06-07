package less4.service;

import less4.model.Teatcher;

public class TeacherService {

    
    public Teatcher createTeatcher(int id, String name, String last) {
        Teatcher newTeatcher = new Teatcher(id, name, last);
        System.out.println("Учитель создан! " + newTeatcher);
        return newTeatcher;
    }



    public void editTeatcher(Teatcher teatcher, int id, String name, String last) {
        teatcher.setId(id);
        teatcher.setName(name);
        teatcher.setLastName(last);
        System.out.println("Поля учителя изменены! " + teatcher);
    }
}
