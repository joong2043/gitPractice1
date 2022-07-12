import com.ll.exam.Rq;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {
    @Test
    public void 문장을_스캐너의_입력으로_설정() {
        // 입력을 문장화
        String input = """
                등록
                명언1
                작가1
                """.stripIndent();
        InputStream in = new ByteArrayInputStream(input.getBytes());
        Scanner sc = new Scanner(in);

        String cmd1 = sc.nextLine().trim();
        String content = sc.nextLine().trim();
        String author = sc.nextLine().trim();


        // 출력을 문장화

    }

    @Test
    public void 포준출력을_리다이렉션하여_결과를_문자열로_받기() throws IOException {
        // 표준출력을 리다이렉션
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        System.out.println("안녕");

        String rs = output.toString().trim();

        // 표준출력을 원상복구

        System.setOut(new PrintStream(new FileOutputStream(FileDescriptor.out)));

        output.close();

        assertEquals("안녕", rs);
    }

    @Test
    public void Rq__getIntParam(){
        Rq rq = new Rq("삭제?id=1");

        int id = rq.getIntParam("id",0);

        assertEquals(1,id);
    }

    @Test
    public void Rq__getIntParam__2(){
        Rq rq = new Rq("검색?id=10&no=1");

        int id = rq.getIntParam("id",0);
        int no = rq.getIntParam("no",0);

        assertEquals(10,id);
        assertEquals(1,no);
    }

    @Test
    public void Rq__getPath(){
        Rq rq = new Rq("삭제?id=1");

        String path = rq.getPath();

        assertEquals("삭제",path);
    }
}
