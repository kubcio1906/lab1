public class zad3 {
    public static void main(String[] args) {
        int[] array = new int[]{  4, 5, 7, 11, 12, 15, 15, 21, 40, 45 };
        var index = searchIndex(array, 45);
        System.out.println(index);
    }
    public static int searchIndex(int[] array,int value)
    {

        var index = 0;
        var limit = array.length-1;
        while(index<= limit){
            var point = Math.ceil((index + limit) / 2);

            var entry = array[(int) point];

            if(value >entry)
            {
                index = (int)point+1;

                continue;

            }
             if(value < entry)
            {
                limit = (int) point -1;

                continue;

            }
            return (int)point;
            }
        return -1;
        }

    }




