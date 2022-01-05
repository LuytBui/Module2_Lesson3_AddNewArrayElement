import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final int MAX_LENGTH = 15;
        final int DEFAULT_ELEMENT = 0;
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);

        // nhập kích thước mảng
        do {
            System.out.print("Nhập số lượng phần tử: ");
            size = scanner.nextInt();
            if (size > MAX_LENGTH)
                System.out.printf("Số lượng phần tử phải nhỏ hơn %d", MAX_LENGTH);
        } while (size > MAX_LENGTH);

        // khởi tạo mảng
        array = new int[MAX_LENGTH];
        Arrays.fill(array, DEFAULT_ELEMENT);   // điền toàn bộ mảng với giá trị DEFAULT_ELEMENT
        // không cần dòng này cũng được, vì mặc định khởi tạo là mảng toàn số 0
        // nhưng để dòng này khi nếu cần thay đổi giá trị mặc định

        // nhập giá trị từng phần tử
        int i = 0;
        while (i < size) {
            int input;
            do {
                System.out.print("Enter element " + i + " : ");
                input = scanner.nextInt();
            } while (input == DEFAULT_ELEMENT);
            array[i] = input;
            i++;
        }

        // in mảng
        System.out.printf("%-12s", "array:  ");
        for (int j = 0; j < array.length; j++) {
            if (array[j] == DEFAULT_ELEMENT)
                break;
            System.out.print(array[j] + "\t");
        }

        // thêm phần tử
        System.out.println("Nhập giá trị muốn thêm: ");
        int X = scanner.nextInt();
        System.out.println("Nhập vị trí chèn: ");
        int index = scanner.nextInt();

        if (index < 0 || index > size) {
            System.out.printf("Không chèn được vào vị trí %d.\n", index);
        } else {
            for (int j = size; j > index; j--) {
                array[j] = array[j-1];
            }
            array[index] = X;
        }

        // in mảng
        System.out.printf("%-12s", "array:  ");
        for (int j = 0; j < array.length; j++) {
            if (array[j] == DEFAULT_ELEMENT)
                break;
            System.out.print(array[j] + "\t");
        }

    }
}
