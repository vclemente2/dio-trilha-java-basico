import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        Person gabi = new Person("Gabriela", 1.63f);
        Person vinicius = new Person("Vinicius", 1.84f);
        Person pacoca = new Person("Paçoca", 0.50f);
        Person mima = new Person("Mima", 1.72f);


        PeopleClassify peopleClassify = new PeopleClassify();

        peopleClassify.addPerson(vinicius);
        peopleClassify.addPerson(pacoca);
        peopleClassify.addPerson(mima);
        peopleClassify.addPerson(gabi);

//        peopleClassify.removeByName("gabriela");
//        peopleClassify.removeByName("VINICIUS");

        peopleClassify.sortByHeight(false);

        peopleClassify.printEachPerson();
    }
}