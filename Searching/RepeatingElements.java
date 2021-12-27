public class RepeatingElements {
    
    //Finding the repeating elements
    //Contitions given :- 
    // 1). only one element can repeat
    // 2). all elements int the range should present =>  0 <= elements range <= Arraylength - 2
    // 3). Time Complexity = O(n) ,
    // 4). NO modification allowed in the given array
    static int repeatedElement( int[] arr ){
        boolean[] visited = new boolean[arr.length];
        for(int i = 0; i < arr.length; ++i ){
            visited[i] = false;
        }
        for(int i = 0; i < arr.length; ++i ){
            if( visited[arr[i]] )
                return arr[i];
            visited[ arr[i] ] = true;
        }
        return Integer.MIN_VALUE;
    }

    public static void main(String[] args) {
        int[] arr = {0,1, 2, 1, 3, 5 , 1, 4};
        int result = repeatedElement(arr);
        if( result == Integer.MIN_VALUE )
            System.out.println("No repeated element");
        else
            System.out.println("Repeated Element : " + result );

    }
}
