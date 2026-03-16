package linear_ds;

import java.util.Arrays;

public class ArrayList {
    private int [] nums;
    private int count = 0;

    public ArrayList(int length) {
        nums = new int[length];
    }

    public void insert(int item) {
        if(nums.length == count){
            int[] newArray = new int[count * 2];
            for(int i = 0; i < nums.length; i++)
                newArray[i] = nums[i];
            nums = newArray;
        }
        nums[count++] = item;
    }

    public void removeAt(int index){
        if(index < 0 || index >= count)
            throw new IllegalArgumentException();

        for(int i = index; i < count - 1; i++)
            nums[i] = nums[i + 1];

        count--;
    }

    @Override
    public String toString() {
        return "ArrayList{" +
                "nums=" + Arrays.toString(Arrays.copyOfRange(nums, 0, count)) +
                '}';
    }
}
