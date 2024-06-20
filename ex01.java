
class NewThread implements Runnable {
    Thread t;
    String name;
    int time;

    NewThread(String threadname, int ti) {
        name = threadname;
        time = ti;
        t = new Thread(this, name);
        t.start();
    }

    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(name + ":" + i);
                Thread.sleep(time);
            }
        } catch (InterruptedException e) {
            System.out.println(name + "thread interrupted");
        }
        System.out.println(name + "thread exited");
    }
}

class ex01 {
    public static void main(String args[]) {
        NewThread ob1 = new NewThread("one", 1000);
        NewThread ob2 = new NewThread("two", 4000);
        NewThread ob3 = new NewThread("three", 2000);
        NewThread ob4 = new NewThread("four", 500);
    }
}
