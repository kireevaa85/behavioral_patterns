package ru.kireev.strategy;

/**
 * @author sergey
 * created on 11.09.18.
 */
public class Demo {
  public static void main(String[] args) {
    Context context = new Context();
    context.setStrategy(new Bus());
    context.applyStrategy();

    context.setStrategy(new Car());
    context.applyStrategy();

    context.setStrategy(new Taxi());
    context.applyStrategy();

    context.setStrategy(() -> System.out.println("Долетель на ракете"));
    context.applyStrategy();

  }

}
