package less4.controller;

import java.util.List;

import less4.model.Teatcher;
import less4.model.User;
import less4.service.TeacherService;
import less4.view.TeacherView;
import less4.view.UserView;

public class TeacherController implements UserController {

    private UserView<Teatcher> view = new TeacherView();
    private TeacherService teacherService = new TeacherService();

    @Override
    public <T extends User> User create(T user) {
        return user;
    }

    public void sendOnConsole(List<Teatcher> teatchers) {
        view.sendOnConsole(teatchers);
    }


    public void editTeatcher(Teatcher teatcher, int id, String name, String last) {
        teacherService.editTeatcher(teatcher, id, name, last);
    }

    public Teatcher createTeatcher(int id, String name, String last) {

        return teacherService.createTeatcher(id, name, last);

    }


    
}
