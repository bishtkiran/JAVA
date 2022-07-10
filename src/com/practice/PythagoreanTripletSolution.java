package com.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class PythagoreanTriplet {
    private int num1;
    private int num2;
    private int num3;
    public PythagoreanTriplet(int num1, int num2, int num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }
    public static TripletBuilder makeTripletsList() {
        return new TripletBuilder();
    }
    public static class TripletBuilder {
        private int maxNumber, sum;
        public TripletBuilder withFactorsLessThanOrEqualTo(int maxNumber) {
            this.maxNumber = maxNumber;
            return this;
        }
        public TripletBuilder thatSumTo(int sum) {
            this.sum = sum;
            return this;
        }
        public List<PythagoreanTriplet> build() {
            List<PythagoreanTriplet> triplets = new ArrayList<>();
            for (int i = 1; i <= maxNumber; i++) {
                for (int j = 1; j <= maxNumber; j++) {
                    int k = sum - i - j;
                    if (i * i + j * j == k * k && i < j) triplets.add(new PythagoreanTriplet(i, j, k));
                }
            }
            return triplets;
        }
    }
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        final PythagoreanTriplet triplet = (PythagoreanTriplet) o;
        return num1 == triplet.num1 && num2 == triplet.num2 && num3 == triplet.num3;
    }
    @Override
    public int hashCode() {
        return Objects.hash(num1, num2, num3);
    }
}
public class PythagoreanTripletSolution {
    public static void main(String[] args) {
        PythagoreanTriplet.TripletBuilder tripletBuilder = new PythagoreanTriplet.TripletBuilder();
        tripletBuilder.withFactorsLessThanOrEqualTo(12);
        tripletBuilder.thatSumTo(12);
        tripletBuilder.build();
    }
}
