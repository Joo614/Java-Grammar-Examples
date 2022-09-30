public class Brute_Force_Algorithm_Ex3 {
    // 선택 정렬 알고리즘 (Selection Sort) //
    // 전체 배열을 순환하면서 현재 요소와 그 다음 요소의 크기를 비교하여 컬렉션이 완전히 정렬될 때까지 현재 요소보다 더 작거나 큰 요소(오름차순 또는 내림차순에 따라)의 자리를 교환하는 정렬 알고리즘 //

    public int[] SelctionSort (int[] arr) {
        //주어진 배열을 Selection Sort 로 오름차순 정렬
        //입력 -> 정렬 가능한 요소의 배열 A
        //출력 -> 오름차순으로 정렬된 배열

        for (int i = 0; i < arr.length -1; i++) { //0번째 인덱스부터 마지막 요소까지 반복
            //현재 위치에 가장 작은 값을 넣을 것
            int min = i; //현재 인덱스를 min 에 할당
            for (int j = i + 1; j < arr.length; j++) { //j를 i+1로 하고 i 이후의 배열요소와 비교
                if (arr[j] < arr[min]) { //j 인덱스의 배열 값이 최소값 인덱스 min 에 할당된 i의 배열 값보다 작다면
                    min = j; //j 인덱스가 최소니까 j를 min 에 할당
                }
            }
            //반복문이 끝나면 min 에는 최소값의 인덱스가 들어있을 것
            int temp = arr[i]; //i 값과 최소값을 바꿔서 할당
            arr[i] = arr[min];
            arr[min] = temp;
        }
        return arr; //정렬된 배열 반환
    }
}
