package cond.ex;

public class MoveRateEx {
    public static void main(String[] args) {
        //요청한 평점 이상의 영화를 찾아서 추천하는 프로그램을 작성하자.
        // 어바웃타임 - 평점 9
        // 토이스토리 - 평점 8
        // 고질라 - 평점 7
        //평점 변수는 double rating 을 사용하세요. if문을 활용해서 문제를 풀자.

        double rating = 7.2;

        if (rating <= 9){
            System.out.println("'어바웃타임'를 추천합니다.");
        }
        
        if (rating <= 8){
            System.out.println("'토이스토리'를 추천합니다.");
        }
        
        if (rating <= 7){
            System.out.println("'고질라'를 추천합니다.");
        }
    }
}
