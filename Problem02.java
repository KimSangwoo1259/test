package test;

public class Problem02 {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        int result = calculator.add(4).add(5).subtract(3).out();
        System.out.println(result);
    }
    static class Calculator {

        int value;

        public Calculator() {
            this.value = 0;
        }

        public Calculator(int value) {
            this.value = value;
        }

        Calculator add(int other){
            this.value += other;
            return this;
        }

        Calculator subtract(int other){
            this.value -= other;
            return this;
        }
        int out(){
            return this.value;
        }


}

}
