package LabSheetSix;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Callum Anderson
 * @version 1.0
 */

public class Module {

    private final String name;
    private final List<Student> students;

    public Module(String name){

        this.name = name;
        this.students = new ArrayList<>();

    }

}
