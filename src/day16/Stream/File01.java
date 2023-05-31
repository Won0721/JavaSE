package day16.Stream;

import java.io.*;



public class File01 {
	public static void main(String[] args) throws IOException {
			FileInputStream fis =null; //입력스트림
			FileOutputStream fos = null; // 출력스트림
			fis = new FileInputStream("file.txt"); // 항상 존재하는 파일과 연결해야함
			fos = new FileOutputStream("result.txt"); // 존재하지않으면 파일 생성, 존재하면 파일 덮어쓰기
			
			BufferedInputStream bis = new BufferedInputStream(fis);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			
			int data;
			while((data=fis.read())!=-1){
				// data에 읽어온 바이트를 저장하는데, date 의 값이 -1이 아닐 때까지
				// -1 : EOF(End of File)
				bos.write(data);
			}
			// 파일과의 연결을 닫는 작업
			bos.close();
			bis.close();
			
	}
}
