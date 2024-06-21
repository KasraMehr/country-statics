import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ObjectFileIO {
    
    public String PlantsPrint(List<Plants> plantsList){
        String allPlant = "";
        for(Plants plants : plantsList){
            allPlant = allPlant + plants.printPlant();
        }
        return allPlant;
    }


    public String MedicalPrint(List<Medical> medicalList){
        String allMedical = "";
        for(Medical medical : medicalList){
            allMedical = allMedical + medical.printMedical();
        }
        return allMedical;
    }


    public String FlowerPrint(List<Flower> flowerList){
        String allFlower = "";
        for(Flower flower : flowerList){
            allFlower = allFlower + flower.printFlower();
        }
        return allFlower;
    }


    public String TreePrint(List<Tree> treeList){
        String allTree = "";
        for(Tree tree : treeList){
            allTree = allTree + tree.printTree();
        }
        return allTree;
    }


    public String SpecialPlantPrint(List<SpecialPlants> specialPlantsList){
        String allSpecialPlants = "";
        for(SpecialPlants specialPlant : specialPlantsList){
            allSpecialPlants = allSpecialPlants + specialPlant.printSpecialPlant();
        }
        return allSpecialPlants;
    }
    
    public String LandSourcesPrint(List<LandSources> landSourcesList){
        String allLandSources = "";
        for(LandSources landSource : landSourcesList){
            allLandSources = allLandSources + landSource.printLandSource();
        }
        return allLandSources;
    }


    public String LandPrint(List<Land> landList){
        String allLand = "";
        for(Land land : landList){
            allLand = allLand + land.printLand();
        }
        return allLand;
    }


    public String WaterPrint(List<Water> waterList){
        String allWater = "";
        for(Water water : waterList){
            allWater = allWater + water.printWater();
        }
        return allWater;
    }


    public String SpecialLandSourcePrint(List<SpecialLandSource> specialLandSourceList){
        String allSpecialLandSource = "";
        for(SpecialLandSource specialLandSource : specialLandSourceList){
            allSpecialLandSource = allSpecialLandSource + specialLandSource.printSpecialLandSource();
        }
        return allSpecialLandSource;
    }
    
    public String AnimalPrint(List<Animal> animalList){
        String allAnimal = "";
        for(Animal animal : animalList){
            allAnimal = allAnimal + animal.printAnimal();
        }
        return allAnimal;
    }


    public String BirdPrint(List<Bird> birdList){
        String allBird = "";
        for(Bird bird : birdList){
            allBird = allBird + bird.printBird();
        }
        return allBird;
    }


    public String FishPrint(List<Fish> fishList){
        String allFish = "";
        for(Fish fish : fishList){
            allFish = allFish + fish.printFish();
        }
        return allFish;
    }


    public String MammalPrint(List<Mammal> mammalList){
        String allMammal = "";
        for(Mammal mammal : mammalList){
            allMammal = allMammal + mammal.printMammal();
        }
        return allMammal;
    }


    public String SpecialAnimalPrint(List<SpecialAnimals> specialAnimalsList){
        String allSpecialAnimal = "";
        for(SpecialAnimals specialAnimal : specialAnimalsList){
            allSpecialAnimal = allSpecialAnimal + specialAnimal.printSpecialAnimal();
        }
        return allSpecialAnimal;
    }
    
    public String HumanPrint(List<Human> humanList){
        String allHuman = "";
        for(Human human : humanList){
            allHuman = allHuman + human.printHuman();
        }
        return allHuman;
    }


    public String LowerDiplomaPrint(List<LowerDiploma> lowerDiplomaList){
        String allLowerDiploma = "";
        for(LowerDiploma lowerDiploma : lowerDiplomaList){
            allLowerDiploma = allLowerDiploma + lowerDiploma.printLowerDiploma();
        }
        return allLowerDiploma;
    }


    public String HigherDiplomaPrint(List<HigherDiploma> higherDiplomaList){
        String allHigherDiploma = "";
        for(HigherDiploma higherDiploma : higherDiplomaList){
            allHigherDiploma = allHigherDiploma + higherDiploma.printHigherDiploma();
        }
        return allHigherDiploma;
    }


    public String EmployedPrint(List<Employeed> employedList){
        String allEmployed = "";
        for(Employeed employed : employedList){
            allEmployed = allEmployed + employed.printEmployed();
        }
        return allEmployed;
    }
    
    
    public Human searchHuman(List<Human> humanList, String ID){
        boolean found = false;
        Human  human = null;
        for(Human human1: humanList){
            if(Objects.equals(human1.getID(), ID)){
                found = true;
                human = human1;
                break;
            }
        }
        if(!found){return null;}
        else {
            return human;
        }
    }


    public SpecialAnimals searchSpecialAnimal(List<SpecialAnimals> specialAnimalsList, long ID){
        boolean found = false;
        SpecialAnimals  specialAnimal = null;
        for(SpecialAnimals specialAnimal1: specialAnimalsList){
            if(specialAnimal1.getID() == ID){
                found = true;
                specialAnimal = specialAnimal1;
                break;
            }
        }
        if(!found){return null;}
        else {
            return specialAnimal;
        }
    }


    public SpecialLandSource searchLandSource(List<SpecialLandSource> specialLandSourceList, String name){
        boolean found = false;
        SpecialLandSource  specialLandSource = null;
        for(SpecialLandSource specialLandSource1: specialLandSourceList){
            if(Objects.equals(specialLandSource1.getName(), name)){
                found = true;
                specialLandSource = specialLandSource1;
                break;
            }
        }
        if(!found){return null;}
        else {
            return specialLandSource;
        }
    }


    public SpecialPlants searchPlant(List<SpecialPlants> specialPlantsList, long ID){
        boolean found = false;
        SpecialPlants specialPlant = null;
        for(SpecialPlants specialPlant1: specialPlantsList){
            if(specialPlant1.getID() == ID){
                found = true;
                specialPlant = specialPlant1;
                break;
            }
        }
        if(!found){return null;}
        else {
            return specialPlant;
        }
    }
    
    
    
    public void WriteLowerDiploma(LowerDiploma lowerDiploma, List<LowerDiploma> lowerDiplomaList, List<Human> humanList){
        lowerDiplomaList.add(lowerDiploma);
        humanList.add(lowerDiploma);
        try {
            FileOutputStream fileOut = new FileOutputStream("LowerDiploma.dat");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            for(LowerDiploma lowerDiploma1 : lowerDiplomaList){
                out.writeObject(lowerDiploma1);
            }
            out.close();
            fileOut.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public void WriteHigherDiploma(HigherDiploma higherDiploma, List<HigherDiploma> higherDiplomaList, List<Human> humanList){
        higherDiplomaList.add(higherDiploma);
        humanList.add(higherDiploma);
        try {
            FileOutputStream fileOut = new FileOutputStream("HigherDiploma.dat");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            for(HigherDiploma higherDiploma1 : higherDiplomaList){
                out.writeObject(higherDiploma1);
            }
            out.close();
            fileOut.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void WriteEmployed(Employeed employed, List<Employeed> employeedList, List<HigherDiploma> higherDiplomaList, List<Human> humanList){
        employeedList.add(employed);
        higherDiplomaList.add(employed);
        humanList.add(employed);
        try {
            FileOutputStream fileOut = new FileOutputStream("Employee.dat");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            for(Employeed employee : employeedList) {
                out.writeObject(employee);
            }
            out.close();
            fileOut.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void WriteBird(Bird bird, List<Animal> animalList, List<Bird> birdList){
        birdList.add(bird);
        animalList.add(bird);
        try {
            FileOutputStream fileOut = new FileOutputStream("Birds.dat");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            for(Bird bird1 : birdList) {
                out.writeObject(bird1);
            }
            out.close();
            fileOut.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void WriteFish(Fish fish, List<Animal> animalList, List<Fish> fishList){
        fishList.add(fish);
        animalList.add(fish);
        try {
            FileOutputStream fileOut = new FileOutputStream("Fishes.dat");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            for(Fish fish1 : fishList) {
                out.writeObject(fish1);
            }
            out.close();
            fileOut.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void WriteMammal(Mammal mammal, List<Animal> animalList, List<Mammal> mammalList){
        mammalList.add(mammal);
        animalList.add(mammal);
        try {
            FileOutputStream fileOut = new FileOutputStream("Mammals.dat");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            for(Mammal mammal1 : mammalList) {
                out.writeObject(mammal1);
            }
            out.close();
            fileOut.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void WriteSpecialAnimal(SpecialAnimals specialAnimal, List<Animal> animalList, List<SpecialAnimals> specialAnimalsList){
        specialAnimalsList.add(specialAnimal);
        animalList.add(specialAnimal);
        try {
            FileOutputStream fileOut = new FileOutputStream("SpecialAnimals.dat");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            for(SpecialAnimals specialAnimal1 : specialAnimalsList) {
                out.writeObject(specialAnimal1);
            }
            out.close();
            fileOut.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void WriteLand(Land land, List<LandSources> landsourcesList, List<Land> landsList){
        landsList.add(land);
        landsourcesList.add(land);
        try {
            FileOutputStream fileOut = new FileOutputStream("Land.dat");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            for(Land land1 : landsList) {
                out.writeObject(land1);
            }
            out.close();
            fileOut.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void WriteWater(Water water, List<LandSources> landsourcesList, List<Water> watersList){
        watersList.add(water);
        landsourcesList.add(water);
        try {
            FileOutputStream fileOut = new FileOutputStream("Water.dat");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            for(Water water1 : watersList) {
                out.writeObject(water1);
            }
            out.close();
            fileOut.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void WriteSpecialLandSource(SpecialLandSource specialLandSource, List<LandSources> landsourcesList, List<SpecialLandSource> specialLandSourcesList){
        specialLandSourcesList.add(specialLandSource);
        landsourcesList.add(specialLandSource);
        try {
            FileOutputStream fileOut = new FileOutputStream("SpecialLandSources.dat");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            for(SpecialLandSource specialLandSource1 : specialLandSourcesList) {
                out.writeObject(specialLandSource1);
            }
            out.close();
            fileOut.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void WriteTree(Tree tree, List<Plants> plantsList, List<Tree> treeList){
        treeList.add(tree);
        plantsList.add(tree);
        try {
            FileOutputStream fileOut = new FileOutputStream("Trees.dat");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            for(Tree tree1 : treeList) {
                out.writeObject(tree1);
            }
            out.close();
            fileOut.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void WriteMedical(Medical medical, List<Plants> plantsList, List<Medical> medicalList){
        medicalList.add(medical);
        plantsList.add(medical);
        try {
            FileOutputStream fileOut = new FileOutputStream("Medicals.dat");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            for(Medical medical1 : medicalList) {
                out.writeObject(medical1);
            }
            out.close();
            fileOut.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void WriteFlower(Flower flower, List<Plants> plantsList, List<Flower> flowerList){
        flowerList.add(flower);
        plantsList.add(flower);
        try {
            FileOutputStream fileOut = new FileOutputStream("Flowers.dat");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            for(Flower flower1 : flowerList) {
                out.writeObject(flower1);
            }
            out.close();
            fileOut.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void WriteSpecialPlant(SpecialPlants specialPlant, List<Plants> plantsList, List<SpecialPlants> specialPlantsList){
        specialPlantsList.add(specialPlant);
        plantsList.add(specialPlant);
        try {
            FileOutputStream fileOut = new FileOutputStream("SpecialPlants.dat");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            for(SpecialPlants specialPlant1 : specialPlantsList) {
                out.writeObject(specialPlant1);
            }
            out.close();
            fileOut.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


///////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////
    public void readLowerDiploma(List<LowerDiploma> lowerDiplomaList, List<Human> humanList) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("LowerDiploma.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);
        // Read the objects one by one and add them to the list
        while (fis.available() > 0) {
            lowerDiplomaList.add((LowerDiploma) ois.readObject());
        }
        // Close the input stream
        ois.close();

        for(LowerDiploma lowerDiploma : lowerDiplomaList){
            humanList.add(lowerDiploma);
        }

    }


    public void readHigherDiploma(List<HigherDiploma> higherDiplomaList, List<Human> humanList) throws IOException, ClassNotFoundException{
        FileInputStream fis = new FileInputStream("HigherDiploma.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);
        // Read the objects one by one and add them to the list
        while (fis.available() > 0) {
            higherDiplomaList.add((HigherDiploma) ois.readObject());
        }
        // Close the input stream
        ois.close();

        for(HigherDiploma higherDiploma : higherDiplomaList){
            humanList.add(higherDiploma);
        }
    }


    public void readEmployed(List<Employeed> employeedList, List<HigherDiploma> higherDiplomaList, List<Human> humanList) throws IOException, ClassNotFoundException{
        FileInputStream fis = new FileInputStream("Employee.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);
        // Read the objects one by one and add them to the list
        while (fis.available() > 0) {
            employeedList.add((Employeed) ois.readObject());
        }
        // Close the input stream
        ois.close();

        for(Employeed employed : employeedList){
            higherDiplomaList.add(employed);
            humanList.add(employed);
        }
    }


    public void readBird(List<Animal> animalList, List<Bird> birdList) throws IOException, ClassNotFoundException{

        FileInputStream fis = new FileInputStream("Birds.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);
        // Read the objects one by one and add them to the list
        while (fis.available() > 0) {
            birdList.add((Bird) ois.readObject());
        }
        // Close the input stream
        ois.close();

        for(Bird bird : birdList){
            animalList.add(bird);
        }
    }


    public void readFish(List<Animal> animalList, List<Fish> fishList) throws IOException, ClassNotFoundException{

        FileInputStream fis = new FileInputStream("Fishes.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);
        // Read the objects one by one and add them to the list
        while (fis.available() > 0) {
            fishList.add((Fish) ois.readObject());
        }
        // Close the input stream
        ois.close();

        for(Fish fish : fishList){
            animalList.add(fish);
        }
    }


    public void readMammal(List<Animal> animalList, List<Mammal> mammalList) throws IOException, ClassNotFoundException{

        FileInputStream fis = new FileInputStream("Mammals.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);
        // Read the objects one by one and add them to the list
        while (fis.available() > 0) {
            mammalList.add((Mammal) ois.readObject());
        }
        // Close the input stream
        ois.close();

        for(Mammal mammal : mammalList){
            animalList.add(mammal);
        }
    }


    public void readSpecialAnimal(List<Animal> animalList, List<SpecialAnimals> specialAnimalsList) throws IOException, ClassNotFoundException{

        FileInputStream fis = new FileInputStream("SpecialAnimals.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);
        // Read the objects one by one and add them to the list
        while (fis.available() > 0) {
            specialAnimalsList.add((SpecialAnimals) ois.readObject());
        }
        // Close the input stream
        ois.close();

        for(SpecialAnimals specialAnimals : specialAnimalsList){
            animalList.add(specialAnimals);
        }
    }


    public void readLand(List<LandSources> landsourcesList, List<Land> landsList) throws IOException, ClassNotFoundException{

        FileInputStream fis = new FileInputStream("Land.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);
        // Read the objects one by one and add them to the list
        while (fis.available() > 0) {
            landsList.add((Land) ois.readObject());
        }
        // Close the input stream
        ois.close();

        for(Land land : landsList){
            landsList.add(land);
        }
    }


    public void readWater(List<LandSources> landsourcesList, List<Water> watersList) throws IOException, ClassNotFoundException{

        FileInputStream fis = new FileInputStream("Water.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);
        // Read the objects one by one and add them to the list
        while (fis.available() > 0) {
            watersList.add((Water) ois.readObject());
        }
        // Close the input stream
        ois.close();

        for(Water water : watersList){
            landsourcesList.add(water);
        }
    }

    public void ReadSpecialLandSource(List<LandSources> landsourcesList, List<SpecialLandSource> specialLandSourcesList) throws IOException, ClassNotFoundException{

        FileInputStream fis = new FileInputStream("SpecialLandSources.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);
        // Read the objects one by one and add them to the list
        while (fis.available() > 0) {
            specialLandSourcesList.add((SpecialLandSource) ois.readObject());
        }
        // Close the input stream
        ois.close();

        for(SpecialLandSource specialLandSource : specialLandSourcesList){
            landsourcesList.add(specialLandSource);
        }
    }


    public void readTree(List<Plants> plantsList, List<Tree> treeList) throws IOException, ClassNotFoundException{

        FileInputStream fis = new FileInputStream("Trees.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);
        // Read the objects one by one and add them to the list
        while (fis.available() > 0) {
            treeList.add((Tree) ois.readObject());
        }
        // Close the input stream
        ois.close();

        for(Tree tree : treeList){
            plantsList.add(tree);
        }
    }


    public void readMedical(List<Plants> plantsList, List<Medical> medicalList) throws IOException, ClassNotFoundException{

        FileInputStream fis = new FileInputStream("Medicals.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);
        // Read the objects one by one and add them to the list
        while (fis.available() > 0) {
            medicalList.add((Medical) ois.readObject());
        }
        // Close the input stream
        ois.close();

        for(Medical medical : medicalList){
            plantsList.add(medical);
        }
    }


    public void readFlower(List<Plants> plantsList, List<Flower> flowerList) throws IOException, ClassNotFoundException{

        FileInputStream fis = new FileInputStream("Flowers.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);
        // Read the objects one by one and add them to the list
        while (fis.available() > 0) {
            flowerList.add((Flower) ois.readObject());
        }
        // Close the input stream
        ois.close();

        for(Flower flower : flowerList){
            plantsList.add(flower);
        }
    }


    public void readSpecialPlant(List<Plants> plantsList, List<SpecialPlants> specialPlantsList) throws IOException, ClassNotFoundException{

        FileInputStream fis = new FileInputStream("SpecialPlants.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);
        // Read the objects one by one and add them to the list
        while (fis.available() > 0) {
            specialPlantsList.add((SpecialPlants) ois.readObject());
        }
        // Close the input stream
        ois.close();

        for(SpecialPlants specialPlants : specialPlantsList){
            plantsList.add(specialPlants);
        }
    }


    public static void readFiles(String[] args) throws Exception{
        // Initialize empty lists to store the objects
        List<Human> humanList = new ArrayList<>();
        List<LowerDiploma> lowerDiplomaList = new ArrayList<>();
        List<HigherDiploma> higherDiplomaList = new ArrayList<>();
        List<Employeed> employedList = new ArrayList<>();
        List<Animal> animalList = new ArrayList<>();
        List<Mammal> mammalList = new ArrayList<>();
        List<Bird> birdList = new ArrayList<>();
        List<Fish> fishList = new ArrayList<>();
        List<SpecialAnimals> specialAnimalsList = new ArrayList<>();
        List<Land> landList = new ArrayList<>();
        List<Water> waterList = new ArrayList<>();
        List<SpecialLandSource> specialLandSourceList = new ArrayList<>();
        List<Medical> medicalList = new ArrayList<>();
        List<Tree> treeList = new ArrayList<>();
        List<Flower> flowerList = new ArrayList<>();
        List<SpecialPlants> specialPlantsList = new ArrayList<>();

        
        // Access the list of objects
        for (Human human : humanList) {
            // Do something with each object
            System.out.println(human.getBirthDate().getBirthDay());
        }
        System.out.print("lowerDiplomaList: ");
        for(LowerDiploma lowerDiploma : lowerDiplomaList){
            System.out.print(lowerDiploma.getEducation() + " // " + lowerDiploma.getJobName() + "\n" );
        }
        System.out.print("higherDiplomaList: ");
        for(HigherDiploma higherDiploma : higherDiplomaList){
            System.out.print(higherDiploma.getEducation() + " // " + higherDiploma.getJobName());
        }
    }
}
