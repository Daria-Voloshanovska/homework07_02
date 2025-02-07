public class Person {
    private String name;
    private int age;

    public Person( String name,int age) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return name + " - " + age;
    }

    public static int compare(Person p1, Person p2){
        return p1.age - p2.age;
    }

    public static void bubbleSort(Person[] people){
        int n = people.length;
        boolean swapped;
        for(int  i =0; i <n-1; i++){
            swapped = false;
            for (int j = 0; j < n-1-i; j++){
                if (compare (people[j], people[j+1]) < 0){
                    Person temp = people [j];
                    people[j] = people[j+1];
                    people[j+1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

    public static void printPeople(Person[] people){
        for (Person p : people){
            System.out.println(p);
        }

    }
}
