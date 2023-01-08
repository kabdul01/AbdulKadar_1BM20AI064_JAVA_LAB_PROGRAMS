 enum Size {
    SMALL,
    MEDIUM,
    LARGE;
}

class Test {

    Size PizzaSize;

    Test(Size PizzaSize) {
        this.PizzaSize = PizzaSize;
    }

    public void orderPizza() {
        switch(PizzaSize) {
            case SMALL:
                System.out.println("I have ordered Small Pizza");
                break;
            case MEDIUM:
                System.out.println("I have ordered Regular Pizza");
                break;
            case LARGE:
                System.out.println("I have ordered Large Pizza");
                break;
            default:
                System.out.println("I have not ordered the Pizza");
                break;
        }
    }
}

public class _5a_OrderPizza {
    public static void main(String[] args) {
        Test pizza = new Test(Size.SMALL);
        pizza.orderPizza();
    }
}
