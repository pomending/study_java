package ex5_work;

public class Calculate {

    public void plus(int n1, int n2) {
        System.out.println("결과 : " + (n1 + n2));
    }

    public void minus(int n1, int n2) {
        System.out.println("결과 : " + (n1 - n2));
    }

    public void multi(int n1, int n2) {
        System.out.println("결과 : " + (n1 * n2));
    }

    public void divide(float n1, int n2) {
        System.out.println("결과 : " + (n1 / n2));
    }

    public void error() {
        System.out.println("연산기호가 올바르지 않습니다");
        System.out.println("결과 : -1");
    }

    public int getResult(int n1, int n2, String op) {

        switch (op) {
            case "+":
                return (n1 + n2);

            case "-":
                return (n1 - n2);

            case "*":
                return (n1 * n2);

            case "/":
                return (n1 / n2);

            default:
                System.out.println("연산기호가 올바르지 않습니다");
                return -1;

        }

    }

}
