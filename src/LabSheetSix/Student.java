package LabSheetSix;

/**
 * @author Callum Anderson
 * @version 1.0
 */

public class Student {

    /*
    This exercise is about writing code from a given UML diagram with the required methods.
     */

    private String name;
    private final int studentNum;
    private final Address termAdd, homeAdd;

    public Student(){

        this.name = "DEFAULT";
        this.studentNum = 0;
        this.termAdd = new Address();
        this.homeAdd = new Address();

    }

    public void setName(String name){ this.name = name; }
}
