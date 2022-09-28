package javaCore.lesson1.hw;

public class FacultyOfMagic {

    private String name;
    private Wizard[] wizards;

    public FacultyOfMagic(String name, Wizard[] wizards){
        this.name = name;
        this.wizards = wizards;
    }

    public String getName() {
        return name;
    }

    public Wizard[] getWizards() {
        return wizards;
    }
}
