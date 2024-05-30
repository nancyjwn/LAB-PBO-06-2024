import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    private static int jumlah_data_sumber = 4;
    private static int JUMLAH_BOT = 3;
    private static int dataLoaded;

    public static void main(String[] args) {
        System.out.println(String.format("Start load %d data", jumlah_data_sumber));

        ExecutorService executor =  Executors.newSingleThreadExecutor();
        ExecutorService executorService = Executors.newFixedThreadPool(JUMLAH_BOT);

        UiThread uhuy = new UiThread();
        for (int i = 1; i <= jumlah_data_sumber; i++) {
            Bot bot = new Bot();

            executor.execute(uhuy);
            executorService.execute(bot);
        }

        executorService.shutdown();
        while (!executorService.isTerminated()) {
        }

        uhuy.eits();
        executor.shutdown();
        while (!executor.isTerminated()) {
            
        }


        System.out.println("Task Finish");
        System.out.println("Time Execution: " + uhuy.jumlah);
        if (dataLoaded == jumlah_data_sumber){
           System.out.println("All Data are successfully Loaded");
        }else{
            jumlah_data_sumber -= dataLoaded;
            System.out.printf("%d Successfully Loaded & %d Data failed to Load", dataLoaded, jumlah_data_sumber );
        }

    }

    public static synchronized void increaseDataLoaded() {
        dataLoaded++;
    }
}

class Bot extends Thread {

    public void run() {
        int d = TaskTimeHelper.getTaskExecutionTime();
        if(d > 4){
            System.out.println("Request Time Out");
        }else{
            try {
                Thread.sleep(d * 1000);
                // System.out.println(String.format("Data %d berhasil diload", dataId));
                Main.increaseDataLoaded();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
    }
}

class UiThread extends Thread{
    boolean yes = true;
    int jumlah;

    public void run(){
        while (yes) {
            jumlah++;
            try {
                Thread.sleep(1000);
                System.out.printf("Loading...(%ds)\n", jumlah);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            
        }
    }

    public void eits(){
        yes = false;
    }
}

class TaskTimeHelper {
    public static int getTaskExecutionTime() {
        return (int) (Math.random() * 6) + 1;
    }
}