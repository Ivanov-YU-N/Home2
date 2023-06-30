import java.util.Arrays;
import java.util.logging.*;

public class BubbleSort{
        
    public static int[] bubbleSort(int[] sortArr){
        
            for (int i = 0; i < sortArr.length - 1; i++) {
                for(int j = 0; j < sortArr.length - i - 1; j++) {
                    if(sortArr[j + 1] < sortArr[j]) {
                        int swap = sortArr[j];
                        sortArr[j] = sortArr[j + 1];
                        sortArr[j + 1] = swap;
                    }
                }
            }
            return sortArr;
        }
        
        public static void main(String args[]) {
            try{
            Logger logger = Logger.getAnonymousLogger(null);
            FileHandler fileHandler = null;
            int[] array = new int[12];
            for (int i = 0; i < array.length; i++) {
                array[i] = ((int)(Math.random() * 100));                
            }
            System.out.println(Arrays.toString(array));
            int[] temp1 = bubbleSort(array);
            System.out.println(Arrays.toString(temp1));
            fileHandler = new FileHandler("log.txt");
            logger.addHandler(fileHandler);
            logger.info("Запись успешно выполнена");
        } catch (Exception e){
            System.out.println("Error");
            // logger.warning("Ошибка записи в файл");
        }
        }
    }

    