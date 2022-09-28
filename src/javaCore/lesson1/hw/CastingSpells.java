package javaCore.lesson1.hw;

public class CastingSpells {

    public static void main(String[] args) {
        Wizard[] magesFire = {new Wizard("Гомер", 300),
                            new Wizard("Гендальф", 500)};
        Wizard[] magesCold = {new Wizard("Фродо", 150),
                            new Wizard("Сорка", 321)};
        Wizard[] magesElectric = {new Wizard("Некромант", 380),
                            new Wizard("Друид", 999)};
        FacultyOfMagic fire = new FacultyOfMagic("Пирокинетика", magesFire);
        FacultyOfMagic cold = new FacultyOfMagic("Холодрыга", magesCold);
        FacultyOfMagic electric = new FacultyOfMagic("Электроника", magesElectric);
        Spell spell = new Spell("Холодная стрела", 160);
        String castMagic = spell.castSpell(fire);
        System.out.println(castMagic);
        castMagic = spell.castSpell(cold);
        System.out.println(castMagic);
        castMagic = spell.castSpell(electric);
        System.out.println(castMagic);
    }
}
