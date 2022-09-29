public class Brute_Force_Algorithm_Ex1 {
    // 순차 검색 알고리즘 (Sequential Search) //
    // 배열 안에 특정 값이 존재하는지 검색할 때 인덱스 0부터 마지막 인덱스까지 차례대로 검색 //

    public boolean SequentialSearch (int[] arr, int a) {
        //검색 키 a를 사용하여 순차 검색 구현
        //입력 -> n개의 요소를 갖는 배열 arr 과 검색 키 a
        //결과를 저장할 boolean result 선언, 초기값은 false
        //출력 -> a 값과 같은 요소 인덱스 or 요소가 없을 때 false

        boolean result = false;
        for (int i = 0; i < arr.length; i++) { //arr 의 크기만큼 순회하다가
            if (arr[i] == a) { //arr 의 i번째 요소가 a와 같으면 true 를 리턴
                result = true;
            }
        }
        return result;
        //배열을 순회하는 도중, 해당 값이 발견되더라도 배열을 모두 순회 후 결과값 리턴
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6};
        int a = 2;

        System.out.println();
    }
}
