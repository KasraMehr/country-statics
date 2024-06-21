/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mountain
 */

import java.util.ArrayList;
import java.util.List;

public class Random {
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
    
    
    String[] firstname = {"Ali", "َArtin", "Arsham", "Basam", "Behroz", "Behzad", "Behrad", "Nima", "Hana", "Mahdie", "Fateme", "Zahra", "Kasra", "An", "Amir", "Mahsa", "Siavash"};
    String[] lastname = {"Abbasi", "Hamidi", "Taghavi", "Mehralizadeh", "Gharali", "Aghaloo", "Keshavarz", "Amini", "Mohseni", "Ramandi", "Fasihi", "Fallahi", "Mollai", "Valinejad"};
    String[] education = {"underGraduate", "Bachelor", "Masters", "Doctoral", "Post Doctoral"};
    String[] ethnicity = {"lor", "kord", "turk", "shomali", "sistani", "mashhadi"};
    String[] jobName = {"businessman", "teacher", "Engineer", "Doctor", "Dentist"};
    String[] major = {"computer", "electric", "physics", "Mathematics", "Sports", "Religion"};
    String[] university = {"Sharif", "Amir Kabir", "Tehran", "Khaje Nasir", "Allame", "Beheshti", "Kharazmi", "Khomeini", "lanat beheshh"};
    String[] organisation = {"kale", "Digikala", "Mahram", "Mihan", "Esnap", "Tapsi", "Bazar", "Mayket"};
    String[] jobPosition = {"Developer", "Boss", "Digital marketer", "Assistant", "new entry", "junior"};
    String[] sportMajor = {"Taekwondo", "Basketball", "Karate", "Box", "Football", "Vollyball", "Chess"};
    java.util.Random random = new java.util.Random();
    
    
    public List<Employeed> employedRandom(int number, List<Employeed> employedList, List<HigherDiploma> higherDiplomaList, List<Human> humanList) {
        for(int i=1; i <= number; i++){
            Date date = new Date(random.nextInt(70) + 1950, random.nextInt(12) + 1, random.nextInt(30) + 1);

            Employeed employed = new Employeed(firstname[random.nextInt(17)], lastname[random.nextInt(14)], Integer.toString(random.nextInt(9999) + 10000),
                    education[random.nextInt(5)], ethnicity[random.nextInt(6)], random.nextBoolean(), date, random.nextDouble(1000) + 100,
                    jobName[random.nextInt(5)], true, major[random.nextInt(6)], university[random.nextInt(9)], organisation[random.nextInt(8)],
                    random.nextInt(30), jobPosition[random.nextInt(6)]);

            ObjectFileIO file = new ObjectFileIO();
            file.WriteEmployed(employed, employedList, higherDiplomaList, humanList);
        }
        return employedList;
    }

    public List<HigherDiploma> higherDiplomasRandom(int number, List<HigherDiploma> higherDiplomaList, List<Human> humanList) {
        for(int i=1; i <= number; i++){
            Date date = new Date(random.nextInt(70) + 1950, random.nextInt(12) + 1, random.nextInt(30) + 1);

            HigherDiploma higherDiploma = new HigherDiploma(firstname[random.nextInt(17)], lastname[random.nextInt(14)], Integer.toString(random.nextInt(9999) + 10000),
                    education[random.nextInt(5)], ethnicity[random.nextInt(6)], random.nextBoolean(), date, random.nextDouble(1000) + 100,
                    jobName[random.nextInt(5)], false, major[random.nextInt(6)], university[random.nextInt(9)]);

            ObjectFileIO file = new ObjectFileIO();
            file.WriteHigherDiploma(higherDiploma, higherDiplomaList, humanList);
        }
        return higherDiplomaList;
    }
    
    
    public List<LowerDiploma> LowerDiplomaRandom(int number, List<LowerDiploma> lowerDiplomaList, List<Human> humanList) {
        for(int i=1; i <= number; i++){
            Date date = new Date(random.nextInt(70) + 1950, random.nextInt(12) + 1, random.nextInt(30) + 1);

            LowerDiploma lowerDiploma = new LowerDiploma(firstname[random.nextInt(17)], lastname[random.nextInt(14)], Integer.toString(random.nextInt(9999) + 10000),
                    education[random.nextInt(5)], ethnicity[random.nextInt(6)], random.nextBoolean(), date, random.nextDouble(1000) + 100,
                    jobName[random.nextInt(5)], false, random.nextBoolean(), sportMajor[random.nextInt(7)], random.nextBoolean());

            ObjectFileIO file = new ObjectFileIO();
            file.WriteLowerDiploma(lowerDiploma, lowerDiplomaList, humanList);
        }
        return lowerDiplomaList;
    }
}
