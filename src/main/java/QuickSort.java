import java.util.ArrayList;
import java.util.List;

public class QuickSort {

    private List<Integer> dataSource;

    public QuickSort(List<Integer> data) {
        this.dataSource = new ArrayList<>(data);
    }

    public List<Integer> sort(){
        quickSort(0,dataSource.size()-1);
        return dataSource;
    }


    private void quickSort( int left , int right){
        if(left >= right){
            return;
        }
        int pivot = dataSource.get(right);
        int border = left-1;
        int i = left;
        while(i<right){
            if (dataSource.get(i) < pivot){
                border++;
                if (border != i ){
                    swap(border, i , dataSource);
                }
            }
            i++;
        }
        border++;
        if (border!=right){
            swap(border , right , dataSource);
        }
        quickSort(left  , border-1);
        quickSort(border+1 , right );
    }

    private void swap(int from , int to , List<Integer> data){
        int tmp = data.get(from);
        data.set(from , data.get(to));
        data.set(to,tmp );
    }
}
