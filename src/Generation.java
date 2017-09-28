public class Generation {
    Person[][] people;
    Integer generationNumber = 0;
    Integer classSize =0;

    public Generation(int y, int x){
        people = new Person[y][x];
        int idCounter = 0;


        for(int i = 0; i < y; i++){
            for(int j = 0; j < x; j++){

                Person newPerson = new Person();
                newPerson.setID(idCounter);
                newPerson.setLocation(i, j);
                newPerson.setID(idCounter);
                people[i][j] = newPerson;

                ++idCounter;


            }
        }
        for (int a = 0; a < y; a++){
            for (int b = 0; b < x; b++){
                people[a][b].setNeighbors(people);
            }
        }
    }

    public void setSize(){
        classSize = people.length*people[0].length;
    }

    public Person[][] getGeneration(){
        return people;
    }
}
