import java.util.Arrays;

public class ListEsitlik {
    public static void main(String[] args) {
        int[] list={3,8,6,78,8,2,9,1,87,3,9,1};
        int[] dublicate=new int[list.length];
        int startIndex=0;
        for (int i=0;i< list.length;i++){
            for (int j=0; j< list.length;j++){
                if ((i!=j)&& (list[i]==list[j])){
                    dublicate[startIndex++]=list[i];
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(dublicate));
    }
}
