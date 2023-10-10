package board.testboard;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("board.testboard.mapper")
public class TestBoardApplication {
	public static void main(String[] args) {
		SpringApplication.run(TestBoardApplication.class, args);
	}
}
