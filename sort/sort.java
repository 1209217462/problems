import java.util.*;
import java.util.Collections;

/**
 * Created by rayfay-nb-001 on 2017/10/10.
 */
public class sort {

    public static void main(String[] args) {
        int arr[]={8,4,5,3,2,6,7,9,1};
        System.out.println("bubble:\n"+ Arrays.toString(bubbleSort(arr)));reset(arr);
        System.out.println("select:\n"+Arrays.toString(selectSort(arr)));reset(arr);
        System.out.println("insert:\n"+ Arrays.toString(insertSort(arr)));reset(arr);

    }

    /**冒泡排序
     *
     *
     *
     */
    public static int[] bubbleSort(int []arr){
        int len=arr.length;
        for(int i = 0 ; i < len-1; i ++) {
            for(int j = 0 ;j < len-1 ; j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }

    /**
    * 快速排序<br/>
    * <li>从数列中挑出一个元素，称为“基准”</li>
    * <li>重新排序数列，所有元素比基准值小的摆放在基准前面，所有元素比基准值大的摆在基准的后面（相同的数可以到任一边）。在这个分割之后，
    * 该基准是它的最后位置。这个称为分割（partition）操作。</li>
    * <li>递归地把小于基准值元素的子数列和大于基准值元素的子数列排序。</li>
    */
    public static void quickSort(int[] numbers, int start, int end) {
        if (start < end) {
            int base = numbers[start]; // 选定的基准值（第一个数值作为基准值）
            int temp; // 记录临时中间值
            int i = start, j = end;
            do {
                while ((numbers[i] < base) && (i < end))
                    i++;
                while ((numbers[j] > base) && (j > start))
                    j--;
                if (i <= j) {
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                    i++;
                    j--;
                }
            } while (i <= j);
            if (start < j)
                quickSort(numbers, start, j);
            if (end > i)
                quickSort(numbers, i, end);
        }
    }

    /**
     * 直接插入排序
     * 每一步将一个待排序的记录，插入到前面已经排好序的有序序列中去，直到插完所有元素为止。
     */
    public static int[] insertSort(int[] numbers){
        for (int i = 1; i < numbers.length; i++) {
            int j=i;
            while (j>0 && numbers[j] < numbers[j-1] ){
                swap(numbers,j,j-1);
                j--;
            }
        }

        return numbers;
    }


    /**
     *  选择排序
     * <li>在未排序序列中找到最小元素，存放到排序序列的起始位置</li>
     * <li>再从剩余未排序元素中继续寻找最小元素，然后放到排序序列末尾。</li>
     * <li>以此类推，直到所有元素均排序完毕。</li>
     */
    public static int[] selectSort(int[] numbers) {
        int size = numbers.length;
        for (int i = 0; i < size-1; i++) {
            int min_index = i;
            for (int j=i+1;j<size;j++)  {
                if (numbers[j] < numbers[min_index]) {
                    min_index = j;
                }
            }

            if (min_index!=i) {
                swap(numbers, i, min_index);
            }
        }
        return numbers;
    }







    public static void swap(int []arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }

    public static int[] shuffle(int [] arr) {
        Random random=new Random();
        int rand=0;
        for (int i = 0; i < arr.length; i++) {
            rand=Math.abs( random.nextInt(arr.length));
            swap(arr,i,rand);
        }
        return arr;
    }

    public static void reset(int[] arr){
        shuffle(arr);
        System.out.println(Arrays.toString(arr));
    }
}
