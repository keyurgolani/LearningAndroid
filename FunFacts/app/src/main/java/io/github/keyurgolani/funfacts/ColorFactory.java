package io.github.keyurgolani.funfacts;

import android.graphics.Color;

import java.util.Random;
import java.util.Vector;

/**
 * Created by keyurgolani on 2/3/17.
 */
public class ColorFactory {

    Vector<Integer> mColors = new Vector<Integer>();
    Random randomGenerator = new Random();

    public ColorFactory() {
        mColors.add(Color.parseColor("#39add1"));
        mColors.add(Color.parseColor("#3079ab"));
        mColors.add(Color.parseColor("#c25975"));
        mColors.add(Color.parseColor("#e15258"));
        mColors.add(Color.parseColor("#f9845b"));
        mColors.add(Color.parseColor("#838cc7"));
        mColors.add(Color.parseColor("#7d669e"));
        mColors.add(Color.parseColor("#53bbb4"));
        mColors.add(Color.parseColor("#51b46d"));
        mColors.add(Color.parseColor("#e0ab18"));
        mColors.add(Color.parseColor("#637a91"));
        mColors.add(Color.parseColor("#f092b0"));
        mColors.add(Color.parseColor("#b7c0c7"));
    }

    public int randomColor() {
        return mColors.get(randomGenerator.nextInt(mColors.size()));
    }
}
