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

    public static void mergeSort(Person[] people, int left,int right){
        if (left < right){
            int mid = left + (right - left) / 2;

            mergeSort(people,left,mid);
            mergeSort(people, mid+1,right);

            merge(people,left,mid,right);
        }
    }

    public static void merge(Person[] people, int left,int mid,int right){
        int leftSize = mid - left + 1;
        int rightSize = right - mid;

        Person[] leftArray = new Person[leftSize];
        Person[] rightArray = new Person[rightSize];

        for (int i=0; i<leftSize; i++){
            leftArray[i] = people[left + i];
        }
        for (int j = 0; j < rightSize; j++) {
            rightArray[j] = people[mid +1+j];
        }
            int i =0, j =0, k = left;

        while(i < leftSize && j < rightSize){
            if (leftArray[i].age >= rightArray[j].age){
                people[k] = leftArray[i];
                i++;
            } else {
                people [k] = rightArray[j];
                j++;
            }
            k++;
        }
        while (i < leftSize){
            people[k] = leftArray[i];
            i++;
            k++;
        }
while (j < rightSize){
    people[k] = rightArray[j];
    j++;
    k++;
}
        }

    public static void printPeople(Person[] people){
        for (Person p : people){
            System.out.println(p);
        }

    }
}
