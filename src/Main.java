public class Main {
    public static void main(String[] args) {
        int[] arr1 = {2, 6, 8, 23, 57, 76};
        int[] arr2 = {-5, 6, 79, 64, 48};
        int[] arr3 = {-56, 7, 24, 90, 45};
        SaveInFile sif1 = new SaveInFile(arr1, "newfile1.txt", "thr1");
        SaveInFile sif2 = new SaveInFile(arr2, "newfile2.txt", "thr2");
        SaveInFile sif3 = new SaveInFile(arr3, "newfile3.txt", "thr3");
        sif1.start();
        sif2.start();
        sif3.start();
        System.out.println("Поток пошел");
    }
}
