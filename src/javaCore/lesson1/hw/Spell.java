package javaCore.lesson1.hw;

public class Spell {

    private String spellName;
    private int manaCost;
    String result;

    public Spell(String spellName, int manaCost){
        this.spellName = spellName;
        this.manaCost = manaCost;
    }

    public String castSpell(FacultyOfMagic facultyOfMagic){
        result = "Факультет магии: " + facultyOfMagic.getName() + " " + '\n';
        for (Wizard mage: facultyOfMagic.getWizards()) {
            result = result + "Имя волшебника: " + mage.getName() + " " + '\n';
            int wizardMana = mage.getMana();
            castOfMagic(spellName, manaCost, wizardMana);
        }

        return result;
    }

    private void castOfMagic(String spellName, int manaCost, int wizardMana ){
        if(wizardMana > manaCost) result = result + "Заклинание: " + spellName + " успешно скастовано!" + '\n';
        else result = result + "Заклинание: " + spellName + " не сотворено!" + '\n';
    }
}
