package onboarding;

import java.util.List;

class Problem1 {
    public static int solution(List<Integer> pobi, List<Integer> crong) {
        int answer = Integer.MAX_VALUE;
        return answer;
    }

    public int sumPageEachDigitNum(Integer pageNum) {
        int eachDigitNumSum = 0;
        while(pageNum != 0) {
            eachDigitNumSum += pageNum % 10;
            pageNum /= 10;
        }
        return eachDigitNumSum;
    }

    public int multiplyPageEachDigitNum(Integer pageNum) {
        int eachDigitNumMultiplication = 1;
        while(pageNum != 0) {
            eachDigitNumMultiplication *= pageNum % 10;
            pageNum /= 10;
        }
        return eachDigitNumMultiplication;
    }

    public int getPlayerScore(List<Integer> player) {
        Integer leftPageNum = player.get(0);
        Integer rightPageNum = player.get(1);
        int leftPageLargerNum = Math.max(sumPageEachDigitNum(leftPageNum), multiplyPageEachDigitNum(leftPageNum));
        int rightPageLargerNum = Math.max(sumPageEachDigitNum(rightPageNum), multiplyPageEachDigitNum(rightPageNum));
        return Math.max(leftPageLargerNum, rightPageLargerNum);
    }
}