package io.github.keyurgolani.funfacts;

import java.util.Random;
import java.util.Vector;

/**
 * Created by keyurgolani on 2/3/17.
 */

public class FactBook {

    Vector<String> mFacts = new Vector<String>();
    Random randomGenerator = new Random();

    public void addFact(String fact) {
        mFacts.add(fact);
    }

    public FactBook() {
        this.addFact("Ants stretch when they wake up in the morning.");
        this.addFact("Ostriches can run faster than horses.");
        this.addFact("Olympic gold medals are actually made mostly of silver.");
        this.addFact("You are born with 300 bones; by the time you are an adult you will have 206.");
        this.addFact("It takes about 8 minutes for light from the Sun to reach Earth.");
        this.addFact("Some bamboo plants can grow almost a meter in just one day.");
        this.addFact("The state of Florida is bigger than England.");
        this.addFact("Some penguins can leap 2-3 meters out of the water.");
        this.addFact("On average, it takes 66 days to form a new habit.");
        this.addFact("Mammoths still walked the earth when the Great Pyramid was being built.");
    }

    public String randomFact() {
        return mFacts.get(randomGenerator.nextInt(mFacts.size()));
    }

}
