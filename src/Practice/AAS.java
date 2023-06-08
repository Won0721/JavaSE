package Practice;

public class AAS {

}
import java.util.Arrays;
import java.util.List;

class Solution {
    public String solution(String s) {
        String answer = "";
        //1. 문자열에 공백을 ","로 치환
        String noBound = s.replaceAll(" ", ",");
	        //2. ","를 기준으로 문자배열에 넣기
	        String[] strArr = noBound.split(",");
        //3. 정수 배열을 생성 -> 값 비교를 위해서
        int[] intArr = new int[strArr.length];
        for (int i=0; i<intArr.length; i++){
            intArr[i] = Integer.parseInt(strArr[i]);
        }
        int big = intArr[0];
        int small = intArr[0];
        for(int j=0; j<intArr.length; j++){
            //최솟값
            if(intArr[j] < intArr[0]){
                small = intArr[j];                
            }
            //최댓값
            if(intArr[j] > intArr[0])
                big = intArr[j];
        }
        //4. 최댓값, 최솟값을 문자열로 만들기 위해서 String 변환
        String smallStr = String.valueOf(small);
        String bigStr = String.valueOf(big);
        //5. 문자열 배열에 최댓값, 최솟값 넣기
        String[] answerArr = {smallStr, bigStr};
        //6. 문자열 배열을 공백으로 구분하여 최종적으로 String 반환
        answer = String.join(" ",answerArr);
        return answer;
    }
}