public class BubbleSort {
    public static void bubbleSort(int [] list){
        for (int i = 0; i < list.length -1; i++){
            for (int j = 0; j < list.length - i - 1; j ++){
                if (list[j] > list[j + 1]){
                    int term = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = term;
                }
                }
            }
        }
    }

    class test{
        public static void main(String[] args) {
            int [] list = {1,5,2,3,6,4,7,8,9};
            BubbleSort.bubbleSort(list);
            for(int x : list){
                System.out.println(x);
            }
        }
    }
