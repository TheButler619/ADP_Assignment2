package za.ac.cput.prisoner;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

/*
 * Author: Keenan Solomons 219264228
 * Description: Assignment 2 for ADP372S
 * Prisoner Test Class
 */

class PrisonerTest {

    Prisoner prisoner1 = new Prisoner(1, "Keenan", "000");
    Prisoner prisoner2 = new Prisoner(2, "Jeff", "001");
    Prisoner prisoner3 = new Prisoner(3, "Luke", "000");
    Prisoner prisoner4 = new Prisoner(4, "Zack", "002");

    @Test
    void testCollection(){
        //add
        Collection<Prisoner> prisonerCollection = new LinkedHashSet<>();
        prisonerCollection.add(prisoner1);
        prisonerCollection.add(prisoner2);
        prisonerCollection.add(prisoner3);
        prisonerCollection.add(prisoner4);

        //testcase for add
        assertEquals(4, prisonerCollection.size());
        System.out.println(prisonerCollection);

        //remove
        prisonerCollection.remove(prisoner1);

        //testcase for remove
        assertEquals(3, prisonerCollection.size());
        System.out.println(prisonerCollection);

        //find
        if(prisonerCollection.contains(prisoner4)){
            System.out.println("Prisoner is here");
        }else{
            System.out.println("Prisoner is not here");
        }

        //testcase for find
        assertEquals(true, prisonerCollection.contains(prisoner4));
    }

    @Test
    void testMap() {
        //add
        Map<Integer, Prisoner> prisonerMap = new HashMap<>();
        prisonerMap.put(0, prisoner1);
        prisonerMap.put(1, prisoner2);
        prisonerMap.put(2, prisoner3);
        prisonerMap.put(3, prisoner4);

        //testcase for add
        assertEquals(4, prisonerMap.size());
        System.out.println(prisonerMap);

        //remove
        prisonerMap.remove(1);

        //testcase for remove
        assertEquals(3, prisonerMap.size());
        System.out.println(prisonerMap);

        //find
        if(prisonerMap.containsValue(prisoner1)){
            System.out.println("Prisoner is here");
        }else{
            System.out.println("Prisoner is not here");
        }

        //testcase for find
        assertEquals(true, prisonerMap.containsValue(prisoner1));
    }

    @Test
    void testSet() {
        //add
        HashSet<Prisoner> prisonerSet = new HashSet<>();
        prisonerSet.add(prisoner1);
        prisonerSet.add(prisoner2);
        prisonerSet.add(prisoner3);
        prisonerSet.add(prisoner4);

        //testcase for add
        assertEquals(4, prisonerSet.size());
        System.out.println(prisonerSet);

        //remove
        prisonerSet.remove(prisoner3);

        //testcase for remove
        assertEquals(3, prisonerSet.size());
        System.out.println(prisonerSet);

        //find
        if(prisonerSet.contains(prisoner2)){
            System.out.println("Prisoner is here");
        }else{
            System.out.println("Prisoner is not here");
        }

        //testcase for find
        assertEquals(true, prisonerSet.contains(prisoner2));
    }

    @Test
    void testList() {
        //add
        List<Prisoner> prisonerList = new ArrayList<>();
        prisonerList.add(prisoner1);
        prisonerList.add(prisoner2);
        prisonerList.add(prisoner3);
        prisonerList.add(prisoner4);

        //testcase for add
        assertEquals(4, prisonerList.size());
        System.out.println(prisonerList);

        //remove
        prisonerList.remove(3);

        //testcase for delete
        assertEquals(3, prisonerList.size());
        System.out.println(prisonerList);

        //find
        if(prisonerList.contains(prisoner3)){
            System.out.println("Prisoner is here");
        }else{
            System.out.println("Prisoner is not here");
        }

        //testcase for find
        assertEquals(true, prisonerList.contains(prisoner3));
    }
}