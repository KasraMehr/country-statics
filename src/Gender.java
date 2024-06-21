/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author mountain
 */
import java.util.List;

public interface Gender {
    static int ManCounter(List<Human> humanList) {
        int man = 0;
        for (Human human : humanList) {
            if (human.isGender()) {
                man++;
            }
        }
        return man;
    }

    static int WomanCounter(List<Human> humanList) {
        int woman = 0;
        for (Human human : humanList) {
            if (!human.isGender()) {
                woman++;
            }
        }
        return woman;
    }
}

