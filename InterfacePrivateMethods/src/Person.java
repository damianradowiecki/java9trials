public interface Person {
    //create another implementation called Patient



    String name();
    String surname();

    int age();

    default String stringRepresentation(){
        return String.join(" and ", formatName(), formatSurname(), formatAge());
    }

    private String formatName(){
        return "His/her name is " + name();
    }

    private String formatSurname(){
        return "His/her surname is " + surname();
    }

    private String formatAge(){
        return "His/her is " + age() + " years old";
    }
}
