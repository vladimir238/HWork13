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
        thread = new Thread(this, "SThread");
    }

    public void start() {
        thread.start();
    }

    @Override
    public void run() {
        System.out.println("Запуск потока");
        FileOutputStream fs = null;
        try {
            fs = new FileOutputStream(fileName);
            PrintStream ps= new PrintStream(fs);

            for (int i = 0; i < arr.length; i++) {
               ps.print(arr[i]+" , ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}

