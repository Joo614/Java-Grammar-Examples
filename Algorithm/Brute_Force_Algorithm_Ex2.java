public class Brute_Force_Algorithm_Ex2 {
    // 문열 매칭 알고리즘 (Brute-Force String Matching) //
    // 길이가 n인 전체 문자열과 길이가 m인 문자열 패턴을 포함하는지를 검색 //

    public boolean BruteForceStringMatch (int[] arr, int[] patternArr) {
        //Brute Force 문자열 매칭을 구현
        //입력 -> n(arr.length) 개의 문자 텍스트를 나타내는 배열 T / m(patternArr.length) 개의 문자 패턴을 나타내는 배열 P
        //출력 -> 일치하는 문자열이 있으면 첫번째 인덱스 반환 / 검색 실패한 경우 -1 반환

        int n = arr.length;
        int m = patternArr.length;

        for (int i = 0; i < n - m; i++) { //패턴과 비교할 위치 잡기 위해 반복
            // 전체 요소 - 패턴 개수 만큼 반복 -> 그 수가 마지막 비교 요소
            int j = 0;
            while (j < m && patternArr[j] == arr[i + j]) { //순회하면서 전체 패턴 요소 하나하나 비교
                //j가 패턴 개수보다 커지면 안돼서 그의 개수만큼만 반복
                //패턴의 j 인덱스와 전체의 i+J 인덱스의 값이 같은지 판단
                j = j + 1; //같을 경우 j에 1씩 더함
            }
            if (j == m) { //j와 패턴의 요소 수가 같을 경우 -> 패턴의 문자열과 완전히 같은 부분이 존재
                return true; //그럴 경우 비교했던 위치 반환
            }
        }
        return false;
    }
}
