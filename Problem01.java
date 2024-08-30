package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem01 {
    public static void main(String[] args) {
        List<Bread> breadList = new ArrayList<>();
        breadList.add(BreadFactory.createBread("cream", 100, 100, 200));
        breadList.add(BreadFactory.createBread("sugar", 100, 50, 200));
        breadList.add(BreadFactory.createBread("butter", 100, 100, 50));


        for (Bread bread : breadList) {
            System.out.println(bread);
            System.out.println();
        }
    }

    public static class BreadFactory {
        public static Bread createBread(String breadType, int flour, int water, int cream) {
            Map<String,Bread> breadMap = new HashMap<>();

            breadMap.put("cream", new CreamBread(breadType, flour, water, cream));
            breadMap.put("sugar", new SugarBread(breadType, flour, water, cream));
            breadMap.put("butter", new ButterBread(breadType, flour, water, cream));

            return breadMap.get(breadType);
        }
    }

    public static abstract class Bread {
        String breadType;
        Recipe recipe;

        static class Recipe {
            int flour,water, cream;

            public Recipe(int flour, int water, int cream) {
                this.flour = flour;
                this.water = water;
                this.cream = cream;
            }

            @Override
            public String toString() {
                return "recipe\n" + "flour: " + flour + "\n" + "water: " + water + "\n" + "cream: " + cream;

            }
        }

        public Bread(String breadType, int flour, int water, int cream) {
            this.breadType = breadType;
            this.recipe = new Recipe(flour, water, cream);
        }

        @Override
        public String toString() {
            return "breadType: " + breadType + "\n" + recipe.toString();
        }
    }
    public static class CreamBread extends Bread {
        public CreamBread(String breadType, int flour, int water, int cream) {
            super(breadType, flour, water, cream);
        }

        @Override
        public String toString() {
            return super.toString();
        }
    }

    public static class SugarBread extends Bread {
        public SugarBread(String breadType, int flour, int water, int cream) {
            super(breadType, flour, water, cream);
        }

        @Override
        public String toString() {
            return super.toString();
        }
    }

    public static class ButterBread extends Bread {
        public ButterBread(String breadType, int flour, int water, int cream) {
            super(breadType, flour, water, cream);
        }

        @Override
        public String toString() {
            return super.toString();
        }
    }
}
