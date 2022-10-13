package thuchanh2;

import java.util.List;

public class FindMaxValue {
    public static int findMax(List<Integer> number){
        int max = number.get(0);
        for (int i = 0; i < number.size(); i++) {
            if (max<number.get(i)){
                max = number.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        String PATH_NUMBER = "D:\\MD2\\Bai_16\\Bai16_ThucHanh\\src\\thuchanh2\\numbers.txt";
        String PATH_RESULT = "D:\\MD2\\Bai_16\\Bai16_ThucHanh\\src\\thuchanh2\\result.txt";
        List<Integer> numbers = readAndWriteFile.readFile(PATH_NUMBER);
        int maxValue = findMax(numbers);
        readAndWriteFile.writeFile(PATH_RESULT, maxValue);
    }
}
