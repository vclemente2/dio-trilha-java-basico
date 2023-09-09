import java.util.ArrayList;
import java.util.List;

public class PeopleClassify {
    private List<Person> peopleList;

    public PeopleClassify(){
        this.peopleList = new ArrayList<Person>();
    }

    public void addPerson(Person person){
        this.peopleList.add(person);
        System.out.println("\nLista atualizada:");
        this.printList();
    }

    public void removeByName(String personName) {
        boolean personRemoved = false;
        for (Person person : peopleList) {
            if (person.getName().equalsIgnoreCase(personName)) {
                this.peopleList.remove(person);
                personRemoved = true;
                break;
            }
        }
        if (!personRemoved) {
            System.out.println("Pessoa não localizada.");
        } else {
            System.out.println(personName + " removido(a) com sucesso.");
        }

        System.out.println("\nLista atualizada:");
        this.printList();
    }

    public void sortByHeight(boolean ASC){

        if(ASC){
            for (int i = 0; i < peopleList.size(); i++) {
                Person shorterPerson = peopleList.get(i);
                Person tallestPerson;
                for(int j = i + 1; j < peopleList.size(); j++){
                    tallestPerson = peopleList.get(j);

                    if (peopleList.get(i).getHeight() > peopleList.get(j).getHeight()){
                        shorterPerson = peopleList.get(j);
                        tallestPerson = peopleList.get(i);
                    }
                    peopleList.set(j, tallestPerson);
                    peopleList.set(i, shorterPerson);
                }
            }
        }else{
            for (int i = 0; i < peopleList.size(); i++) {
                Person shorterPerson;
                Person tallestPerson = peopleList.get(i);
                for(int j = i + 1; j < peopleList.size(); j++){
                    shorterPerson = peopleList.get(j);

                    if (peopleList.get(i).getHeight() < peopleList.get(j).getHeight()){
                        shorterPerson = peopleList.get(i);
                        tallestPerson = peopleList.get(j);
                    }
                    peopleList.set(j, shorterPerson);
                    peopleList.set(i, tallestPerson);
                }
            }
        }

        this.printList();
    }

    private void printList(){
        String list = "{\n";

        for(Person person: peopleList){
            list += "{name: " + person.getName() + ", height: " + person.getHeight() + "},\n";
        }

        list += "}";

        System.out.println(list);
    }

    public void printEachPerson(){
        this.peopleList.stream().forEach(n -> System.out.println("Nome: " + n.getName()));
    }
}
