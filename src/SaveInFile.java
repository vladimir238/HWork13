import java.io.*;

public class SaveInFile implements Runnable {

    private int[] arr;
    private String fileName;
    private String threadName;
    private Thread thread;

    public SaveInFile(int[] arr, String fileName, String threadName) {
        this.arr = arr;
        this.fileName = fileName;
        this.threadName = threadName;
        thread = new Thread(this);
    }

    public void start() {
        thread.start();
    }

    @Override
    public void run() {
        System.out.println("Запуск потока " + threadName);

        try (FileOutputStream fs = new FileOutputStream(fileName);
             PrintStream ps = new PrintStream(fs)) {

            for (int i = 0; i < arr.length; i++) {
                ps.print(arr[i] + " , ");
            }
            ps.close();
            fs.close();


        } catch (IOException e) {
            System.out.println("Ошибка " + e.getMessage());
        }
        System.out.println("End thread: " + threadName);

    }

}

