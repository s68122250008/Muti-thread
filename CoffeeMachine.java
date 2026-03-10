import java.util.concurrent.atomic.AtomicInteger;

class CoffeeMachine {

    AtomicInteger a1 = new AtomicInteger(0);

    public synchronized void brew(String menu) {
        System.out.println(Thread.currentThread().getName() + " กำลังใช้เครื่องชง: " + menu);

        try {
            Thread.sleep((long) (Math.random() * 3000));
        } catch (InterruptedException e) {
        }

        int currentCup = a1.incrementAndGet();

        System.out.println(
                Thread.currentThread().getName() + "เครื่องดื่มเสร็จ: " + menu + " (แก้วที่ " + currentCup + ")");
    }
}