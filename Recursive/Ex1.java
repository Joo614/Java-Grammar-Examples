public class Ex1 {
    public static void main(String[] args) {

        System.out.println("1부터 5까지의 합은 : " + sum(5));

        /*static int sum (int num) {
              return num;
        }*/
        //위 식과 처럼 조건 없이 없을 때, sum(5)를 선언한다면 원래는 그냥 5가 출력됨
        //근데 밑에 조건문으로 else 부분에 sum(5)일 경우 -> 5 + sum(4) 를 불러오래
        //여기서 sum(4)는 다시 저 식의 num 에 4를 대입한 것과 같기 때문에 4 + sum(3)이 됨
        //이렇게 3 + sum(2) / 2 + sum(1) 로 점점 쪼개지다가 num 이 1이 되면
        //위에 if 문 에서 이 식을 멈추기 위해 조건으로 1을 리턴하라고 되어있음 -> else 조건식 건너뛰고 1 반환
        // -> 결국은 5 + 4 + 3 + 2 + 1 이 되는 것

    }
    static int sum (int num) { //1부터 num 에 들어갈 숫자까지의 합계를 구할건데
        if (num == 1) return 1; //만약 num 이 1이면 1리턴하고
        else return num + sum(num - 1); //아닐 경우 Sum 의 첫번째 요소 + Sum 의 나머지 요소가 담긴 것
        //Ex. num = 5
        //5+(1~4) 4+(1~3) 3+(1~2) 2+(1) 1+() 이렇게 점점 작아져서 가장 작은 요소까지 쪼개진 후,
        //1+() 2+(1) 3+(3) 4+(6) 5+(10) 이렇게 다시 점점 더해지면서 돌아옴 => 15가 됨
    }
}